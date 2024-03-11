package bean;

import java.util.Date;

public class NhanVienBean extends NguoiBean{
	private String manv;
	private Double hsl;
	private String email;
	private String sdt;
	public NhanVienBean(String hoten, boolean gioitinh, Date ns, String manv, Double hsl, String email, String sdt) {
		super(hoten, gioitinh, ns);
		this.manv = manv;
		this.hsl = hsl;
		this.email = email;
		this.sdt = sdt;
	}
	public String getManv() {
		return manv;
	}
	public void setManv(String manv) {
		this.manv = manv;
	}
	public Double getHsl() {
		return hsl;
	}
	public void setHsl(Double hsl) {
		this.hsl = hsl;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	@Override
	public String toString() {
		return super.toString() + ",manv=" + manv + ", hsl=" + hsl + ", email=" + email + ", sdt=" + sdt ;
	}

}
