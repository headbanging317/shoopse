package com.acorn.shoopse.manager.dto;

public class ManagerDto {
	private int mem_num;
	private String id;
	private String pwd;
	private String name;
	private String phone;
	private String email;
	private String addr;
	private String regdate;
	private String mem_flag;
	private int point;
	

	public ManagerDto(int mem_num, String id, String pwd, String name, String phone, String email, String addr,
			String regdate, String mem_flag, int point) {
		super();
		this.mem_num = mem_num;
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.addr = addr;
		this.regdate = regdate;
		this.mem_flag = mem_flag;
		this.point = point;
	}

	public ManagerDto() {}

	public int getMem_num() {
		return mem_num;
	}

	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	public String getMem_flag() {
		return mem_flag;
	}

	public void setMem_flag(String mem_flag) {
		this.mem_flag = mem_flag;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "ManagerDto [mem_num=" + mem_num + ", id=" + id + ", pwd=" + pwd + ", name=" + name + ", phone=" + phone
				+ ", email=" + email + ", addr=" + addr + ", regdate=" + regdate + ", mem_flag=" + mem_flag + ", point="
				+ point + "]";
	}
	
}
