package view;

import dao.XeDao;

public class Hienthixe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			XeDao x = new XeDao();
			x.getds();
			x.HienThi();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
