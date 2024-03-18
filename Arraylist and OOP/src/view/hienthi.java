package view;

import bo.CnSv;

public class hienthi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CnSv c = new CnSv();
		c.Taolop("sv.txt");
		c.HienThi();
		c.HienThiTheoKhoa();
		c.HienThiTheoKhoaKey("cntt");
		c.DTBtungkhoa();
		c.LuuSvTheoFile();
		c.TimKiem("Hung", "cntt");
	}

}
