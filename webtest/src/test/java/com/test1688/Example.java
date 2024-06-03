// package com.test1688;
//
// import org.json.JSONException;
// import org.json.JSONObject;
//
// import java.io.*;
// import java.net.URL;
// import java.net.URLConnection;
// import java.nio.charset.Charset;
//
// public class Example {
//     private static String readAll(Reader rd) throws IOException {
//         StringBuilder sb = new StringBuilder();
//         int cp;
//         while ((cp = rd.read()) != -1) {
//             sb.append((char) cp);
//         }
//         return  sb.toString();
//     }
//     public static JSONObject postRequestFromUrl(String url, String body) throws IOException, JSONException {
//         URL realUrl = new URL(url);
//         URLConnection conn = realUrl.openConnection();
//         conn.setDoOutput(true);
//         conn.setDoInput(true);
//         PrintWriter out = new PrintWriter(conn.getOutputStream());
//         out.print(body);
//         out.flush();
//         InputStream instream = conn.getInputStream();
//         try {
//             BufferedReader rd = new BufferedReader(new InputStreamReader(instream, Charset.forName("UTF-8")));
//             String jsonText = readAll(rd);
//             JSONObject json = new JSONObject(jsonText);
//             return json;
//         } finally {
//             instream.close();
//         }
//     }
//     public static JSONObject getRequestFromUrl(String url) throws IOException, JSONException {
//         URL realUrl = new URL(url);
//         URLConnection conn = realUrl.openConnection();
//         InputStream instream = conn.getInputStream();
//         try {
//             BufferedReader rd = new BufferedReader(new InputStreamReader(instream, Charset.forName("UTF-8")));
//             String jsonText = readAll(rd);
//
//
//             JSONObject json = new JSONObject(jsonText);
//             return json;
//         } finally {
//             instream.close();
//         }
//     }
//
//     public static void main(String[] args) throws IOException, JSONException {
//
//         for (int i = 0; i < 50; i++) {
//
//             // 请求示例 url 默认请求参数已经URL编码处理
//             String url = "https://search.1688.com/service/companyInfoSearchDataService?keywords=%B9%E3%D6%DD%C9%C0%C1%EC%B7%FE%CA%CE%D3%D0%CF%DE%B9%AB%CB%BE" +
//                     "&hideMainTab=1&spm=a26352.13672862.searchbox.input&beginPage=" + i + "&async=true&asyncCount=&pageSize=20" +
//                     "&requestId=fZEZ8i7kzwQimZA8wWKSDxm7FETahkM2Fmp1701333192200&sessionId=c0632ff0a6e14926bada3fe5edb661eb&startIndex=0&pageName=findPCFactory";
//             JSONObject json = getRequestFromUrl(url);
//
//             System.out.println(json.toString());
//         }
//     }
//
// }