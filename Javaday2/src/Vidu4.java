import java.util.Scanner;

public class Vidu4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ds = {"Le van Nam","Ho van Tu","Do van Hung Dung"};
		//Nhap vap 1 key
		System.out.print("Nhap key: ");
		Scanner nhap = new Scanner(System.in);
		String key = nhap.nextLine();
		//In ra cac ho ten giong nhu key
		for(String x:ds) {
			if(x.trim().toLowerCase().contains(key.trim().toLowerCase())== true) {
				System.out.println(x);
			}
		}
		// toLowerCase in thuong chuoi
		// trim xoa ky tu trang dau va cuoi
		// contains tim ki tu co ton tai trong chuoi hay khong
		
		String tt = "Sv1;Le Van Nam;K46;CNTT;DHKH";
		String[] che = tt.split("[;]");
		for(String x:che) {
			System.out.println(x);
		}
		// split("[ki tu]") dung de tach chuoi thanh danh sach theo ki tu
	}

}
