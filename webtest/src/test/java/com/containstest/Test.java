package com.containstest;

public class Test {
    public static void main(String[] args) {
        Zi z1 = new Zi();  //这里会先调用父类的无参构造，然后调用自己的无参构造
        //这里会调用父类的有参构造
        //Zi z2 = new Zi(10,"aa");
    }
}

class Fu {
    int num;
    public Fu() {
        System.out.println("父类的无参构造");
    }

    public Fu(int num, String name) {
        System.out.println("num = " + num + name);
        System.out.println("父类的有参构造");
    }
    public void add() {
        System.out.println("aaa");
    }
}

class Zi extends Fu {
    String num;
    public Zi() {
        //super();
        //super(11,"aa");
        //this();
        this(100,"aa");
        //this.num = 100;
        //super.add();
        System.out.println("子类的无参构造");
    }

    public Zi(int num,String name) {
        //this();
        //super(num, name);
    }
    private void get() {

        //super(100,"aaa");
        super.add();
    }
}