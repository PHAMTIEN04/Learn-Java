package bean;

public class TinB {
	private String msv;
	private String hoten;
	private Double diemex;
	private Double diempw;
	private Double diemweb;
	public TinB(String msv, String hoten, Double diemex, Double diempw, Double diemweb) {
		super();
		this.msv = msv;
		this.hoten = hoten;
		this.diemex = diemex;
		this.diempw = diempw;
		this.diemweb = diemweb;
	}
	
	public Double DTB() {
		return (this.diemex + this.diempw + this.diemweb)/3;
	}
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Double getDiemex() {
		return diemex;
	}
	public void setDiemex(Double diemex) {
		this.diemex = diemex;
	}
	public Double getDiempw() {
		return diempw;
	}
	public void setDiempw(Double diempw) {
		this.diempw = diempw;
	}
	public Double getDiemweb() {
		return diemweb;
	}
	public void setDiemweb(Double diemweb) {
		this.diemweb = diemweb;
	}
	@Override
	public String toString() {
		return msv + ";" + hoten + ";" + diemex + ";" + diempw + ";"
				+ diemweb + ";" + this.DTB();
	}
	
}
