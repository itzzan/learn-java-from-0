//演示逻辑运算符的使用
//
public class LogicOperator01 {

	//编写一个main方法
	public static void main(String[] args) {
		
		//短路与&& 和逻辑与&
		//&& 使用
		int age = 50;
		if (age > 20 && age < 90) {
			System.out.println("ok100");
		} 

		//& 使用
		if (age > 20 & age < 90) {
			System.out.println("ok200");
		} 

		//&& 和 & 的区别
		//对于&&短路与而言，如果第一个条件为 false ,后面的条件不再判断，即直接退出，后面的不会执行
		//对于&逻辑与而言，如果第一个条件为 false ,后面的条件仍然会判断
		
		int a = 4;
		int b = 9;
		if (a < 1 && ++b < 50) {
			System.out.println("ok300");
		} 
		System.out.println("a = " + a + " b = " + b);//4 9
		
		if (a < 1 & ++b < 50) {
			System.out.println("ok400");
		} 
		System.out.println("a = " + a + " b = " + b);//4 10



	}
}