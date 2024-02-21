import java.util.Random;

public class Vidu2 {

	public static void main(String[] args) {
		// In ra so xe co 4 chu so va co 9 diem
		System.out.println("Hello World!");
		Random r = new Random();
////		System.out.println(r.nextInt(10000));
		while(true) {		
			int sx = r.nextInt(100);
//			System.out.println(sx);
//			Integer.parseInt(string) chuyen chuoi -> so int tuong tu cac kieu khac
//			String.valueOf(int) chuyen so -> chuoi 
			int sum = 0;
			int n = sx;
			int s = sx;
			int cnt = 0;
			int c = sx%10;
			boolean check = true;
			while(n != 0) {
			sx = n % 10;
			n = n / 10;
			sum = sum + sx;
			cnt++;
			if (c > sx) {
				c = sx;
			}
			else if(c<sx){
				check = false;
			}
		}
			if(check == true && sum%10 == 9) {
				if (cnt < 5) {
				System.out.print("So xe: ");
				for(int i = 1 ; i <= 5 - cnt;i++) {
				System.out.print(0);
			}
				System.out.println(s);
			}
			else {
				System.out.println("So xe:"+s);
			}
				break;
			}

		}

	}

}
