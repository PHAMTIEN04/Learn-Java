package bean;

public class hangbean {
	private String hang;
	private Double gia;
	
	public hangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public hangbean(String hang, Double gia) {
		super();
		this.hang = hang;
		this.gia = gia;
	}

	public String getHang() {
		return hang;
	}
	public void setHang(String hang) {
		this.hang = hang;
	}
	public Double getGia() {
		return gia;
	}
	public void setGia(Double gia) {
		this.gia = gia;
	}
	@Override
	public String toString() {
		return "hangbean [hang=" + hang + ", gia=" + gia + "]";
	}
	
}
