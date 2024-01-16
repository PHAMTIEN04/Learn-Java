import java.util.Random;

public class day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");
		Random r = new Random();
		int sx = r.nextInt(100000);

		int sum = 0;
		int n = sx;
		int s = sx;
		int cnt = 0;		
		while(n != 0) {
			sx = n % 10;
			n = n / 10;
			sum = sum + sx;
			cnt++;
			System.out.print(sx);
		}

//		int nn = sum;
//		while( nn != 0) {
//			nn = nn / 10;
//			cnt++;
//		}
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

//		System.out.println(sum);
//		if(cnt > 1) {
//			sum = sum % 10;
//		}
		System.out.println("Diem xe: "+sum%10);
	}

}
