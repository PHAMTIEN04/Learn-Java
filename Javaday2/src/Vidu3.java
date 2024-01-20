import java.util.Scanner;

public class Vidu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner nhap = new Scanner(System.in);
			System.out.print("Nhap ho ten: ");
			String ht = nhap.nextLine();// ht = "Le Hoang Van Nam"
			// In ra ho, chu lot va ten
			String htn = ht.trim(); // Xoa khoang trang dau cuoi
			int vt1 = htn.indexOf(' ');// tim vi tri tu trai qua phai
			int vt2 = htn.lastIndexOf(' '); // tim vi tri tu phai qua trai
			String ho ="";
			String ten = "";
			if(vt1 >= 0 && vt2 >= 0 ) {
				 ho = htn.substring(0,vt1);// lay gia tri tu vi tri 0 -> vt1
			
				 ten = htn.substring(vt2,ht.length());
			}else {
				ten = htn;
			}

			String lot = "";
			if(vt2-vt1 > 0) {
				
				lot = htn.substring(vt1+1,vt2);
			}

				
			
			System.out.println("Ho: " + ho + "\nTen: " + ten + "\nLot: " + lot);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
