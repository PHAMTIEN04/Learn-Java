//package ltgd;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class nhapxuatfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("a");
		try {
			FileReader rd = new FileReader("hang.txt");
			BufferedReader bf = new BufferedReader(rd);
			while(true) {
				String st = bf.readLine();
				if(st == null || st == "") {
					break;
				}
//			System.out.println(st);
				System.out.println("a");
				break;
			}
			bf.close();
		} catch (Exception ei) {
			// TODO: handle exception	
			System.out.println("a");
			ei.printStackTrace();
	
		}

		
	}

}
                                                                                                         