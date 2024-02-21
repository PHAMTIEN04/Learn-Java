import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MainFile {
//	ArrayList<String> ds2 = new ArrayList<String>();
	public double tinhgio(String nbd,String nkt) {
		double s=0; 
		try {
	            SimpleDateFormat f = new SimpleDateFormat("HH:mm dd/MM/yyyy"); 
	            Date d1 = f.parse(nbd);
	            Date d2 = f.parse(nkt);
	            long hieu = d2.getTime() - d1.getTime();
//	            System.out.println(d1.getTime() + "\n" + d2.getTime() + "\n" + hieu);
	            long sogiay = hieu / 1000;
	            double phut = sogiay / 60;
	            double gio = 0;
//	            System.out.println(sogiay);
//	            System.out.println(phut);
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
//	            System.out.println(d1.getTime() + "\n" + d2.getTime() + "\n" + hieu);
	            long sogiay = hieu / 1000;
	            double phut = sogiay / 60;
	            double gio = phut/60;
	            double ngay = 0;
//	            System.out.println(sogiay);
//	            System.out.println(phut);
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
	public static void main(String[] args) {
		MainFile a = new MainFile();
		// TODO Auto-generated method stub
		ArrayList<String> ds1 = new ArrayList<>();
		ArrayList<String> ds2 = new ArrayList<>();
		try {
			FileReader r1 = new FileReader("input1.txt"); // Di vao bai do xe
			BufferedReader rd1 = new BufferedReader(r1);
			while(true) {
				String s1 = rd1.readLine();
				if(s1 == null || s1.equals("")) break;
				ds1.add(s1);
//				System.out.println(s1);
			}
			rd1.close();
			
		
		} catch (Exception e1) {
			// TODO: handle exception
			e1.printStackTrace();
		}
//		System.out.println(ds1);
//		for(String x:ds1) {
//			System.out.println(x);
//		}
		try {
			FileReader r2 = new FileReader("input2.txt");// di ra khoi bai do xe
			BufferedReader rd2 = new BufferedReader(r2);
			while(true) {
				String s2 = rd2.readLine();
				if(s2 == null || s2.equals("")) break;
				ds2.add(s2);
//				System.out.println(s2);
			}

		
		} catch (Exception e2) {
			// TODO: handle exception
			e2.printStackTrace();
//			Long a = 12;
//			a.toString();
		}
		try (FileWriter w = new FileWriter("output.txt");
			     BufferedWriter wr = new BufferedWriter(w)) {
			    int cnt = 0;
			    while (cnt < ds2.size()) {
			        String s1 = ds1.get(cnt);
			        String s2 = ds2.get(cnt);
			        String[] check1 = s1.split("[;]");
			        String[] check2 = s2.split("[;]");


			        if (check1.length >= 4 && check2.length >= 4) {
			            String infor = check1[0] + ";" + check1[1] + ";" + check1[2] + ";" + check1[3] + ";"+ check2[3]+";";

//			            System.out.println(check1[4]);
			            if(check1[4].equals("Binh thuong") || check1[4].equals("Not Available")){
			            	
			            	if(check1[0].equals("4")) {
			            		wr.write(infor+ Math.round((a.tinhgio(check1[3], check2[3])) * 5000) * 2 + "\n");
			            	}
			            	if(check1[0].equals("2")) {
			            		wr.write(infor+ Math.round(a.tinhngay(check1[3], check2[3])) * 3000 + "\n");
			            	}
			            	if(check1[0].equals("0")) {
			            		wr.write(infor+ Math.round(a.tinhngay(check1[3], check2[3])) * 1000 + "\n");
			            	}
			           
			            
			            }
			            else {
			            	wr.write(infor+ "Chua xac dinh - Dang xu ly boi thuong" + "\n");
			            }
			            
			            
			        } else {
			            System.out.println("Data None");
			        }

			        cnt++;
			    }
			} catch (Exception e) {
			    e.printStackTrace();
			}


	}

}
