package com.atworks.kjh.DTO;

import java.sql.Date;

public class MemberDTO {
	private int u_idx;
	private String u_id;
	private String u_pwd;
	private String u_name;
	private String u_tel;
	private String u_birth;
	private String u_wedding;
	private String u_p_birth;
	private String u_email;
	private String u_address;
	private Date u_start_date;
	
	public int getU_idx() {
		return u_idx;
	}
	public String getU_id() {
		return u_id;
	}
	public String getU_pwd() {
		return u_pwd;
	}
	public String getU_name() {
		return u_name;
	}
	public String getU_tel() {
		return u_tel;
	}
	public String getU_birth() {
		return u_birth;
	}
	public String getU_wedding() {
		return u_wedding;
	}
	public String getU_p_birth() {
		return u_p_birth;
	}
	public String getU_email() {
		return u_email;
	}
	public String getU_address() {
		return u_address;
	}
	public Date getU_start_date() {
		return u_start_date;
	}
	public void setU_idx(int u_idx) {
		this.u_idx = u_idx;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public void setU_pwd(String u_pwd) {
		this.u_pwd = u_pwd;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public void setU_tel(String u_tel) {
		this.u_tel = u_tel;
	}
	public void setU_birth(String u_birth) {
		this.u_birth = u_birth;
	}
	public void setU_wedding(String u_wedding) {
		this.u_wedding = u_wedding;
	}
	public void setU_p_birth(String u_p_birth) {
		this.u_p_birth = u_p_birth;
	}
	public void setU_email(String u_email) {
		this.u_email = u_email;
	}
	public void setU_address(String u_address) {
		this.u_address = u_address;
	}
	public void setU_start_date(Date u_start_date) {
		this.u_start_date = u_start_date;
	}
}
