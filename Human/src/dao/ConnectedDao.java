
package dao;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.spi.DirStateFactory.Result;

public class ConnectedDao {
	public Connection cn;
	public void ketnoi() throws Exception {
		//B1: Xac dinh HQTCSDL
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		System.out.println("Da xac dinh HQTCSDL");
		cn = DriverManager.getConnection("jdbc:sqlserver://MSI:1433;databaseName=Nhom4; user=sa; password=123123");
		System.out.println("Da ket noi");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//B1: Ket noi
			ConnectedDao kn = new ConnectedDao();
			kn.ketnoi();
			//B2: Tao cau lenh SQL
			String sql = "SELECT * FROM Nhanvien";
			//B3: Tao cau lenh PrepareStatement
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			//B4: thuc hien cau lenh
			ResultSet rs = cmd.executeQuery();
			//B5: Duyet qua danh sach
			while(rs.next()) {
				System.out.println(rs.getString("MSV")); // lay ra masv tai vi tri con tro
				System.out.println(rs.getString("Hovaten"));
				System.out.println(rs.getBoolean("Gioitinh"));
				System.out.println(rs.getDouble("HSL"));
				System.out.println("--------");
			}
			rs.close();
			// Cac cau lenh SQL
			}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}