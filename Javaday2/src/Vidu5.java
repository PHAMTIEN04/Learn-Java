import java.util.Scanner;

public class Vidu5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] ds = {"sv1;Le van Nam;k45",
						"sv2;Ho van Tu;k45",
						"sv3;Do van Hung Dung;k46",
						"sv4;Le Nam;k47"};
		System.out.print("Nhap khoa: ");
		Scanner nhap = new Scanner(System.in);
		String khoa = nhap.nextLine();
		Boolean check = false;
		for(String x:ds) {
			String s = x.split("[;]")[2];
//			System.out.println(s + " " + khoa);
			if(s.trim().toLowerCase().equals(khoa.toLowerCase())) {
				System.out.println(x);
				check = true;
			}
		}
		if(check == false) {
			System.out.println(khoa + "khong ton tai");
		}
	}

}
