package com.wiot.survey.util;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.fastjson.JSONObject;

import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MapUtil {

	private  final Logger logger =LoggerFactory.getLogger(MapUtil.class);
	private final  OkHttpClient client = new OkHttpClient.Builder()
		      .connectTimeout(5, TimeUnit.SECONDS)
		      .writeTimeout(5, TimeUnit.SECONDS)
		      .readTimeout(5, TimeUnit.SECONDS)
		      .callTimeout(5, TimeUnit.SECONDS)
		      .build();
    /**
     * 
     * @param latitude  纬度，范围为 -90~90，负数表示南纬
     * @param longitude 经度，范围为 -180~180，负数表示西经
     * @return
     * @throws IOException 
     */
	public  String getAddress(String latitude,String longitude) throws IOException {

		// https://square.github.io/okhttp/4.x/okhttp/okhttp3/-http-url/
		// https://restapi.amap.com/v3/geocode/regeo?parameters
		HttpUrl url = new HttpUrl.Builder()
				.scheme("https")
				.host("restapi.amap.com")
				.addPathSegment("/v3/geocode/regeo")
				.addQueryParameter("key", "d55077c6511ef7d486e710d3b6b1fbdb")
				.addQueryParameter("location", (longitude+","+latitude))
				
				.build();

		Request request = new Request.Builder().url(url).build();
		
		

		try (Response response = client.newCall(request).execute()) {

			 
			if (response.isSuccessful()) {
				String bodyStr = response.body().string();
				JSONObject jsonObj = JSONObject.parseObject(bodyStr);
				String address=jsonObj.getJSONObject("regeocode").getString("formatted_address");
				return address;
			} 
		}
		return null;

	}

	public static void main(String[] args) throws IOException {
	
		new MapUtil().getAddress("116.481488","39.990464");
	}
}
