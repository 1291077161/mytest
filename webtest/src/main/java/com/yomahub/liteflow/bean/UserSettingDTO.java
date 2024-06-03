package com.yomahub.liteflow.bean;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;

import java.util.HashMap;

@Data
public class UserSettingDTO  {
    private JSONArray column;

    private Long userId;


    private String code;
    public  Boolean isActive;

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        map.put("abc","aaaaa");
        map.put("acD","aaaaa");
        System.out.println("\"abc\".hashCode() = " + "abc".hashCode());
        System.out.println("\"acD\".hashCode() = " + "acD".hashCode());
        System.out.println("map = " + map);

    }
}
