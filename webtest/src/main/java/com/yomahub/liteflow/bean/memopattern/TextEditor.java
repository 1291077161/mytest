package com.yomahub.liteflow.bean.memopattern;

import java.util.Stack;

/**
 * @Author: Joy
 * @Date: 2023/12/24 21:25
 * @Description: 发起人-文本编辑器
 */
public class TextEditor {

    private String text;

    private int cursorPosition;

    private Stack<TextState> undoStack;

    private Stack<TextState> redoStack;

    public TextEditor(){
        text = "";
        cursorPosition = 0;
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    /**
     * 编辑操作-输入字符
     * @param c 字符
     */
    public void type(char c){
        text = text.substring(0, cursorPosition) + c + text.substring(cursorPosition);
        cursorPosition++;
        saveState();
    }

    /**
     * 编辑操作-删除字符
     */
    public void delete(){
        if (cursorPosition>0){
            text = text.substring(0,cursorPosition-1)+text.substring(cursorPosition);
            cursorPosition--;
            saveState();
        }
    }

    /**
     * 撤销操作
     */
    public void undo(){
        if (!undoStack.isEmpty()){
            TextState previousState = undoStack.pop();
            text = previousState.getText();
            cursorPosition = previousState.getCursorPosition();
            redoStack.push(new TextState(text,cursorPosition));
        }
    }

    /**
     * 重做操作
     */
    public void redo(){
        if (!redoStack.isEmpty()){
            TextState nextState = redoStack.pop();
            text = nextState.getText();
            cursorPosition = nextState.getCursorPosition();
            undoStack.push(new TextState(text,cursorPosition));
        }
    }

    /**
     * 保存当前状态到备忘录
     * @return
     */
    public Memento saveState(){
        TextState currentState = new TextState(text, cursorPosition);
        undoStack.push(currentState);
        redoStack.clear();
        return currentState;
    }

    /**
     * 从备忘录恢复状态
     * @param memento
     */
    public void restoreState(Memento memento){
        TextState restoreState = (TextState) memento;
        text =restoreState.getText();
        cursorPosition = restoreState.getCursorPosition();
        redoStack.push(new TextState(text,cursorPosition));
        undoStack.pop();
    }

    /**
     * 获取当前文本内容
     * @return
     */
    public String getText(){
        return text;
    }

    /**
     * 获取当前光标位置
     * @return
     */
    public int getCursorPosition(){
        return cursorPosition;
    }
}

