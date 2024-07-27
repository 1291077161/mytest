package com.yomahub.liteflow.bean.designpattern.jieshiqipattern;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Joy
 * @Date: 2023/12/28 15:02
 * @Description: 环境角色
 */
@Data
public class Context {

    private Map<String,Integer> variables;

    public Context(){
        this.variables = new HashMap<String, Integer>();
    }

    public void setVariable(String name,int value){
        variables.put(name,value);
    }

    public int getVariable(String name){
        return variables.getOrDefault(name,0);
    }
    
}
