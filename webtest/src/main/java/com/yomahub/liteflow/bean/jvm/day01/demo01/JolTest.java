package com.yomahub.liteflow.bean.jvm.day01.demo01;

import lombok.SneakyThrows;
import org.openjdk.jol.info.GraphLayout;

/**
 *
 * @author Joy
 * @date 2024/8/27
 *
 */

public class JolTest {

    @SneakyThrows
    public static void main(String[] args) {
        byte[] data = new byte[1024];
        String usage = GraphLayout.parseInstance(data).toFootprint();
        System.out.println(usage);


        String s = "aa";
        String footprint = GraphLayout.parseInstance(s).toFootprint();
        System.out.println("footprint = " + footprint);
        
        System.in.read();

    }


}
