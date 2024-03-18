import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check_phone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("^0[0-9]{9,10}");
		Matcher m = p.matcher("09888492321");
		Boolean check_phone = m.find();
		System.out.println(check_phone);
	}

}
