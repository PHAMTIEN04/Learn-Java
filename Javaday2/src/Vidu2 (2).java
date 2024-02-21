
public class Vidu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		trycatch v = new trycatch();
		try {
			System.out.println(v.thuong(10.0, 2.0));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
