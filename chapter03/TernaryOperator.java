//演示三元运算符的使用

public class TernaryOperator {

	//编写一个main方法
	public static void main(String[] args) {

		int a = 10;
		int b = 99;
		//解读
		//1. a > b 为 false
		//2. 返回 b--
		//3. 先返回b的值，再b减一
		int result = a > b ? a++ : b--;//99
		System.out.println(result);
		
		


	}

}