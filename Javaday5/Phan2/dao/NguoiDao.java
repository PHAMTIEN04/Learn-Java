package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import bean.Hocsinhbean;
import bean.NguoiBean;
import bean.NhanVienBean;


public class NguoiDao {
	public ArrayList<NguoiBean> ds;
	public ArrayList<NguoiBean> getds() throws Exception{
		try {
			ds = new ArrayList<NguoiBean>();
			FileReader f = new FileReader("ds.txt");
			BufferedReader rd = new BufferedReader(f);
			SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
			FileWriter w = new FileWriter("loi.txt",false);
			BufferedWriter bw = new BufferedWriter(w);
			Integer i = 1;
			NguoiBean n = null;
			while(true) {
				String st = rd.readLine();
				
				if(st == null || st == "") {
					break;
				}
				String[] che = st.split("[;]");
				
				Boolean c_date = true;
				try {
					dd.parse(che[2]);
				} catch (Exception e) {
					// TODO: handle exception
//					e.printStackTrace();
					c_date = false;
				}
				switch (che.length) {
					case 3: {
						if(c_date == true) {
							n = new NguoiBean(che[0],Boolean.parseBoolean(che[1]),dd.parse(che[2]));
							ds.add(n);
						}
						else {
							bw.write("Loi dong so "+i.toString()+ " :" + "[Date]");
							bw.newLine();
						}
						break;
				}
					case 6: {
						if(c_date == true) {
							n = new Hocsinhbean(che[0],Boolean.parseBoolean(che[1]),dd.parse(che[2]), che[3], che[4], Double.parseDouble(che[5]));
							ds.add(n);
						}
						else {
							bw.write("Loi dong so "+i.toString()+ " :" + "[Date]");
							bw.newLine();
						}
						
						break;
				}
					case 7:{
						Pattern p_mail = Pattern.compile("^[\\w.-]+@[a-zA-Z\\d.-]+\\.[a-zA-Z]+$");
						Matcher m_mail = p_mail.matcher(che[5]);
						Boolean c_mail = m_mail.find();
						Pattern p_sdt = Pattern.compile("^0[0-9]{9}$");
						Matcher m_sdt = p_sdt.matcher(che[6]);
						Boolean c_sdt = m_sdt.find();
						if(c_date == true && c_mail == true && c_sdt == true) {
							n = new NhanVienBean(che[0],Boolean.parseBoolean(che[1]),dd.parse(che[2]), che[3],Double.parseDouble(che[4]), che[5], che[6]);
							ds.add(n);
						}
						else {
							String s = "";
							if(c_date == false) {
								s += "[Date]";
						}
							if(c_mail == false) {
								s += "[Email]";
							}
							if(c_sdt == false) {
								s += "[Sdt]";
							}
							bw.write("Loi dong so "+i.toString()+ " :" + s);
							bw.newLine();
						
				}		
						break;
				}
					default:{
						bw.write("Loi dong so " +i.toString()+" :" + "[Du lieu]");
						bw.newLine();
						break;
					}
					
				}
				
				i++;
			}
			bw.close();
			rd.close();
			
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return ds;
	}
	public void HienThi() {
		for(NguoiBean n : ds) {
			System.out.println(n.toString());
		}
	}
}
