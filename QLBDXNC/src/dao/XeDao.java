package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.XeBean;
import bean.XeDapBean;
import bean.XeMayBean;
import bean.XeOtoBean;

public class XeDao {
	public ArrayList<XeBean> ds;
	public ArrayList<XeBean> getds() throws Exception{
		try {
			ds = new ArrayList<XeBean>();
			FileReader f = new FileReader("input1.txt");
			BufferedReader rf= new BufferedReader(f);
			FileReader f1 = new FileReader("input2.txt");
			BufferedReader rf1= new BufferedReader(f1);
			XeBean xb = null;
			SimpleDateFormat dd = new SimpleDateFormat("HH:mm dd/MM/yyyy");
			while(true) {
				String s = rf.readLine();
				String s1= rf1.readLine();
				if((s == null || s == "") && (s1 == null || s1 == "")) break;
				String []che = s.split("[;]");
				String []che1 = s1.split("[;]");
				Boolean c_date = true;
				try {
					dd.parse(che[3]);
					dd.parse(che1[3]);
				} catch (Exception e) {
					// TODO: handle exception
					c_date = false;
					continue;
				}
//				System.out.println(che[0]);
				switch (Integer.parseInt(che[0])) {
				case 4: {
					
					if(che[2].equals("Not Available") && che1[2].equals("Not Available")) {
						xb = new XeOtoBean(che[1],dd.parse(che[3]),dd.parse(che1[3]), che[4],che1[4]);
						ds.add(xb);
					}
					break;
				}
				case 2:{
					if((che[2].equals("Not Available") && che1[2].equals("Not Available"))) {
						xb = new XeMayBean(che[1], dd.parse(che[3]), dd.parse(che1[3]));
						ds.add(xb);
					}
					
					break;
				}
				case 0:{
					boolean c_svx = true;
					try {
						Integer.parseInt(che[2]);
						Integer.parseInt(che1[2]);
					} catch (Exception e) {
						// TODO: handle exception
						c_svx = false;
					}
					if(( che[1].equals("Not Available") && che1[1].equals("Not Available") && (c_svx == true))) {
						xb = new XeDapBean( che[2],dd.parse(che[3]),dd.parse(che1[3]));
						ds.add(xb);
					}
					break;
					
				}
				default:{
					System.out.println("Error!!!");
					break;	
				}
				}
			}
			rf.close();
			rf1.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
	}
public void HienThi() {
	for(XeBean xb : ds) {
		System.out.println(xb.toString());
	}
}
}
