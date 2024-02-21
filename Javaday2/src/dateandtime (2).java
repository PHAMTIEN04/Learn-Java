import java.text.SimpleDateFormat;
import java.util.Date;

public class dateandtime {

    public static void main(String[] args) {
        String ngay1 = "15:30 10/01/2016";
        String ngay2 = "17:00 10/01/2016";
        try {
            SimpleDateFormat f = new SimpleDateFormat("HH:mm dd/MM/yyyy"); 
            Date d1 = f.parse(ngay1);
            Date d2 = f.parse(ngay2);
            long hieu = d2.getTime() - d1.getTime();
            System.out.println(d1.getTime() + "\n" + d2.getTime() + "\n" + hieu);
            long sogiay = hieu / 1000;
            double phut = sogiay / 60;
            double gio = 0;
            System.out.println(sogiay);
            System.out.println(phut);
            if (phut % 60 == 0 || phut % 60 == 30) {
                gio = phut / 60;
            } else if (phut % 60 < 30) {
                gio = ((phut - (phut % 60)) + 30) / 60;
            } else if (phut % 60 > 30) {
                gio = ((phut - (phut % 60)) + 60) / 60;
            }

            System.out.println("Ngay 1: " + f.format(d1) + " Ngay 2: " + f.format(d2) + "\nCach nhau: " + gio);
            System.out.println(4 / 60);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
