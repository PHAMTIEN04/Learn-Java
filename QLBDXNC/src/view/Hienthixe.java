package view;

import bo.XeBo;
import dao.XeDao;

public class Hienthixe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			XeBo x = new XeBo();
			x.getds();
			x.HienThi();
			x.File_Tinh_Tien();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
