package com.smsapi;

import java.net.HttpURLConnection;
import java.net.URL;
import java.io.*;
import java.net.URLEncoder;

public class smsapi {
	
	static String working_key ;
	static String sender_id;
	String mob_no;
	String message;

	public  void setparams(String apikey,String senderid)
	{ 
		working_key	=	apikey;
		sender_id	= 	senderid;
		api_dev		=	'https://www.springedge.com/';
		api_url		= 	'http://instantalerts.co/api/web';
	}

	public String process_sms(String mob_no,String message) throws IOException, KeyManagementException, NoSuchAlgorithmException
	{   	
		message=URLEncoder.encode(message, "UTF-8");				
		URL url = new URL(api_url+"/send?apikey="+working_key+"&sender="+sender_id+"&to="+mob_no+"&message="+message );
		
		//System.out.println("url look like " + url );

		HttpURLConnection con = (HttpURLConnection) url.openConnection();
		con.setRequestMethod("GET");
		con.setDoOutput(true);
		con.getOutputStream();
		con.getInputStream();
		BufferedReader rd;
		String line;
		String result = "";
		rd = new BufferedReader(new InputStreamReader(con.getInputStream()));
		while ((line = rd.readLine()) != null)
		{
			result += line;
		}
		rd.close(); 
		System.out.println("Result is" + result);
		return result;				
	}


	public  void send_sms(String mob_no,String message) throws IOException, KeyManagementException, NoSuchAlgorithmException
	{
		process_sms(mob_no, message, );  										
	}
	     
}
