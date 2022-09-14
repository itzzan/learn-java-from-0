package com.zanedu.extend_;

//输入 ctrl + H 可以看到类的继承关系
public class Sub extends Base{

    public Sub(String name, int age) {
        //1. 调用父类的无参构造器 - 如下 或者 什么都不写，因为默认就是调用了父类无参构造器
//        super();//父类的无参构造器

        //2. 调用父类的 Base(String name) 构造器
//        super("zan");

        //3. 调用父类的 Base(String name, int age) 构造器
        super("king", 20);
        //super() 和 this() 都只能放在构造器第一行，因此这两个方法不能共存在一个构造器
        //this();不能在使用了
//        this("zan");
        System.out.println("子类Sub(String name, int age)构造器被调用....");


    }


    public Sub() { //无参构造器
        //这里其实隐藏了一句话，
//        super();//默认调用父类的无参构造器 - 写不写都一样，反正一定有
        super("smith", 10);
        System.out.println("子类Sub()构造器被调用....");
    }
    //当创建子类对象时，不管使用子类的哪个构造器，默认情况下总会去调用父类的无参构造器
    public Sub(String name) {
        //super 在使用时，必须放在构造器第一行(super 只能在构造器中使用，不能在成员方法里使用)
        super("tom", 21);
        //do nothing...
        System.out.println("子类Sub(String name)构造器被调用");
    }
    public void sayOK() { //子类方法
        //非私有的属性和方法可以在子类直接访问
        //私有的属性和方法不能在子类直接访问
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
//        System.out.println(n4);error 私有的属性和方法不能在子类直接访问
        test100();
        test200();
        test300();
//        test400();error
        //要通过父类提供公共的方法去访问
        System.out.println(getN4());
        callTest400();//
    }
}
