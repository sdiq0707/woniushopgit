package com.woniu.po;

public class Role {
	private int rid;
	private String rname;
	private int rdel;
	public int getRid() {
		return rid;
	}
	public void setRid(int rid) {
		this.rid = rid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public int getRdel() {
		return rdel;
	}
	public void setRdel(int rdel) {
		this.rdel = rdel;
	}
	public Role(int rid, String rname, int rdel) {
		super();
		this.rid = rid;
		this.rname = rname;
		this.rdel = rdel;
	}
	public Role() {
		super();
	}
	@Override
	public String toString() {
		return "Role [rid=" + rid + ", rname=" + rname + ", rdel=" + rdel + "]";
	}
	
	
}
