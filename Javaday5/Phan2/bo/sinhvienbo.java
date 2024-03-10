package bo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import bean.sinhvienbean;
import dao.sinhviendao;

public class sinhvienbo {
	sinhviendao svdao = new sinhviendao();
	public ArrayList<sinhvienbean> ds= new ArrayList<sinhvienbean>();
	public ArrayList<sinhvienbean> getsinhvien() throws Exception{
		this.ds = svdao.getsinhvien();
		return this.ds;
	}

	public void TimKiem(String key) {
		for(sinhvienbean sv : ds) {
			if(sv.getMasv().trim().toLowerCase().equals(key.trim().toLowerCase())||sv.getHoten().trim().toLowerCase().equals(key.trim().toLowerCase()) ) {
				System.out.println(sv.toString()); break;
			}
			else {
				System.out.println("Khong tim thay!!!"); break;
			}
		}
	}
	public void Them(String msv,String ht,String khoa,Double dtb) {
		try {
			
			FileWriter f = new FileWriter("sinhvien.txt",true);
			BufferedWriter fb = new BufferedWriter(f);
			boolean check = true;
			for(sinhvienbean sv : this.ds) {
				if(sv.getMasv().trim().toLowerCase().equals(msv.trim().toLowerCase())) {
					check = false;
					break;
				}
			}
			if(check == true) {
//				fb.newLine();
				fb.write(msv + ";" + ht + ";" + khoa + ";" + dtb.toString()+'\n');
				System.out.println("Da them thanh cong!!!");
				fb.close();
//				this.getsinhvien();
				System.out.println("aaaa");
//				this.HienThi();
			}
			else {
				System.out.println("Du lieu da ton tai!!!");
			}
			
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void Xoa(String key) {
		try {

			boolean check = false;
			FileWriter f = new FileWriter("sinhvien.txt",false);
			BufferedWriter fb = new BufferedWriter(f);
			for(sinhvienbean sv: ds) {
				if(!(sv.getMasv().trim().toLowerCase().equals(key.trim().toLowerCase()))) {
					fb.write(sv.getMasv() + ";" + sv.getHoten() + ";" + sv.getKhoa() + ";" + sv.getDtb().toString());
					fb.newLine();
					check = true;
					
					
				}
			}
			fb.close();
			if(check == true) {
				System.out.println("Da xoa thanh cong!!");
//				svdao.HienThi();
			}
			else System.out.println("Khong tim thay!!!");

					} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	
		
	}
	public void sua(String key) {
		try {

	        FileWriter f = new FileWriter("sinhvien.txt", false);
	        BufferedWriter fb = new BufferedWriter(f);
	        for (sinhvienbean sv : ds) {
	            if (sv.getMasv().trim().equalsIgnoreCase(key.trim())) {
	                System.out.println(sv.toString());
	                System.out.println("Sua Thong Tin");
	                System.out.println("1.Sua Ho Ten");
	                System.out.println("2.Sua Khoa");
	                System.out.println("3.Sua DTB");
	                System.out.print("Chon:");
	                Scanner nhap = new Scanner(System.in);
	                int choose = nhap.nextInt();
	                switch (choose) {
	                    case 1: {
	                        System.out.print("Nhap ho ten muon sua:");
	                        nhap.nextLine();
	                        String new_ht = nhap.nextLine();
	                        sv.setHoten(new_ht);
	                        break;
	                    }
	                    case 2: {
	                        System.out.print("Nhap khoa muon sua:");
	                        nhap.nextLine();
	                        String new_k = nhap.nextLine();
	                        sv.setKhoa(new_k);
	                        break;
	                    }
	                    case 3: {
	                        System.out.print("Nhap DTB muon sua:");
	                        nhap.nextLine();
	                        double new_db = nhap.nextDouble();
	                        sv.setDtb(new_db);
	                        break;
	                    }
//	                    default: {
//	                        System.exit(1);
//	                    }
	                }
	           
	            }
	        }


	        for (sinhvienbean sv : ds) {
	            fb.write(sv.getMasv() + ";" + sv.getHoten() + ";" + sv.getKhoa() + ";" + sv.getDtb().toString());
	            fb.newLine();
	        }

	        fb.close();
//	        svdao.HienThi();
			
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public void ThongKe(String key) {
		for(sinhvienbean sv : ds) {
			if(sv.getKhoa().trim().toLowerCase().equals(key.trim().toLowerCase())) {
				if(sv.getDtb() < 4.0) {
					System.out.println(sv.toString() + ";" + "Rot");
				}
				else {
					System.out.println(sv.toString() + ";" + "Dau");
				}
			}
		}
		
		
	}
	public void HienThi() {
		try {

			for(sinhvienbean sv: this.ds) {
			
				System.out.println(sv.toString());
		}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	
	//Tìm sinh viên theo mã hoặc họ tên
	//Thêm, xóa, sửa sinh viên
	//Thống kê sinh viên đậu, rớt theo khóa
}
