import java.util.Scanner;

public class MainFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BtFile bt = new BtFile();
		Scanner nhap = new Scanner(System.in);
		System.out.print("Nhap so luong Sinh Vien: ");
		int n = nhap.nextInt();
		bt.TaoDanhSach(n);
		bt.XuatDanhSach();
		System.out.print("Target:");
		String target = nhap.nextLine();
		bt.TimKiem(target);
		bt.DemDauRot();
		bt.TBC();
		bt.KiemTra();
	}

}
