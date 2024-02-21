import java.util.Scanner;

public class MainArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BtArraylist b = new BtArraylist();
		Scanner nhap = new Scanner(System.in);
		
		b.TaoDanhSach();
		b.XuatDanhSach();
		System.out.print("Target:");
		String target = nhap.nextLine();
		
		b.TimKiem(target);
		b.ThongKeDauRot();
		b.TBC();
	}

}
