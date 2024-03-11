package bean;

import java.util.Date;

public class Hocsinhbean extends NguoiBean{
	private String mahs;
	private String tentruong;
	private String tenlop;
	private Double dtb;
	public Hocsinhbean(String hoten, boolean gioitinh, Date ns, String mahs, String tentruong, String tenlop,
			Double dtb) {
		super(hoten, gioitinh, ns);
		this.mahs = mahs;
		this.tentruong = tentruong;
		this.tenlop = tenlop;
		this.dtb = dtb;
	}
	public String getMahs() {
		return mahs;
	}
	public void setMahs(String mahs) {
		this.mahs = mahs;
	}
	public String getTentruong() {
		return tentruong;
	}
	public void setTentruong(String tentruong) {
		this.tentruong = tentruong;
	}
	public String getTenlop() {
		return tenlop;
	}
	public void setTenlop(String tenlop) {
		this.tenlop = tenlop;
	}
	public Double getDtb() {
		return dtb;
	}
	public void setDtb(Double dtb) {
		this.dtb = dtb;
	}
	@Override
	public String toString() {
		return mahs+"," + super.toString()+","  + tentruong +","  + tenlop +","  + dtb  ;
	}
	
}
