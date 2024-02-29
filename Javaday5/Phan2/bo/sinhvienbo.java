package bo;

import java.util.ArrayList;

import bean.sinhvienbean;
import dao.sinhviendao;

public class sinhvienbo {
	sinhviendao svdao = new sinhviendao();
	public ArrayList<sinhvienbean> ds;
	public ArrayList<sinhvienbean> getsinhvien() throws Exception{
		ds = svdao.getsinhvien();
		return ds;
	}
	public void HienThi() {
		for(sinhvienbean sv:ds) {
			System.out.println(sv.toString());
		}
	}
	//Tìm sinh viên theo mã hoặc họ tên
	//Thêm, xóa, sửa sinh viên
	//Thống kê sinh viên đậu, rớt theo khóa
}
