package bean;

public class hangbean {
	private String ten_hang;
	private int gia;
	
	public hangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public hangbean(String ten_hang, int gia) {
		super();
		this.ten_hang = ten_hang;
		this.gia = gia;
	}

	public String getTen_hang() {
		return ten_hang;
	}
	public void setTen_hang(String ten_hang) {
		this.ten_hang = ten_hang;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}

	@Override
	public String toString() {
		return "hangbean [ten_hang=" + ten_hang + ", gia=" + gia + "]";
	}
	
	
}
