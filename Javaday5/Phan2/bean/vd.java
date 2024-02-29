package bean;

import dao.sinhviendao;

public class vd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sinhvienbean sv =new sinhvienbean("Sv2","Bac","k46",8.5);
		sv.setMasv("Sv1");
		System.out.println(sv.getMasv());
		System.out.println(sv.getHoten());
		System.out.println(sv.toString());
		hangbean hb = new hangbean("Pizza",10000);
		System.out.println(hb.toString());

	}

}
