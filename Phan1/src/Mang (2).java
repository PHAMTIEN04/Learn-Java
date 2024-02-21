import java.util.Scanner;

public class Mang {
	public static void main(String[] args) {
		BtMang m= new BtMang();
		
		int sl = 10;
		m.HienThi(sl);
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so sinh vien: ");
		int n = nhap.nextInt();
		m.HienThi(n);
}
}