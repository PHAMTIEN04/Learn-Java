package view;


import java.util.Scanner;

import bo.NguoiBo;
import dao.NguoiDao;

public class hienthinguoi {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		try {
			System.out.println("** Danh Sach Nguoi **");
			NguoiBo n = new NguoiBo();
			n.getds();
			n.HienThi();
			Scanner nhap = new Scanner(System.in);
			System.out.println("**Tim Kiem**");
			System.out.print("Nhap ho ten: ");
			String key_name = nhap.nextLine(); 
			n.TimKiem(key_name);
			n.HienThi_nv();
			n.HienThi_hs();
			n.Danh_gia_d();
			n.Danh_gia_r();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}


	}

}
