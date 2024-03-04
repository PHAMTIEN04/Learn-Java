package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import bean.sinhvienbean;

public class sinhviendao {
	public ArrayList<sinhvienbean> ds = new ArrayList<sinhvienbean>();
	public ArrayList<sinhvienbean> getsinhvien() throws Exception{
		try {
			FileReader f = new FileReader("sinhvien.txt");
			BufferedReader rd = new BufferedReader(f);
			while(true) {
				String st = rd.readLine();
				
				if(st == null || st == "") {
					break;
				}
				String[] che = st.split("[;]");
				sinhvienbean sv = new sinhvienbean(che[0],che[1],che[2],Double.parseDouble(che[3]));
				ds.add(sv);
			}
			rd.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
	}
//	public void HienThi() {
//		for(sinhvienbean sv:ds) {
//			System.out.println(sv.toString());
//		}
//	}
}
