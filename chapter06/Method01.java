
public class Method01 {
	//编写一个main方法
	public static void main(String[] args) {
		//方法使用
		//1. 方法写好后，如果不去调用（使用），不会生效输出语句
		//2. 先创建一个对象，然后调用其方法
		Person p1 = new Person();
		p1.speak();//调用方法
		p1.cal01();//调用cal01方法
		p1.cal02(5);//调用cal02方法，同时给n = 5;
		p1.cal02(10);//调用cal02方法，同时给n = 10;

		//调用getSum方法，同时给num1 = 10， num2 = 20
		//把方法 getSum 返回的值， 赋给 变量 returnRes
		int returnRes = p1.getSum(10, 20);
		System.out.println("getSum返回的值=" + returnRes);

	}
}

class Person {
	String name;
	int age;
	//方法（成员方法）
	//添加 speak 成员方法,输出 “我是一个好人”
	//解读
	//1. public 表示方法是公开的
	//2. void 表示方法没有返回值
	//3. speak()  - speak方法名  （）形参列表，目前没有任何的值在里面，为空
	//4. {} 方法体，可以写我们要执行的代码
	//5. System.out.println("我是一个好人"); 表示我们的方法就是输出一句话
	//
	public void speak() {
		System.out.println("我是一个好人");
	}

	//添加 cal01 成员方法,可以计算从 1+..+1000 的结果
	public void cal01() {
		//可以有个循环完成
		int res = 0;
		for (int i = 1; i <= 1000; i++) {
			res += i;
		}
		System.out.println("cal01计算结果=" + res);
	}

	//添加 cal02 成员方法,该方法可以接收一个数 n，计算从 1+..+n 的结果
	//解读
	//1. (int n) 形参列表，表示当前有一个形参 n，可以接受用户的输入
	public void cal02(int n) {
		//可以有个循环完成
		int res = 0;
		for (int i = 1; i <= n; i++) {
			res += i;
		}
		System.out.println("cal02计算结果=" + res);
	}

	//添加 getSum 成员方法,可以计算两个数的和
	//解读
	//1. public 表示方法是公开的
	//2. int 表示方法执行后，返回一个int值
	//3. getSum 方法名
	//4. (int sum1, int sum2) 形参列表，有2个形参，可以接受用户传入的两个数
	//5. return res 表示把 res 的值，返回
	public int getSum(int num1, int num2) {
		int res = num1 + num2;
		return res;
	}
}