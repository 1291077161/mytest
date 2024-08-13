package com.yomahub.liteflow.bean.chainresposibilitypattern.demo1;

/**
 * 处理者接口
 * @author Joy
 * @date 2024/8/9
 *
 */

abstract class Handler {
    protected Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public abstract void handleRequest(String request);
}

// 具体处理者A
class ConcreteHandlerA extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("A")) {
            System.out.println("ConcreteHandlerA handled request: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

// 具体处理者B
class ConcreteHandlerB extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.equals("B")) {
            System.out.println("ConcreteHandlerB handled request: " + request);
        } else if (next != null) {
            next.handleRequest(request);
        }
    }
}

/**
 * 客户端代码
 * @author Administrator
 */
public class Client {
    public static void main(String[] args) {
        // 创建处理者对象
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();

        // 设置责任链
        handlerA.setNext(handlerB);

        // 向责任链提交请求
        handlerA.handleRequest("A");
        handlerA.handleRequest("B");
        handlerA.handleRequest("C");
    }
}
