package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import bean.sinhvienbean;

public class sinhviendao {
	public ArrayList<sinhvienbean>ds = new ArrayList<sinhvienbean>();
	public ArrayList<sinhvienbean> getsinhvien() throws Exception{
		try {
			FileReader r = new FileReader("sinhvien.txt");
			BufferedReader e = new BufferedReader(r);
			while(true)
			{
				String st = e.readLine();
				if(st=="" || st==null)
				{
					break;
				}
				String[] che = st.split("[;]");
				sinhvienbean sv = new sinhvienbean(che[0], che[1], che[2], Double.parseDouble(che[3]));
				ds.add(sv);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ds;
	}
	public void LuuFile() {
	    try {
	       
	        FileWriter fw = new FileWriter("sinhvien.txt");
	        BufferedWriter bw = new BufferedWriter(fw);
	        PrintWriter pw = new PrintWriter(bw);
	        for(sinhvienbean sv : ds) {
	            pw.println(sv.toString());
	        }

	        pw.close();
	        
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

	
	
}
