package view;

import bo.sinhvienbo;

public class hienthisv {
	public static void main(String[] args)
	{
		try {
			sinhvienbo sv1 = new sinhvienbo();
			sv1.getsinhvien();
			sv1.Hienthi();
			sv1.Timkiem();
			sv1.Them();
			sv1.Hienthi();
			sv1.Xoa();
			sv1.Hienthi();
			sv1.Sua();
			sv1.Hienthi();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
