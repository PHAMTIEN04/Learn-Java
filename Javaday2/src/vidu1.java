import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class vidu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner nhap = new Scanner(System.in);
			System.out.print("Nhap thoi gian xe vao(hh:mm dd/MM/yyyy):");
			String ngay1 = nhap.nextLine();
			System.out.print("Nhap thoi gian xe ra(hh:mm dd/MM/yyyy):");
			String ngay2 = nhap.nextLine();
			SimpleDateFormat f = new SimpleDateFormat("hh:mm dd/MM/yyyy");
			Date d1 = f.parse(ngay1);
			Date d2 = f.parse(ngay2);
			double hieu=d2.getTime() - d1.getTime();
			double sogiay=hieu/1000;
			double h = (sogiay / 60) / 60;
			double hc = Math.ceil(h);
//			System.out.println(hc);
			System.out.println("**Menu Xe**");
			System.out.println("1.Xe dap : 500d/1gio");
			System.out.println("2.Xe may : 1000d/1gio");
			System.out.println("3.Xe o to : 2000d/1gio");
			System.out.print("Chon: ");
			int choose = nhap.nextInt();
			
			switch (choose) {
			case 1:
				System.out.println("Tien gui xe dap: "+Math.round(500 * hc));
				break;
			case 2:
				System.out.println("Tien gui xe may: "+Math.round(1000 * hc));
				break;
			case 3:
				System.out.println("Tien gui xe o to: "+Math.round(2000 * hc));
				break;
			default:
				break;
			}

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
//		int cnt = 0 ;
//		String a = "12000";
//		String[] b =a.split("");
//		
////		System.out.println(b[1]);
//		String n = "";
//		for(int i = 0 ; i < a.length() ;i++) {
//			
//			if(cnt % 3 == 0) {
//				n += ",";
//			}
//			n+= b[i];
//			cnt++;
////			System.out.println(a[i]);
//		}
//		System.out.println(n);
	}

}
