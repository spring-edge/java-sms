import com.smsapi;
import java.util.*;

public class test {

	public static void main(String[] args)throws Exception{

		string apikey = "675031xxxxxxxxxxxx"
		string sender = "SEDEMO"

		smsapi s = new smsapi();		
		s.setparams(apikey, sender);
		       
		String response = s.send_sms("98xxxxxxxx","hello");
		System.out.println(response);
	    }
}
