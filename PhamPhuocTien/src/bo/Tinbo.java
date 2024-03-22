package bo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import bean.TinA;
import bean.TinB;
import dao.Tindao;

public class Tinbo {
	Tindao td = new Tindao();
	ArrayList<Object> ds = new ArrayList<Object>();
	public ArrayList<Object> getds() throws Exception{
		ds = td.getds();
		return ds;
	}
	public void TimKiemTuongDoi(String key) {
		boolean check = true;
		for(Object x : ds) {
			if(x instanceof TinA) {
				String check_a = ((TinA) x).getHoten();
				if(check_a.toLowerCase().trim().contains(key.toLowerCase().trim())) {
					System.out.println(x.toString());
					check = false;
				}
			
			

			}}
		for(Object x : ds) {
				if(x instanceof TinB) {
					String check_b = ((TinB) x).getHoten();
					if(check_b.toLowerCase().trim().contains(key.toLowerCase().trim())) {
						System.out.println(x.toString());
						check = false;
					}
				}
				}
		if(check == true) {
			System.out.println("Khong Tim Thay!!!");
		}
	}
	public void LuuFile() {
		try {
			FileWriter f1 = new FileWriter("f1.txt");
			BufferedWriter fb1 = new BufferedWriter(f1);
			FileWriter f2 = new FileWriter("f2.txt");
			BufferedWriter fb2 = new BufferedWriter(f2);
			for(Object x : ds) {
				if(x instanceof TinA) {
					fb1.write(x.toString() + "\n");
				}
			}
			for(Object x : ds) {
				if(x instanceof TinB) {
					fb2.write(x.toString() + "\n");
				}
			}
			System.out.println("Luu File f1.txt va f2.txt thanh cong!!!");
			fb1.close();
			fb2.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void HienThi() {
		for(Object x : ds) {
			System.out.println(x.toString());
		}
	}
}
