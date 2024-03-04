package view;

import java.util.Scanner;

import bo.sinhvienbo;


public class hienthisv {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			sinhvienbo sv_b = new sinhvienbo();
			sv_b.getsinhvien();
			sv_b.HienThi();	
			Scanner nhap = new Scanner(System.in);
			
			System.out.println("**TIM KIEM**");
			System.out.print("Nhap Key Tim Kiem:");

			String key = nhap.nextLine();
			sv_b.TimKiem(key);
			
			System.out.println("**THEM**");
			sv_b.Them("Sv10", "Pham Phuoc Tien", "K46", 10.0);

			
			System.out.println("**XOA**");
			System.out.print("Nhap Key Xoa:");
			String keyx = nhap.nextLine();
			sv_b.Xoa(keyx);
			
			System.out.println("**SUA**");
			System.out.print("Nhap Key Sua:");
			String keys = nhap.nextLine();
			sv_b.sua(keys);
			
			System.out.println("**THONG KE DAU ROT THEO KHOA**");
			System.out.print("Nhap Key Khoa:");
			String keyk = nhap.nextLine();
			sv_b.ThongKe(keyk);

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
