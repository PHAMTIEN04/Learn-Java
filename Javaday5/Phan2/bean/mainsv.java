package bean;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class mainsv {
	public static void main(String[] args) {
		try {
			String ngay = "27/04/2004";
			SimpleDateFormat dd = new SimpleDateFormat("dd/MM/yyyy");
			NguoiBean n1 = new NguoiBean("Thien", true, dd.parse(ngay));
			NguoiBean n2 = new NguoiBean("Thuyet", true, dd.parse(ngay));
			NhanVienBean nv1 = new NhanVienBean("Thien",true,dd.parse(ngay),"NV1",1.5, "123123", "092312");
			NhanVienBean nv2 = new NhanVienBean("Thuyet",true, dd.parse(ngay),"NV2",0.1, "123123","1231312");
			Hocsinhbean hs = new Hocsinhbean("Thien", true, dd.parse(ngay), "sv1", "K46D", 8.0);
			ArrayList<NguoiBean> ds = new ArrayList<NguoiBean>();
			ds.add(n1);ds.add(n2);ds.add(nv1);ds.add(nv2);ds.add(hs);
			System.out.println("Danh sach nhan vien: ");
			for(NguoiBean nguoi:ds)
			{
				if(nguoi instanceof NhanVienBean)
				{
					System.out.println(nguoi.toString());
				}
			}
			System.out.println("Danh sach nguoi tu do: ");
			for(NguoiBean nguoi:ds)
			{
				if(!(nguoi instanceof Hocsinhbean) && !(nguoi instanceof NhanVienBean))
				{
					System.out.println(nguoi.toString());
				}
			}
			System.out.println("Danh sach hoc sinh: ");
			for(NguoiBean nguoi:ds)
			{
				if(nguoi instanceof Hocsinhbean)
				{
					System.out.println(nguoi.toString());
				}
			}
			double t = 0;
			double dem =0;
			for(NguoiBean nguoi:ds)
			{
				if(nguoi instanceof NhanVienBean)
				{
					t+=((NhanVienBean) nguoi).getHsl();
					dem++;
				}
			}
			System.out.println("Tong hsl cua nhan vien la: "+t/dem);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}