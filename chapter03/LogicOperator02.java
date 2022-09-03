//演示逻辑运算符的使用
//
public class LogicOperator02 {

	//编写一个main方法
	public static void main(String[] args) {
		
		//短路或|| 和逻辑或|
		//短路或|| 使用
		
		int age = 50;
		if (age > 20 || age < 30) {
			System.out.println("ok100");
		} 

		//逻辑或| 使用
		if (age > 20 | age < 30) {
			System.out.println("ok200");
		} 

		//区别
		//(1)||短路或：如果第一个条件为 true，则第二个条件不会判断，最终结果为 true，效率高 
		//(2)| 逻辑或：不管第一个条件是否为 true，第二个条件都要判断，效率低
		
		int a = 4;
		int b = 9;
		if (a > 1 || ++b > 4) {
			System.out.println("ok300");
		} 
		System.out.println("a = " + a + " b = " + b);//4 9

		if (a > 1 | ++b > 4) {
			System.out.println("ok400");
		} 
		System.out.println("a = " + a + " b = " + b);//4 10
		
		

		



		
		
		



	}
}