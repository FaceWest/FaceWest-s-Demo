package biz;

import java.util.ArrayList;
import java.util.List;

import com.yc.dao.DBHelper;

import Bean.User;


public class UserBiz {
	/*
	 * 
	 */
	public User login(String username ,String userpwd) throws BizException {
		if(username==null||username.trim().isEmpty()) {
			throw new BizException("请输入用户名！");
		}
		if(userpwd==null||userpwd.trim().isEmpty()) {
			throw new BizException("请输入密码！");
		}

		String sql ="select *from user where account =? and pwd=?";
		return DBHelper.unique(sql, User.class,username,userpwd);
		
		
	}

	public List<User> findAll() {
		
		System.out.println(DBHelper.select("select * from user", User.class));
		return DBHelper.select("select * from user", User.class);
	}

	public void add(User user) throws BizException {
		if(user.getName()== null||user.getName().trim().isEmpty()) {
			throw new BizException("请填写用户名");
			
		}
		String sql = "insert into user(name,account,tel,pwd) values(?,?,?,?)";
		DBHelper.insert(sql, user.getName(),user.getAccount(),user.getTel(),user.getPwd());
		
	}

	public Object find(User user) {
		
		String sql = "select * from user where 1=1 ";
		ArrayList<Object> params = new ArrayList<Object>();
		if(user.getAccount()!=null&&user.getAccount().trim().isEmpty()==false) {
			sql+="and account = ?";
			params.add("%"+user.getAccount()+"%");
		}
		if(user.getName()!=null&&user.getName().trim().isEmpty()==false) {
			sql+="and name like ?";
			params.add("%"+user.getName()+"%");
		}
		if(user.getTel()!=null&&user.getTel().trim().isEmpty()==false) {
			sql+="and tel = ?";
			params.add("%"+user.getTel()+"%");
		}
		System.out.println(sql);
		return DBHelper.select(sql, params);
	}

	public User find(String id) {
		
			return DBHelper.unique("select * from user where id =?", User.class, id);
	}
}
