import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
public class BtMang {
	public String TaoNgay (String ngay1, String ngay2){
		try{
			//Dinh dang ngay theo dang ngay thang nam
			SimpleDateFormat f= new SimpleDateFormat("dd/MM/yyyy"); 
			Date n1= f.parse(ngay1); //Doi chuoi ngay1 ra kieu ngay 
			Date n2= f.parse(ngay2);
			Random r= new Random();//Kich hoat de lay so ngau nhien
			while(true) {
				Long t=r.nextLong(); //Lay 1 so ngau nhien
				//n1.getTime: Doi ngay ra so
				if(t>=n1.getTime()&&t<=n2.getTime())
				{
					Date n= new Date(t); //Doi so ra ngay 
					return f.format(n);//Tra ve chuoi ngay thang nam
				}
			}
		}
		catch(Exception tt){ 
			System.out.println("Loi: "+ tt.getMessage()); 
			return null;
		}
	}
	public String TaoHoTen(){
		String[] ho={"Tran", "Le", "Nguyen"};
		String[] chulot={"Thanh", "Hoang", "Trung", "Van", "My"};
		String[] ten={"Hung", "Nga", "Tien", "Tam", "Ton", "Giang","Sy"};
		Random r= new Random();
		//ho.length tra ve do dai của mang ho ->3
		String h=ho[r.nextInt(ho.length)];
		String cl=chulot[r.nextInt(chulot.length)];
		String t=ten[r.nextInt(ten.length)];
		return h+" "+cl+" "+t;
		}
	public String TaoGioiTinh() {
		String[] gt = {"Nam","Nu"};
		Random r = new Random();
		String g = gt[r.nextInt(gt.length)] ;
		return g;
	}
	public String KetQua(double d) {
		if(d >= 5) {
			return "Dau";
		}
		return "Rot";
	}
	public String XepLoai(double d) {
		if(d >= 8.0 && d <= 10.0) {
			return "Gioi";
		}
		else if(d > 6.4) {
			return "Kha";
		}
		else if(d > 4.9) {
			return "Trung Binh";
		}
		else if(d > 3.0) {
			return "Yeu";
		}
		else if(d <= 3.0 && d>=0.0) {
			return "Kem";
		}
		return null;
	}
	public void HienThi (int n) {
		Random r= new Random();
		for(int i=1;i<=n;i++){
			double dtb= r.nextDouble()*10;
			System.out.println(TaoHoTen()+"; "+TaoNgay("01/01/1960","01/01/2000")+";"+TaoGioiTinh()+";"+(double)Math.round(dtb*10)/10+";"+ KetQua(dtb)+";"+ XepLoai(dtb));
		}
	}
	
}