package com.example.javaClient1.Vacc_Total_Stat.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

@Service
public class Vacc_Total_StatServiceImp implements Vacc_Total_StatService{

	@Override
	public String Vacc_Total_Stat_list(HttpServletRequest reqeust, HttpServletResponse responsem, Model model) throws Exception {
		System.out.println("-----------------------Vacc_Total_Stat_list");
		
		String inputLine = null;
		StringBuffer outResult = new StringBuffer();
		HttpURLConnection conn = null;

        try {
            //URL 설정
            URL url = new URL("http://localhost:8080/vacc_Total_Stat/list");
 
            conn = (HttpURLConnection) url.openConnection();
            
            // type의 경우 POST, GET, PUT, DELETE 가능
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Content-Type", "application/json");
            conn.setRequestProperty("Transfer-Encoding", "chunked");
            conn.setRequestProperty("Connection", "keep-alive");
            conn.setDoOutput(true);
            
            // 리턴된 결과 읽기
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));
            while ((inputLine = in.readLine()) != null) {
                outResult.append(inputLine);
            }
            
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(outResult.toString());
        return outResult.toString();
	}
}
