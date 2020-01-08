package cn.zj.ssm.pojo;

import java.sql.Date;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private String phone;
    private String email;
    private Date time;
	
    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(Integer id, String username, String password, Integer age,
			String phone, String email, Date time) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.age = age;
		this.phone = phone;
		this.email = email;
		this.time = time;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Integer getAge() {
		return age;
	}


	public void setAge(Integer age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Date getTime() {
		return time;
	}


	public void setTime(Date time) {
		this.time = time;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password="
				+ password + ", age=" + age + ", phone=" + phone + ", email="
				+ email + ", time=" + time + "]";
	}
    
    
}
