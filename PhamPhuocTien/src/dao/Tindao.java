package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import bean.TinA;
import bean.TinB;

public class Tindao {
	ArrayList<Object> ds;
	public ArrayList<Object> getds() throws Exception{
		ds = new ArrayList<Object>();
		TinA ta = null;
		TinB tb = null;
		try {
			FileReader f = new FileReader("ds.txt");
			BufferedReader fb = new BufferedReader(f);
			while(true) {
				String s = fb.readLine();
				if(s == null || s == " ") break;
				String []che = s.split("[;]");
				
				switch (che.length) {
				case 4: {
					if(che[0].trim().toLowerCase().equals("TinA".trim().toLowerCase())){
						ta = new TinA(che[0], che[1], Double.parseDouble(che[2]), Double.parseDouble(che[3]));
						ds.add(ta);
				}
					else {
						System.out.println("Dòng " + (che.length-1) + " không hợp lệ");
					}
					break;
				}
				case 5: {
					if(che[0].trim().toLowerCase().equals("TinB".trim().toLowerCase())){
						tb = new TinB(che[0], che[1], Double.parseDouble(che[2]), Double.parseDouble(che[3]), Double.parseDouble(che[4]));
						ds.add(tb);
				}
					else {
						System.out.println("Dòng " + (che.length-1) + " không hợp lệ");
					}
					break;
				}
				default:
					System.out.println("Dòng " + (che.length-1) + " không hợp lệ");
					break;
				}


			}
			fb.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
	}
}
