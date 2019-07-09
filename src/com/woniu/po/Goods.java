package com.woniu.po;

public class Goods {

	private int gid;
	private String gname;
	private double gprice;
	private int gstock;
	private String gphoto;
	private String gdesc;
	private int tid;
	private int gdel;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public double getGprice() {
		return gprice;
	}
	public void setGprice(double gprice) {
		this.gprice = gprice;
	}
	public int getGstock() {
		return gstock;
	}
	public void setGstock(int gstock) {
		this.gstock = gstock;
	}
	public String getGphoto() {
		return gphoto;
	}
	public void setGphoto(String gphoto) {
		this.gphoto = gphoto;
	}
	public String getGdesc() {
		return gdesc;
	}
	public void setGdesc(String gdesc) {
		this.gdesc = gdesc;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getGdel() {
		return gdel;
	}
	public void setGdel(int gdel) {
		this.gdel = gdel;
	}
	public Goods(int gid, String gname, double gprice, int gstock, String gphoto, String gdesc, int tid, int gdel) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.gprice = gprice;
		this.gstock = gstock;
		this.gphoto = gphoto;
		this.gdesc = gdesc;
		this.tid = tid;
		this.gdel = gdel;
	}
	public Goods() {
		super();
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", gprice=" + gprice + ", gstock=" + gstock + ", gphoto="
				+ gphoto + ", gdesc=" + gdesc + ", tid=" + tid + ", gdel=" + gdel + "]";
	}
	
	
}
