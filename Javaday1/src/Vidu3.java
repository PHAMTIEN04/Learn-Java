//import java.util.Iterator;

public class Vidu3 {
	public static void main(String[] args) {
		// Tao mang a co 5 phan tu
		int[] a= {3,4,1,2,4};
		for(int i = 0 ; i < a.length;i++) {
			System.out.print(a[i]+" ");
		}
		for(int x : a) {
			System.out.println(x);
		}
		int max = a[0];
		for(int x : a) {
			if(max < x) {
				max = x;
			}
		}
		System.out.print("Max: "+ max);
	}
}
