package edu.njxzc.tcs.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
public class HttpRequest {
	private static Logger logger = LogManager.getLogger(HttpRequest.class.getName());
	 
	    /**
	     * httpPost
	     * @param url  路径
	     * @param jsonParam 参数
	     * @return
	     */
	    public static JSONObject httpPost(String url,JSONObject jsonParam){
	        return httpPost(url, jsonParam, false);
	    }
	    
	    
	    public static JSONObject httpPost(String url,Map param){
	        return httpPost(url, param, false);
	    }
	    
	 
	    
	    public static String xmlPost(String url,String xmlParam){
	    	String str = null;
	    	DefaultHttpClient httpClient = new DefaultHttpClient();
	    	HttpPost method = new HttpPost(url);
	    	try {
	            if (null != xmlParam) {
	                //解决中文乱码问题
	                StringEntity entity = new StringEntity(xmlParam, "utf-8");
	                entity.setContentEncoding("UTF-8");
	                entity.setContentType("application/json");
	                method.setEntity(entity);
	            }
	            HttpResponse result = httpClient.execute(method);
	            url = URLDecoder.decode(url, "UTF-8");
	            /**请求发送成功，并得到响应**/
	            if (result.getStatusLine().getStatusCode() == 200) {
	                try {
	                    /**读取服务器返回过来的json字符串数据**/
	                    str = EntityUtils.toString(result.getEntity());
	                    //将所有null 变成json字符串
	                    str=str.replaceAll("null","\"null\"");
	                    /**把json字符串转换成json对象**/
	                    return str;
	                } catch (Exception e) {
	                    logger.error("post请求提交失败:" + url, e);
	                }
	            }
	        } catch (IOException e) {
	            logger.error("post请求提交失败:" + url, e);
	        }
	        return str;
	    } 
	    /**
	     * post请求
	     * @param url         url地址
	     * @param jsonParam     参数
	     * @param noNeedResponse    不需要返回结果
	     * @return
	     */
	    public static JSONObject httpPost(String url,JSONObject jsonParam, boolean noNeedResponse){
	        //post请求返回结果
	        DefaultHttpClient httpClient = new DefaultHttpClient();
	        JSONObject jsonResult = null;
	        HttpPost method = new HttpPost(url);
	        try {
	            if (null != jsonParam) {
	                //解决中文乱码问题
	                StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
	                entity.setContentEncoding("UTF-8");
	                entity.setContentType("application/json");
	                method.setEntity(entity);
	            }
	            HttpResponse result = httpClient.execute(method);
	            url = URLDecoder.decode(url, "UTF-8");
	            /**请求发送成功，并得到响应**/
	            if (result.getStatusLine().getStatusCode() == 200) {
	                String str = "";
	                try {
	                    /**读取服务器返回过来的json字符串数据**/
	                    str = EntityUtils.toString(result.getEntity());
	                    if (noNeedResponse) {
	                        return null;
	                    }
	                    //将所有null 变成json字符串
	                    str=str.replaceAll("null","\"null\"");
	                    /**把json字符串转换成json对象**/
	                    jsonResult = JSONObject.parseObject(str);
	                } catch (Exception e) {
	                    logger.error("post请求提交失败:" + url, e);
	                }
	            }
	        } catch (IOException e) {
	            logger.error("post请求提交失败:" + url, e);
	        }
	        return jsonResult;
	    }
	    
	    
		 
	    /**
	     * post请求
	     * @param url         url地址
	     * @param jsonParam     参数
	     * @param noNeedResponse    不需要返回结果
	     * @return
	     */
	    public static JSONObject httpPost(String url,Map jsonParam, boolean noNeedResponse){
	        //post请求返回结果
	        DefaultHttpClient httpClient = new DefaultHttpClient();
	        JSONObject jsonResult = null;
	        HttpPost method = new HttpPost(url);
	        try {
	            if (null != jsonParam) {
	                //解决中文乱码问题
	                StringEntity entity = new StringEntity(jsonParam.toString(), "utf-8");
	                entity.setContentEncoding("UTF-8");
	                entity.setContentType("application/json");
	                method.setEntity(entity);
	            }
	            HttpResponse result = httpClient.execute(method);
	            url = URLDecoder.decode(url, "UTF-8");
	            /**请求发送成功，并得到响应**/
	            if (result.getStatusLine().getStatusCode() == 200) {
	                String str = "";
	                try {
	                    /**读取服务器返回过来的json字符串数据**/
	                    str = EntityUtils.toString(result.getEntity());
	                    if (noNeedResponse) {
	                        return null;
	                    }
	                    //将所有null 变成json字符串
	                    str=str.replaceAll("null","\"null\"");
	                    /**把json字符串转换成json对象**/
	                    jsonResult = JSONObject.parseObject(str);
	                } catch (Exception e) {
	                    logger.error("post请求提交失败:" + url, e);
	                }
	            }
	        } catch (IOException e) {
	            logger.error("post请求提交失败:" + url, e);
	        }
	        return jsonResult;
	    }
	    
	    
	    /**
	     * 发送get请求
	     * @param url    路径
	     * @return
	     */
	    public static JSONObject httpGet(String url){
	        //get请求返回结果
	        JSONObject jsonResult = null;
	        try {
	            DefaultHttpClient client = new DefaultHttpClient();
	            //发送get请求
	            HttpGet request = new HttpGet(url);
	            HttpResponse response = client.execute(request);
	 
	            /**请求发送成功，并得到响应**/
	            if (response.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
	                /**读取服务器返回过来的json字符串数据**/
	                String strResult = EntityUtils.toString(response.getEntity());
	                /**把json字符串转换成json对象**/
	                jsonResult = JSONObject.parseObject(strResult);
	                url = URLDecoder.decode(url, "UTF-8");
	            } else {
	                logger.error("get请求提交失败:" + url);
	            }
	        } catch (IOException e) {
	            logger.error("get请求提交失败:" + url, e);
	        }
	        return jsonResult;
	    }
	
	    public static Map<String, Object> parseJSON2Map(String jsonStr){
	        Map<String, Object> map = new HashMap<String, Object>();
	        //最外层解析
	       JSONObject json =JSONObject.parseObject(jsonStr);
	        for(Object k : json.keySet()){
	          Object v = json.get(k); 
	          //如果内层还是数组的话，继续解析
	          if(v instanceof JSONArray){
	            List<Map<String, Object>> list = new ArrayList<Map<String,Object>>();
	            Iterator<Object> it = ((JSONArray) v).iterator();
	            while(it.hasNext()){
	            	Object json2 = it.next();
	            	list.add(parseJSON2Map(json2.toString()));
	            }
	            map.put(k.toString(), list);
	          } else {
	            map.put(k.toString(), v);
	          }
	        }
	        return map;
	      }
	      
	    
    
    
    public static JSONObject post(String url, Map<String, String> params){  
        DefaultHttpClient httpclient = new DefaultHttpClient();  
        JSONObject jsonResult = null;
        HttpPost post = postForm(url, params);  
        
        try {
			HttpResponse result = httpclient.execute(post);
			url = URLDecoder.decode(url, "UTF-8");
	        /**请求发送成功，并得到响应**/
	        if (result.getStatusLine().getStatusCode() == 200) {
	            String str = "";
	            try {
	                /**读取服务器返回过来的json字符串数据**/
	                str = EntityUtils.toString(result.getEntity());
	                //将所有null 变成json字符串
	                str=str.replaceAll("null","\"null\"");
	                /**把json字符串转换成json对象**/
	                jsonResult = JSONObject.parseObject(str);
	            } catch (Exception e) {
	                logger.error("post请求提交失败:" + url, e);
	            }
	        }
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        httpclient.getConnectionManager().shutdown();  
        
        return jsonResult;
    }
    
    private static HttpPost postForm(String url, Map<String, String> params) {

        HttpPost httpost = new HttpPost(url);
        List<NameValuePair> nvps = new ArrayList<NameValuePair>();

        Set<String> keySet = params.keySet();
        for (String key : keySet) {
            nvps.add(new BasicNameValuePair(key, params.get(key)));
        }

        try {
            httpost.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
        } catch (UnsupportedEncodingException e) {
        }

        return httpost;
    }


	

    
}