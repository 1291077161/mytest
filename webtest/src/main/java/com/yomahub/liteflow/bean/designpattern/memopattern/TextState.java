package com.yomahub.liteflow.bean.designpattern.memopattern;

/**
 * @Author: Joy
 * @Date: 2023/12/24 21:23
 * @Description: 具体备忘录
 */
public class TextState implements Memento{
    /**
     * 文本
     */
    private String text;
    /**
     * 当前鼠标位置
     */
    private int cursorPosition;

    public TextState(String text,int cursorPosition){
        this.text = text;
        this.cursorPosition = cursorPosition;
    }

    @Override
    public String getText() {
       return text;
    }

    public int getCursorPosition(){
        return cursorPosition;
    }
}