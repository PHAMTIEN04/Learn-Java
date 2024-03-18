package dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import bean.SvCNTT;
import bean.SvLy;
import bean.SvToan;

public class AddSv {
	ArrayList<Object> ds;
	public ArrayList<Object> Taolop(String name_file) {
		ds = new ArrayList<Object>();
		try {
			FileReader f = new FileReader(name_file);
			BufferedReader fb = new BufferedReader(f);
			SvCNTT sc = null;
			SvToan st = null;
			SvLy sl = null;
			while(true) {
				String s = fb.readLine();
				if(s == null || s == "") break;
				String []che = s.split("[|]");
				if(che[0].trim().toLowerCase().contains("cntt")) {
					sc = new SvCNTT(che[0], che[1], Double.parseDouble(che[2]), Double.parseDouble(che[3]));
					ds.add(sc);
				}
				if(che[0].trim().toLowerCase().contains("toan")) {
					st = new SvToan(che[0], che[1], Double.parseDouble(che[2]), Double.parseDouble(che[3]), Double.parseDouble(che[4]));
					ds.add(st);
				}
				if(che[0].trim().toLowerCase().contains("ly")) {
					sl = new SvLy(che[0], che[1], Double.parseDouble(che[2]), Double.parseDouble(che[3]), Double.parseDouble(che[4]), Double.parseDouble(che[5]));
					ds.add(sl);
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
