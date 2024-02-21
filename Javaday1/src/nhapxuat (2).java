import java.util.Scanner;

public class nhapxuat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  ina = new Scanner(System.in);
		String aa = ina.nextLine();
		String bb = ina.nextLine();
		long a = Long.parseLong(aa);
		long b = Long.parseLong(bb);
		System.out.print(a+b);
	}

}
