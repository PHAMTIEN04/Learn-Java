package bo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;

import bean.SvCNTT;
import bean.SvLy;
import bean.SvToan;
import dao.AddSv;

public class CnSv {
	AddSv asv = new AddSv();
	ArrayList<Object> ds = new ArrayList<Object>();
	public ArrayList<Object> Taolop(String name_file){
		ds = asv.Taolop(name_file);
		return ds;
	}
	public void HienThiTheoKhoa() {
		for(Object x : ds) {
			if(x instanceof SvCNTT) {
				System.out.println(x.toString());
			}
			
		}
		for(Object x : ds) {
			if(x instanceof SvToan) {
				System.out.println(x.toString());
			}
			
		}
		for(Object x : ds) {
			if(x instanceof SvLy) {
				System.out.println(x.toString());
			}
			
		}
	}
	public void HienThiTheoKhoaKey(String key) {
		if(key.toLowerCase().trim().contains("cntt")) {
			for(Object x : ds) {
				if(x instanceof SvCNTT) {
					System.out.println(x.toString());
				}
		}
		}
		if(key.toLowerCase().trim().contains("toan")) {
			for(Object x : ds) {
				if(x instanceof SvToan) {
					System.out.println(x.toString());
				}
		}
		}
		if(key.toLowerCase().trim().contains("ly")) {
			for(Object x : ds) {
				if(x instanceof SvLy) {
					System.out.println(x.toString());
				}
		}
		}
			
	}
	public void DTBtungkhoa() {
		Double sum = 0.0;
		Integer cnt = 0;
		for(Object x : ds) {
			if(x instanceof SvCNTT) {
				sum+= ((SvCNTT) x).DTB();
				cnt++;
			}
			
		}
		System.out.println("DTB svCNTT :" + sum/cnt);
		sum = 0.0;
		cnt = 0;
		for(Object x : ds) {
			if(x instanceof SvToan) {
				sum+= ((SvToan) x).DTB();
				cnt++;
			}
			
		}
		System.out.println("DTB svToan :" + sum/cnt);
		sum = 0.0;
		cnt = 0;
		for(Object x : ds) {
			if(x instanceof SvLy) {
				sum+= ((SvLy) x).DTB();
				cnt++;
			}
			
		}
		System.out.println("DTB svLy :" + sum/cnt);
	}
	public void LuuSvTheoFile() {
		try {
			FileWriter f1 = new FileWriter("f1.txt");
			BufferedWriter fw1 = new BufferedWriter(f1);
			FileWriter f2 = new FileWriter("f2.txt");
			BufferedWriter fw2 = new BufferedWriter(f2);
			FileWriter f3 = new FileWriter("f3.txt");
			BufferedWriter fw3 = new BufferedWriter(f3);
			for(Object x : ds) {
				if(x instanceof SvCNTT) {
					fw1.write(x.toString() + "\n");
				}
				if(x instanceof SvToan) {
					fw2.write(x.toString() + "\n");
				}
				if(x instanceof SvLy) {
					fw3.write(x.toString() + "\n");
				}
			}
			fw1.close();
			fw2.close();
			fw3.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void TimKiem(String ht,String key) {
		if(key.toLowerCase().trim().contains("cntt")) {
			for(Object x : ds) {
				if(x instanceof SvCNTT) {
					if(((SvCNTT) x).getHoten().trim().toLowerCase().contains(ht.toLowerCase().trim())) {
						System.out.println(x.toString());
					}
					
				}
		}
		}
		if(key.toLowerCase().trim().contains("toan")) {
			for(Object x : ds) {
				if(x instanceof SvToan) {
					if(((SvToan) x).getHoten().trim().toLowerCase().contains(ht.toLowerCase().trim())) {
						System.out.println(x.toString());
					}
				}
		}
		}
		if(key.toLowerCase().trim().contains("ly")) {
			for(Object x : ds) {
				if(x instanceof SvLy) {
					if(((SvLy) x).getHoten().trim().toLowerCase().contains(ht.toLowerCase().trim())) {
						System.out.println(x.toString());
					}
				}
		}
		}
	}
	public void HienThi() {
		for(Object x : ds) {
			System.out.println(x.toString());
		}
	}
}
