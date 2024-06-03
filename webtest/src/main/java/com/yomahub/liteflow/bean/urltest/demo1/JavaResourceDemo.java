package com.yomahub.liteflow.bean.urltest.demo1;


import cn.hutool.core.io.IoUtil;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;
import java.util.Set;

public class JavaResourceDemo {

    public static void main(String[] args) throws IOException {
        //构建URL 指定资源的协议为http协议
        URL url = new URL("http://www.baidu.com");
        URL url2 = new URL("http://www.baidu.com");

        System.out.println("url.equals(url2) = " + url.equals(url2));
        //打开资源连接
        URLConnection urlConnection = url.openConnection();
        //获取资源输入流
        InputStream inputStream = urlConnection.getInputStream();
        //通过hutool工具类读取流中数据
        String content = IoUtil.read(new InputStreamReader(inputStream));
        System.out.println(content);

        //
        // Hashtable<String,String> hashtable = new Hashtable<>();
        // hashtable.put(null, "aa");


        // ResourceLoader


        // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();


        Map<String, String> getenv = System.getenv();

        Set<String> strings = getenv.keySet();

        Set<Map.Entry<String, String>> entries = getenv.entrySet();

        for (Map.Entry<String, String> entry : entries) {

            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }


        // Environment e = new PropertySources()

    }

}