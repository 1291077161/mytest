package com.yomahub.liteflow.bean.netprogramming.demo1;

import java.net.InetSocketAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetSocketAddress socketAddress = new InetSocketAddress("127.0.0.1",8080);
		InetSocketAddress socketAddress2 = new InetSocketAddress("localhost",9000);
		// 获取主机名
		System.out.println(socketAddress.getHostName());
		// 获取地址
		System.out.println(socketAddress.getAddress());
		System.out.println(socketAddress2.getAddress());
		// 获取端口号
		System.out.println(socketAddress.getPort());
		System.out.println(socketAddress2.getPort());

	}
}
