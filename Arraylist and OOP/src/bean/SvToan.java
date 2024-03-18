package bean;

public class SvToan {
	private String masv;
	private String hoten;
	private Double dm1;
	private Double dm2;
	private Double dm3;
	public SvToan(String masv, String hoten, Double dm1, Double dm2, Double dm3) {
		super();
		this.masv = masv;
		this.hoten = hoten;
		this.dm1 = dm1;
		this.dm2 = dm2;
		this.dm3 = dm3;
	}
	public Double DTB() {
		return (this.dm1 + this.dm2 + this.dm3)/3;
	}
	public String getMasv() {
		return masv;
	}
	public void setMasv(String masv) {
		this.masv = masv;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public Double getDm1() {
		return dm1;
	}
	public void setDm1(Double dm1) {
		this.dm1 = dm1;
	}
	public Double getDm2() {
		return dm2;
	}
	public void setDm2(Double dm2) {
		this.dm2 = dm2;
	}
	public Double getDm3() {
		return dm3;
	}
	public void setDm3(Double dm3) {
		this.dm3 = dm3;
	}
	@Override
	public String toString() {
		return masv + "|" + hoten + "|" + dm1 + "|" + dm2 + "|" + dm3;
	}
	
	
}
