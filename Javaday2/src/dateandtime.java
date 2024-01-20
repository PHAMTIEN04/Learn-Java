import java.text.SimpleDateFormat;
import java.util.Date;

public class dateandtime {

	public static void main(String[] args) {
		String ngay1 = "10:03 10/01/2016";
		String ngay2 = "10:07 10/01/2016";
		try {
			SimpleDateFormat f = new SimpleDateFormat("hh:mm dd/MM/yyyy");
			Date d1 = f.parse(ngay1);
			Date d2 = f.parse(ngay2);
			long hieu=d2.getTime() - d1.getTime();
			System.out.println(d1.getTime()+"\n"+d2.getTime() + "\n" + hieu);
			long sogiay=hieu/1000;
			System.out.println("Ngay 1: " + f.format(d1) + "Ngay 2: " + f.format(d2) + "\nCach nhau: " + sogiay);
			System.out.println(4 / 60);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
