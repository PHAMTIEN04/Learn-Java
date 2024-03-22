package view;

import java.util.Scanner;

import bo.Tinbo;

public class HienThiTin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Tinbo tb = new Tinbo();
			tb.getds();
			tb.HienThi();
			System.out.print("Tim Kiem Ho Ten:");
			Scanner nhap = new Scanner(System.in);
			String key_ht = nhap.nextLine();
			tb.TimKiemTuongDoi(key_ht);
			tb.LuuFile();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
