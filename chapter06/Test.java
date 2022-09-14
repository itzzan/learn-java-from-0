
public class Test { //公有类
	int count = 9;//属性
	public void count1() {// Test类的成员方法
		count = 10;//属性
		System.out.println("count1=" + count);//10
	}
	public void count2() {// Test类的成员方法
		System.out.println("count1=" + count++);
	}

	//编写一个main方法
	public static void main(String[] args) {
		//解读
		//1. new Test() 是 匿名对象 - 也在堆里面，但只能用一次
		//2. new Test().count1() 创建好匿名对象后，就调用count1();
		new Test().count1();

		Test t1 = new Test();
		t1.count2();//9
		t1.count2();//10

	}
}

