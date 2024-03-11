package bean;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NguoiBean {
	private String hoten;
	private boolean gioitinh;
	private Date ns;
	public NguoiBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public NguoiBean(boolean gioitinh, Date ns) {
		super();
		this.gioitinh = gioitinh;
		this.ns = ns;
	}


	public NguoiBean(String hoten, boolean gioitinh, Date ns) {
		super();
		this.hoten = hoten;
		this.gioitinh = gioitinh;
		this.ns = ns;
	}


	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	

	public boolean isGioitinh() {
		return gioitinh;
	}


	public void setGioitinh(boolean gioitinh) {
		this.gioitinh = gioitinh;
	}


	public Date getNs() {
		return ns;
	}

	public void setNs(Date ns) {
		this.ns = ns;
	}


	@Override
	public String toString() {
		try {
			SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
			String ngay = dd.format(ns);
			return "hoten=" + hoten + ", gioitinh=" + gioitinh + ", ns=" + ngay + ""+"," + getTuoi();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
	public int getTuoi()
	{
		try {
			
			SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
			String ngay = dd.format(ns);
			int namsinh = Integer.parseInt(ngay.split("[/]")[2]);
			//lay ngay
			Date d = new Date();//Lay ngay thang nam hien tai
			String ngay2 = dd.format(d);//doi ngay thanh chuoi
			int namht = Integer.parseInt(ngay2.split("[/]")[2]);
			return namht - namsinh;
		} catch (Exception e) {
			e.printStackTrace();
			return -1;
		}
		
		
	}
	
}
