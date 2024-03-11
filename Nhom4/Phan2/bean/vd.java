package bean;

import bo.sinhvienbo;
import dao.sinhviendao;

public class vd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sinhvienbean sv = new sinhvienbean("Sv2", "Bac", "K46", 8.5);
		sv.setMasv("s1");
		System.out.println(sv.toString());
		try {
			sinhvienbo sv1 = new sinhvienbo();
			sv1.getsinhvien();
			sv1.Hienthi();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
