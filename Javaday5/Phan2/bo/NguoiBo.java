package bo;

import java.util.ArrayList;

import bean.Hocsinhbean;
import bean.NguoiBean;
import bean.NhanVienBean;
import dao.NguoiDao;

public class NguoiBo {
	public NguoiDao nd = new NguoiDao(); 
	public ArrayList<NguoiBean> ds;
	public ArrayList<NguoiBean> getds() throws Exception{
		ds = nd.getds();
		return ds;
	}
	public void TimKiem(String key) {
		Boolean check = false;
		for(NguoiBean nb : ds) {
			if(nb.getHoten().trim().toLowerCase().contains(key.trim().toLowerCase())) {
				System.out.println(nb.toString());
				check = true;
			}
			}
		if(check == false) {
			System.out.println("Khong tim thay!!!");
		}
		
	}
	public void HienThi_nv() {
		System.out.println("** Danh Sach Nhan Vien **");
		for(NguoiBean nb : ds) {
			if(nb instanceof NhanVienBean) {
				System.out.println(nb.toString());
			}
		}
	}
	public void HienThi_hs() {
		System.out.println("** Danh Sach Hoc Sinh **");
		for(NguoiBean nb : ds) {
			if(nb instanceof Hocsinhbean) {
				System.out.println(nb.toString());
			}
		}
	}
	public void Danh_gia_d() {
		System.out.println("**Hoc Sinh Dau **");
		for(NguoiBean nb : ds) {
			if(nb instanceof Hocsinhbean) {
				if(((Hocsinhbean) nb).getDtb() >= 5) {
					System.out.println(nb.toString());
				}
			}
		}
	}
	public void Danh_gia_r() {
		System.out.println("**Hoc Sinh Rot **");
		for(NguoiBean nb : ds) {
			if(nb instanceof Hocsinhbean) {
				if(((Hocsinhbean) nb).getDtb() < 5) {
					System.out.println(nb.toString());
				}
			}
		}
	}
	
	
	public void HienThi() {
		for(NguoiBean nb : ds) {
			System.out.println(nb.toString());
		}
	}
}
