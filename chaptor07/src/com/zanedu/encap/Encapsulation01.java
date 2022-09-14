package com.zanedu.encap;

public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
//        person.name = "jack";ok
//        person.age = 3000;error, 私有无法访问
//        person.setName("jack");
//        person.setName("jacktomcat 你好吗");
        person.setName("Zan");
        person.setAge(20);
        person.setSalary(3000);
        System.out.println(person.info());
//        System.out.println(person.getSalary());
        //如果我们直接使用构造器指定属性
//        Person smith = new Person("smith", 2000, 50000);
//        System.out.println("=========smith的信息==========");
//        System.out.println(smith.info());
    }
}

//不能随便查看人的年龄,工资等隐私，并对设置的年龄进行合理的验证。
//年龄合理就设置，否则给默认 年龄, 必须在 1-120, 年龄， 工资不能直接查看 ， name 的长度在 2-6 字符 之间
//工资是自己能够设置，但不能够查看，因此在getsalary里面加入需求

class Person {
    public String name;
    private int age;
    private double salary;

    //有三个属性的构造器
    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        //我们可以将set方法写在构造器中，这样仍然可以验证，仍然可以判断
        setName(name);//等价于this.setName 因为是在同一个类中
        setSalary(salary);
        setAge(age);
    }

    //构造器
    public Person() {

    }

    //自己写setXXX 和 getXXX 太慢，可以使用快捷键
    //然后根据要求来完善

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验，相当于增加了业务逻辑
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字的长度不对，需要2-6字符，默认名字");
            this.name = "无名人";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        //判断
        if (age >= 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("你设置的年龄不对，需要在1-120之间，默认年龄18");
            this.age = 18;//给一个默认年龄
        }
    }

    public double getSalary() {
        //可以这里增加读当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //写一个方法，返回属性信息
    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }

    //自己写setXXX 和 getXXX 太慢，可以使用快捷键
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }

}
