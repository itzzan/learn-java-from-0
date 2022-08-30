public class VarDetail {
	public static void main(String[] args) {
		//变量必须先声明，后使用，即有顺序
		int a = 50;
		System.out.println(a);//50
		//该区域的数据/值可以在同一类型范围内不断变化
		//a = "jack";//error
		a = 88;
		System.out.println(a);//88

		//error
		// System.out.println(a);
		// int a = 50;
		// 
		// 变量在同一个作用域内不能重名
		//int a = 78;//error
		//System.out.println(a);

	}
}

class Dog {
	public static void main(String[] args) {
		int a = 666;
		
	}
}