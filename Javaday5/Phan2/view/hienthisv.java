package view;

import bo.sinhvienbo;


public class hienthisv {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			sinhvienbo sv_b = new sinhvienbo();
			sv_b.getsinhvien();
			sv_b.HienThi();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
