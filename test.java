
public class Test {

	public static void main(String[] args)throws Exception{

		String apiKey = "6u69xxxxxxxxxxxxxxxxxxxxxx";
		String sender = "SEDEMO";

		Smsapi s = new Smsapi();
		s.setparams(apiKey, sender);
				       
		String response = s.send_sms("89xxxxxxxx","Hello, This is a test message from spring edge");
		System.out.println(response);
	    }
}
