package bean;

public class TinA {
	private String msv;
	private String hoten;
	private Double diemwin;
	private Double diemword;
	public TinA(String msv, String hoten, Double diemwin, Double diemword) {
		super();
		this.msv = msv;
		this.hoten = hoten;
		this.diemwin = diemwin;
		this.diemword = diemword;
	}
	public Double DTB() {
		return (this.diemwin + this.diemword)/2;
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
	public Double getDiemwin() {
		return diemwin;
	}
	public void setDiemwin(Double diemwin) {
		this.diemwin = diemwin;
	}
	public Double getDiemword() {
		return diemword;
	}
	public void setDiemword(Double diemword) {
		this.diemword = diemword;
	}
	@Override
	public String toString() {
		return msv + ";" + hoten + ";" + diemwin + ";" + diemword + ";" + this.DTB();
	}
	
	
	
	
}
