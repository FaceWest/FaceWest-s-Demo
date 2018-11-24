package Bean;

import java.sql.Timestamp;







public class User implements java.io.Serializable{
	private Long id ;
	private String name;
	private String account;
	private String pwd;
	private String tel;
	private String status;
	private Timestamp createDate;// 日期+时间
	private String createBy;
	private String type;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", account=" + account + ", pwd=" + pwd + ", tel=" + tel
				+ ", status=" + status + ", createDate=" + createDate + ", createBy=" + createBy + ", type=" + type
				+ "]";
	}
	
	
	
}
