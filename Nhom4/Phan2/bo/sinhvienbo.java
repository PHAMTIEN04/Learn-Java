package bo;

import java.util.ArrayList;
import java.util.Scanner;

import bean.sinhvienbean;
import dao.sinhviendao;
import java.util.Iterator;
public class sinhvienbo {
	sinhviendao svdao = new sinhviendao();
	public ArrayList<sinhvienbean>ds;
	public ArrayList<sinhvienbean> getsinhvien() throws Exception{
		ds = svdao.getsinhvien();
		return ds;
	}
	public void Hienthi()
	{
		for(sinhvienbean sv: ds)
		{
			System.out.println(sv.toString());
		}
	}
	
	//viet ham tim sinh vien theo ma hoac ho ten
	public void Timkiem()
	{
		Scanner key = new Scanner(System.in);
		System.out.print("Nhap MSV can tim: ");
		String nhap = key.nextLine();
		for(sinhvienbean sv: ds)
		{
			if(sv.getMasv().trim().toLowerCase().equals(nhap.trim().toLowerCase()))
			{
				System.out.println(sv.toString());
			}
		}
	}
	//them , xoa, sua sinh vien
	public void Them() {
        Scanner k = new Scanner(System.in);
        System.out.println("Them sinh vien:");
        System.out.print("Nhap MSV: ");
        String ma = k.nextLine();
        System.out.print("Nhap Ho Ten: ");
        String hoten = k.nextLine();
        System.out.print("Nhap Khoa: ");
        String khoa = k.nextLine();
        System.out.print("Nhap DTB: ");
        double diem = k.nextDouble();
        sinhvienbean svMoi = new sinhvienbean(ma, hoten, khoa, diem);
        Boolean check = false;
        for(sinhvienbean sv: ds)
        {
        	if(sv.getMasv().trim().toLowerCase().contains(ma.trim().toLowerCase()))
        	{
        		check = true;
        		break;
        		
        	}
        }
        if(!check)
        {
        	ds.add(svMoi);
        }
        else
        {
        	System.out.println("Ma sinh vien da ton tai");
        }
        svdao.LuuFile();
    }
	public void Xoa() {
	    Scanner key = new Scanner(System.in);
	    System.out.print("Nhap MSV can xoa: ");
	    String nhap = key.nextLine();
	    Iterator<sinhvienbean> iterator = ds.iterator();
	    while (iterator.hasNext()) {
	        sinhvienbean sv = iterator.next();
	        if (sv.getMasv().trim().toLowerCase().contains(nhap.trim().toLowerCase())) {
	            iterator.remove(); // 
	        }
	    }

	    svdao.LuuFile();
	}
	public void Sua() {
	    Scanner k = new Scanner(System.in);
	    System.out.println("Sua sinh vien:");
	    System.out.print("Nhap MSV can sua: ");
	    String ma = k.nextLine();
	    sinhvienbean sinhVienCanSua = null;
	    for (sinhvienbean sv : ds) {
	        if (sv.getMasv().trim().toLowerCase().equals(ma.trim().toLowerCase())) {
	            sinhVienCanSua = sv;
	            break;
	        }
	    }
	    if (sinhVienCanSua != null) {
	        System.out.print("Nhap Ho Ten moi: ");
	        String hotenMoi = k.nextLine();
	        System.out.print("Nhap Khoa moi: ");
	        String khoaMoi = k.nextLine();
	        System.out.print("Nhap DTB moi: ");
	        double dtbMoi = k.nextDouble();
	        k.nextLine(); 
	        sinhVienCanSua.setHoten(hotenMoi);
	        sinhVienCanSua.setKhoa(khoaMoi);
	        sinhVienCanSua.setDtb(dtbMoi);
	    } else {
	        System.out.println("Khong tim thay sinh vien co MSV: " + ma);
	    }
	    svdao.LuuFile();
	}
	//Thong ke sinh vien dau rot theo khoa
	public String Xeploai(double dtb)
	{
		if(dtb >=8.0 && dtb<=10.0)
		{
			return "Gioi";
		}
		else if(dtb >= 6.5)
		{
			return "Kha";
		}
		else if(dtb >=5.0)
		{
			return "Trung binh";
		}
		else if(dtb > 3.0)
		{
			return "Yeu";
		}
		else if(dtb <= 3.0 && dtb >=0.0)
		{
			return "Kem";
		}
		return null;
	}
//	public void Thongke()
//	{
//		String luu="";
//		for(sinhvienbean sv: ds)
//		{
//			if(sv.getMasv())
//		}
//	}
}
