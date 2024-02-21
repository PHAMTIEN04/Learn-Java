
public class trycatch {
	// Xử lý tiểu nhân
	public double thuong(double a,double b) throws Exception  {
		double s = a/b;
		return s;
	}
	// throws Exception nén lỗi vào gói Exception lớn nhất
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// nếu chương trình lỗi cú pháp thì sẽ không chạy
		// nếu chương trình đúng cú pháp khi chạy có thể sẽ phát sinh ra lỗi
		// java có thể bắt lỗi trong quá trình chạy 
		// cú pháp : try{
		// 				câu lệnh 1;
		//				..........
		//				câu lệnh n;
		//			}
		//			catch(Exception biến){
		//				xử lý lỗi
		//			}
		// Nếu câu lệnh i = (i=i..n) bị lỗi thì quyền điều khiên chương trình sẽ 
		// nhảy về khối xử lý lỗi câu lệnh i + 1 trở đi không làm
		// + Các loại bắt lỗi:
		// - Xử lý lỗi theo kiểu trẻ con (không in ra)
		// - Xử lý quân tử (in ra)
		// - Xử lý tiểu nhân (đổ thừa)
		try {
			int a=5,b=0;
			double s=a/b;
			System.out.println(s);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
