package bo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.XeBean;
import bean.XeDapBean;
import bean.XeMayBean;
import bean.XeOtoBean;
import dao.XeDao;

public class XeBo {
	XeDao xd = new XeDao();
	public ArrayList<XeBean> ds;
	public ArrayList<XeBean> getds() throws Exception{
		ds = xd.getds();
		return ds;
	}
	public double tinhgio(String nbd,String nkt) {
		double s=0; 
		try {
	            SimpleDateFormat f = new SimpleDateFormat("HH:mm dd/MM/yyyy"); 
	            Date d1 = f.parse(nbd);
	            Date d2 = f.parse(nkt);
	            long hieu = d2.getTime() - d1.getTime();
	            long sogiay = hieu / 1000;
	            double phut = sogiay / 60;
	            double gio = 0;
	            if (phut % 60 == 0 || phut % 60 == 30) {
	                gio = phut / 60;
	            } else if (phut % 60 < 30) {
	                gio = ((phut - (phut % 60)) + 30) / 60;
	            } else if (phut % 60 > 30) {
	                gio = ((phut - (phut % 60)) + 60) / 60;
	            }
	            s = gio;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return s;
	
	}
	public double tinhngay(String nbd,String nkt) {
		double s=0; 
		try {
	            SimpleDateFormat f = new SimpleDateFormat("HH:mm dd/MM/yyyy"); 
	            Date d1 = f.parse(nbd);
	            Date d2 = f.parse(nkt);
	            long hieu = d2.getTime() - d1.getTime();
	            long sogiay = hieu / 1000;
	            double phut = sogiay / 60;
	            double gio = phut/60;
	            double ngay = 0;
	            if (gio % 24 == 0) {
	                ngay = gio / 24;
	            } else if (gio % 24 < 24) {
	                ngay = ((gio - (gio % 24)) + 24) / 24;}
	            s = ngay;
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
		 return s;
	
	}
	public void File_Tinh_Tien() {
		try {
			FileWriter w = new FileWriter("output.txt",false);
			BufferedWriter bw = new BufferedWriter(w);
			String check = "";
			SimpleDateFormat dd = new SimpleDateFormat("HH:mm dd/MM/yyyy");

			for(XeBean xb : ds) {
				
				if(xb instanceof XeOtoBean) {
					if(!((XeOtoBean) xb).getTtv().trim().toLowerCase().equals(((XeOtoBean) xb).getTtr().trim().toLowerCase())) {
						bw.write("4"+";"+((XeOtoBean) xb).getBsx() + ";" + "Not Available" +";" + dd.format(xb.getTgv()) + ";" + dd.format(xb.getTgr()) + ";" + "Chua xac dinh - Dang xu ly boi thuong" + "\n");
					}
					else {
						bw.write("4"+";"+((XeOtoBean) xb).getBsx() + ";" + "Not Available" +";" + dd.format(xb.getTgv()) + ";" + dd.format(xb.getTgr()) + ";" + Math.round(tinhgio(dd.format(xb.getTgv()), dd.format(xb.getTgr()).toString())*5000) * 2 + "\n");
					}
				}
				if(xb instanceof XeDapBean){
					bw.write("0"+";"+"Not Available" + ";" + ((XeDapBean) xb).getSovx() +";" + dd.format(xb.getTgv()) + ";" + dd.format(xb.getTgr()) + ";" + Math.round(tinhngay(dd.format(xb.getTgv()), dd.format(xb.getTgr()).toString())) * 1000 + "\n");
				}
				if(xb instanceof XeMayBean) {
					bw.write("2"+";"+((XeMayBean) xb).getBsx() + ";" + "Not Available" +";" + dd.format(xb.getTgv()) + ";" + dd.format(xb.getTgr()) + ";" + Math.round(tinhngay(dd.format(xb.getTgv()), dd.format(xb.getTgr()).toString())) * 3000  + "\n");
				}
			}
			bw.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void HienThi() {
		for(XeBean xb : ds) {
			System.out.println(xb.toString());
		}
	}
	
}
