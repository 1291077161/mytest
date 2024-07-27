package com.yomahub.liteflow.bean.designpattern.memopattern;

/**
 * @Author: Joy
 * @Date: 2023/12/24 21:36
 * @Description:
 */
public class Client {
    public static void main(String[] args) {

        TextEditor textEditor = new TextEditor();
        textEditor.type('A');
        textEditor.type('B');
        textEditor.type('C');
        textEditor.type('D');
        //删除字符
        textEditor.delete();
        //撤销操作
        textEditor.undo();
        //输出当前文本和光标位置
        System.out.println("Current text:"+textEditor.getText());
        System.out.println("Cursor position:"+textEditor.getCursorPosition());
        //保存状态
        Memento saveState = textEditor.saveState();
        textEditor.type(' ');
        textEditor.type('E');
        textEditor.type('F');
        textEditor.type('G');
        System.out.println("Current text:"+textEditor.getText());
        System.out.println("Cursor position:"+textEditor.getCursorPosition());
        //输出恢复后的文本和光标位置
        textEditor.restoreState(saveState);

        System.out.println("Current text:"+textEditor.getText());
        System.out.println("Cursor position:"+textEditor.getCursorPosition());

    }
}