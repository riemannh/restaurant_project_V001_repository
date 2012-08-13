package com.res.httpclient;


import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created on restaurant project V001R001.
 * Descriptions:
 * User: haoguanghao
 * Date: 8/12/11 7:43 AM
 * Modifier:
 * Modify Date: 8/12/12 7:43 AM
 * Modify:
 */
public class MessageClient {
    /**
     * send message to server
     *
     * @param params
     * @return
     */
    public String sendMessage(Map<String, String> params) {
        String json = null;
        BufferedReader reader = null;
        try {
            HttpClient client = new DefaultHttpClient();
            HttpUriRequest request = null;
            try {
                request = getRequest("http://127.0.0.1:8080/serverPortal", params);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            HttpResponse response = client.execute(request);
            reader = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
            StringBuilder stringBuilder = new StringBuilder();
            for (String s = reader.readLine(); s != null; s = reader.readLine()) {
                stringBuilder.append(s);
            }
            json = stringBuilder.toString();
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    /**
     * create httpRequest
     *
     * @param url
     * @param params
     * @return
     * @throws UnsupportedEncodingException
     */
    private HttpUriRequest getRequest(String url, Map<String, String> params) throws UnsupportedEncodingException {
        List<NameValuePair> paramList = new ArrayList<NameValuePair>();
        for (String key : params.keySet()) {
            paramList.add(new BasicNameValuePair(key, params.get(key)));
        }
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(paramList);
        HttpPost request = new HttpPost(url);
        request.setEntity(entity);
        return request;
    }

}
