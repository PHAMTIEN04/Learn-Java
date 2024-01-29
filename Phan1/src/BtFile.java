
import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
//import java.io.FileNotFoundException;
//import java.io.IOException;

public class BtFile {
	public void TaoDanhSach(int n) {
		try {
			FileWriter f = new FileWriter("sv.txt",false);
			BufferedWriter w = new BufferedWriter(f);
			Random r = new Random();
			BtMang m = new BtMang();
			for(int i=1;i<=n;i++){
                double dtb = r.nextDouble() * 10;
                String studentInfo = "Sv " + i+";" + m.TaoHoTen() + ";" + m.TaoNgay("01/01/1960", "01/01/2000") + ";"+(double)Math.round(dtb*10)/10 + "\n";
                w.write(studentInfo);
				
			}
			w.close();
			System.out.println("Da tao xong");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi o ham Tao Danh Sach" + e.getMessage());
			e.printStackTrace();
		}
//		System.out.println("a");
	}
	public void XuatDanhSach() {
		try {

			FileReader f = new FileReader("sv.txt");
			BufferedReader r = new BufferedReader(f);
			BtMang b = new BtMang();
			while(true) {
				String st = r.readLine();
				if(st == ""||st == null) break;
				String[] ds = st.split("[;]");
				String kq = b.KetQua(Double.parseDouble(ds[3]));
				String gt = b.TaoGioiTinh();
				String xl = b.XepLoai(Double.parseDouble(ds[3]));
				System.out.println(ds[0] + "\n" +ds[1] + "\n"+ds[2] + "\n"+ds[3] + "\n" + kq +"\n" + gt + "\n" + xl + "\n" );
				
				
			}
			r.close();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi o ham Xuat Danh Sach" + e.getMessage());
			e.printStackTrace();
		}
		
		
	}
	public void TimKiem(String target) {
		try {
			FileReader f = new FileReader("sv.txt");
			BufferedReader r = new BufferedReader(f);
			BtMang b = new BtMang();
			boolean check = false;
			while(true) {
				String st = r.readLine();
				if(st == ""||st == null) break;
				String[] ds = st.split("[;]");
				if(ds[1].toLowerCase().contains(target.toLowerCase())) {
					String kq = b.KetQua(Double.parseDouble(ds[3]));
					String gt = b.TaoGioiTinh();
					String xl = b.XepLoai(Double.parseDouble(ds[3]));
					System.out.println(ds[0] + "\n" +ds[1] + "\n"+ds[2] + "\n"+ds[3] + "\n" + kq +"\n" + gt + "\n" + xl + "\n" );
					check = true;
				}
			}
			r.close();
			if(check == false) {
				System.out.println("Tim kiem: khong tim thay!!!");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi o ham Tim Kiem" + e.getMessage());
			e.printStackTrace();
		}
	}
	public void DemDauRot() {
		try {
			FileReader f = new FileReader("sv.txt");
			BufferedReader r = new BufferedReader(f);
			BtMang b = new BtMang();
			int cntd = 0;
			int cntr = 0;
			while(true) {
				String st = r.readLine();
				if(st == ""||st == null) break;
				String[] ds = st.split("[;]");
				String kq = b.KetQua(Double.parseDouble(ds[3]));
				if(kq == "Dau") {
					cntd++;
				}
				else if(kq == "Rot") {
					cntr++;
				}
	
				
			}
			r.close();
			System.out.println("**Sinh Vien**");
			System.out.println("Dau: "+ cntd);
			System.out.println("Rot: "+ cntr);

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi o ham Dem Dau Rot" + e.getMessage());
			e.printStackTrace();
		}
	

}
	public void TBC() {
		try {
			FileReader f = new FileReader("sv.txt");
			BufferedReader r = new BufferedReader(f);
			BtMang b = new BtMang();
			double tbc = 0.0;
			while(true) {
				String st = r.readLine();
				if(st == ""||st == null) break;
				String[] ds = st.split("[;]");
				String kq = b.KetQua(Double.parseDouble(ds[3]));
				double tb = Double.parseDouble(ds[3]);
				tbc += tb;
			}
			r.close();
			System.out.println("Trung Binh Cong: "+ (double)Math.round((tbc/10)*10)/10);

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi o ham Dem Dau Rot" + e.getMessage());
			e.printStackTrace();
		}
		
	}
	public void KiemTra() {
		try {
			FileReader f = new FileReader("sv.txt");
			BufferedReader r = new BufferedReader(f);
			BtMang b = new BtMang();
			boolean check = false;
			System.out.println("**Data Khong Hop Le**");
			while(true) {
				String st = r.readLine();
				if(st == ""||st == null) break;
				String[] ds = st.split("[;]");
				String kq = b.KetQua(Double.parseDouble(ds[3]));
				String gt = b.TaoGioiTinh();
				String xl = b.XepLoai(Double.parseDouble(ds[3]));
				double tb = Double.parseDouble(ds[3]);
				if(ds[2].length() != 10 || (tb < 0 || tb > 10)) {
					System.out.println(ds[0] + "\n" +ds[1] + "\n"+ds[2] + "\n"+ds[3] + "\n" + kq +"\n" + gt + "\n" + xl + "\n" );
					check= true;
				}
			}
			r.close();
			if(check == false) {
				System.out.println("Khong Tim Thay!!!");
			}
//			System.out.println("Trung Binh Cong: "+ (double)Math.round((tbc/10)*10)/10);

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Loi o ham Kiem Tra" + e.getMessage());
			e.printStackTrace();
		}
	}



}
