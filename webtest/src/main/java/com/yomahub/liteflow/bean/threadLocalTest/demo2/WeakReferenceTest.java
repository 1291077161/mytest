package com.yomahub.liteflow.bean.threadLocalTest.demo2;

import java.lang.ref.WeakReference;

public class WeakReferenceTest {
    public static void main(String[] args) {
        Object object = new Object();
        WeakReference<Object> testWeakReference = new WeakReference<>(object);
        System.out.println("GC回收之前，弱引用："+testWeakReference.get());
        //触发系统垃圾回收
        System.gc();
        System.out.println("GC回收之后，弱引用："+testWeakReference.get());
        //手动设置为object对象为null
        object=null;
        System.gc();
        System.out.println("对象object设置为null，GC回收之后，弱引用："+testWeakReference.get());
    }
}
// 运行结果：
// GC回收之前，弱引用：java.lang.Object@7b23ec81
// GC回收之后，弱引用：java.lang.Object@7b23ec81
// 对象object设置为null，GC回收之后，弱引用：null
