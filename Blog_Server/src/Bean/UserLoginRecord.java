package Bean;

import java.sql.Timestamp;

public class UserLoginRecord implements java.io.Serializable{

	private Long id;
	private String loginIp;
	private Timestamp time;
	private Long userId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLoginIp() {
		return loginIp;
	}
	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "UserLoginRecord [id=" + id + ", loginIp=" + loginIp + ", time=" + time + ", userId=" + userId + "]";
	}
	
	
	
}
