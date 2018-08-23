package com.example.telephone;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.stereotype.Component;

@Component("Hook")
public class InputWebhooks implements InputHooks{
	@Override
	public void testUse() throws Throwable {
		String out = sendRequest("https://b24-ckaz7s.bitrix24.ru/rest/1/2zt671n49iwiy7hs/task.item.list");
		System.out.println(out);
	}
	
	public static String sendRequest(String request) throws IOException {
		HttpURLConnection con = (HttpURLConnection) new URL(request).openConnection();
		con.setRequestMethod("GET");
		int responseCode = con.getResponseCode();
		if (responseCode != 200) {
			return null;
		}
		//String res = IOUtils.toString(con.getInputStream(), "UTF-8");
		String res = con.getInputStream().toString();
		return res;

	}
}
