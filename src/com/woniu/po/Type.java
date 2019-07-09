package com.woniu.po;

public class Type {
	private int tid;
	private String tname;
	private String tphoto;
	private String tdesc;
	private int tqzid;
	private int tdel;
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTphoto() {
		return tphoto;
	}
	public void setTphoto(String tphoto) {
		this.tphoto = tphoto;
	}
	public String getTdesc() {
		return tdesc;
	}
	public void setTdesc(String tdesc) {
		this.tdesc = tdesc;
	}
	public int getTqzid() {
		return tqzid;
	}
	public void setTqzid(int tqzid) {
		this.tqzid = tqzid;
	}
	public int getTdel() {
		return tdel;
	}
	public void setTdel(int tdel) {
		this.tdel = tdel;
	}
	public Type(int tid, String tname, String tphoto, String tdesc, int tqzid, int tdel) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.tphoto = tphoto;
		this.tdesc = tdesc;
		this.tqzid = tqzid;
		this.tdel = tdel;
	}
	public Type() {
		super();
	}
	@Override
	public String toString() {
		return "Type [tid=" + tid + ", tname=" + tname + ", tphoto=" + tphoto + ", tdesc=" + tdesc + ", tqzid="
				+ tqzid + ", tdel=" + tdel + "]";
	}
	
}
