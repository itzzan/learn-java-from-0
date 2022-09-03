//演示逻辑运算符的使用
//
public class InverseOperator {

	//编写一个main方法
	public static void main(String[] args) {
		
		// ! 非操作（取反操作）
		System.out.println(60 > 20); //T
		System.out.println(!(60 > 20)); //F

		//a^b：逻辑异或，当a和b不同时，则结果为true，否则为false
		boolean b = (10 > 1) ^ (3 < 5);// T 和 T ==> F
		System.out.println(b); //F

		boolean c = (10 > 1) ^ (3 > 5);// T 和 F ==> T
		System.out.println(c); //T

	}
}