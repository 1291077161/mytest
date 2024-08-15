package com.yomahub.liteflow.bean.nio.demo1;

import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * @author Administrator
 */
public class NioClient {
    private static final String DEFAULT_HOST = "localhost";
    private static final int DEFAULT_PORT = 8080;

    private void connect() throws Exception {
        try (SocketChannel socketChannel = SocketChannel.open()) {
            socketChannel.configureBlocking(false);
            socketChannel.connect(new java.net.InetSocketAddress(DEFAULT_HOST, DEFAULT_PORT));

            while (!socketChannel.finishConnect()) {
                // 等待连接完成
            }

            ByteBuffer sendBuffer = ByteBuffer.wrap("Hello world from client!".getBytes("UTF-8"));
            socketChannel.write(sendBuffer);

            // 清空缓冲区以准备好接收服务器的响应
            ByteBuffer receiveBuffer = ByteBuffer.allocate(1024);

            // 等待服务器的响应
            boolean receivedResponse = false;
            while (!receivedResponse) {
                receiveBuffer.clear(); // 准备接收数据
                int bytesRead = socketChannel.read(receiveBuffer);
                if (bytesRead > 0) {
                    receiveBuffer.flip(); // 切换到读模式
                    byte[] data = new byte[receiveBuffer.remaining()];
                    receiveBuffer.get(data);
                    String response = new String(data, "UTF-8");
                    System.out.println("Received response: " + response);
                    receivedResponse = true;
                } else if (bytesRead < 0) {
                    // 如果客户端关闭了连接
                    System.out.println("Connection closed by the server.");
                    break;
                }
            }

        }
    }

    public static void main(String[] args) throws Exception {
        new NioClient().connect();
    }
}
