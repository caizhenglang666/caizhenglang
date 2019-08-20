package com.aowin.library.model;
import java.io.Serializable;
import java.util.Date;
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer u_userid;
	private String u_username;
	private String u_password;
	private String u_idcard;
	private String u_phone;
	private Date u_createtime;
    private Integer u_status;
    private double u_ownmoney;
	public User() {
		super();
	}
	public User(String u_username, String u_password, String u_idcard, String u_phone, Date u_createtime,
			Integer u_status, double u_ownmoney) {
		super();
		this.u_username = u_username;
		this.u_password = u_password;
		this.u_idcard = u_idcard;
		this.u_phone = u_phone;
		this.u_createtime = u_createtime;
		this.u_status = u_status;
		this.u_ownmoney = u_ownmoney;
	}
	public Integer getU_userid() {
		return u_userid;
	}
	public void setU_userid(Integer u_userid) {
		this.u_userid = u_userid;
	}
	public String getU_username() {
		return u_username;
	}
	public void setU_username(String u_username) {
		this.u_username = u_username;
	}
	public String getU_password() {
		return u_password;
	}
	public void setU_password(String u_password) {
		this.u_password = u_password;
	}
	public String getU_idcard() {
		return u_idcard;
	}
	public void setU_idcard(String u_idcard) {
		this.u_idcard = u_idcard;
	}
	public String getU_phone() {
		return u_phone;
	}
	public void setU_phone(String u_phone) {
		this.u_phone = u_phone;
	}
	public Date getU_createtime() {
		return u_createtime;
	}
	public void setU_createtime(Date u_createtime) {
		this.u_createtime = u_createtime;
	}
	public Integer getU_status() {
		return u_status;
	}
	public void setU_status(Integer u_status) {
		this.u_status = u_status;
	}
	public double getU_ownmoney() {
		return u_ownmoney;
	}
	public void setU_ownmoney(double u_ownmoney) {
		this.u_ownmoney = u_ownmoney;
	}
	@Override
	public String toString() {
		return "User [u_userid=" + u_userid + ", u_username=" + u_username + ", u_password=" + u_password
				+ ", u_idcard=" + u_idcard + ", u_phone=" + u_phone + ", u_createtime=" + u_createtime + ", u_status="
				+ u_status + ", u_ownmoney=" + u_ownmoney + "]";
	}
    
}
