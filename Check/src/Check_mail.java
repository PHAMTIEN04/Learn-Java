import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check_mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("^[\\w.-]+@[\\w.-]+\\.[\\w]+$");
		Matcher m = p.matcher("phamphuoctien@gmail.com");
		Boolean check_m = m.find();
		System.out.println(check_m);
	}

}
