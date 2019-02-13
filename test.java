
public class Test {

	public static void main(String[] args)throws Exception{

		String apiKey = "6u69xxxxxxxxxxxxxxxxxxxxxx";
		String sender = "SEDEMO";

		Smsapi s = new Smsapi();
		s.setparams(apiKey, sender);
				       
		String response = s.send_sms("89xxxxxxxx","hello");
		System.out.println(response);
	    }
}
