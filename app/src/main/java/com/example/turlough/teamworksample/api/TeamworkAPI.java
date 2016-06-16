package com.example.turlough.teamworksample.api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



	public class TeamworkAPI {

	public String get(String endpoint) throws IOException {
		
		HttpURLConnection connection = null;
		
		String APIKey = "wood305tree";
		String TeamworkURL = "http://turlough.teamwork.com/";

			URL url = new URL( TeamworkURL + endpoint );
	        connection = (HttpURLConnection) url.openConnection();
	        connection.setRequestMethod("GET");
	        
	        String userpassword = APIKey + ":" + "";
	        String encodedAuthorization = Base64Coder.encodeString( userpassword );
	        connection.setRequestProperty("Authorization", "Basic "+ encodedAuthorization);
	        
	        InputStream responseStream = connection.getInputStream();
	        
			return ( streamToString( responseStream) );

	}
	
	public static String streamToString(InputStream in) throws IOException {
		StringBuilder out = new StringBuilder();
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		for(String line = br.readLine(); line != null; line = br.readLine()) 
		out.append(line);
		br.close();
		return out.toString();
	}
}
