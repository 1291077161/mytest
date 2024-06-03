package com.design.template;

public class DeHuaWrapper  {

    private Star deHua;

    public DeHuaWrapper(Star deHua) {
        this.deHua = deHua;
    }

    //@Override
    public void sing() {
        System.out.println("德华唱歌之前先彩排~！~");
        deHua.sing();
        System.out.println("德华唱歌之后要收钱~！~");
    }

    //@Override
    public void dance() {
        deHua.dance();
    }
}