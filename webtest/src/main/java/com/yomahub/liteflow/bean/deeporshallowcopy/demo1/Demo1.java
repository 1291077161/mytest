package com.yomahub.liteflow.bean.deeporshallowcopy.demo1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springblade.core.tool.jackson.JsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class Demo1 {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(Demo1.class);

        List<String> stringList = new ArrayList<>();
        stringList.add("aa");
        stringList.add("bb");
        stringList.add("cc");
        stringList.add("dd");
        logger.info("before string : {}", JsonUtil.toJson(stringList));
        List<String> strings = new ArrayList<>(stringList);

        logger.info("before string : {}", JsonUtil.toJson(strings));
        for (String s : stringList) {
            s = "ee";
        }
        logger.info("after string : {}", JsonUtil.toJson(stringList));
        logger.info("after string : {}", JsonUtil.toJson(strings));

    }
}
