//Switch细节

public class SwitchDetail {
	//编写一个main方法
	public static void main(String[] args) {

		//1. 表达式数据类型，应和case后的常量类型一致
		//或者是可以自动转成可以相互比较的类型，比如输入的是字符，而常量是int
		
		// char c = 'a';
		// //String c = "a";
		// switch (c) {
		// 	//case "a" :
		// 	case 'a' :
		// 		System.out.println("ok1");
		// 		break;
		// 	//case 'b' :
		// 	//case "hello" ://error
		// 	//case "20" ://ok
		// 	case 20 :
		// 		System.out.println("ok2");
		// 		break;
		// 	default :
		// 		System.out.println("ok3");
		// }
		
		//2. switch(表达式)中表达式的返回值必须是：（byte、short、int、char、enum[枚举]、String）
		// double c1 = 1.1;
		// switch (c1) {
		// 	case 1.1 :
		// 		System.out.println("ok1");
		// 		break;
		// 	case 2.1 :
		// 		System.out.println("ok2");
		// 		break;
		// 	default :
		// 		System.out.println("ok3");
		// }

		//3. case子句中的值必须是常量或者常量表达式，不能是变量
		
		// char c = 'a';
		// char c2 = 'c';
		// switch (c) {
		// 	case 'a' :
		// 		System.out.println("ok1");
		// 		break;
		// 	case c2 :
		// 		System.out.println("ok2");
		// 		break;
		// 	default :
		// 		System.out.println("ok3");
		// }
		 
		//4. default是可选的，当没有匹配的case时，执行default
		//如果没有default子句，又没有匹配任何常量，则没有输出
		
		//5. break语句用来在执行完一个case分支后使程序跳出switch语句块
		//如果没有写break，程序会顺序执行到switch结尾，除非遇到break语句

		char c = 'a';
		char c2 = 'c';
		switch (c) {
			case 'a' :
				System.out.println("ok1");
				//break;
			case 'b' :
				System.out.println("ok2");
				//break;
			default :
				System.out.println("ok3");
		}
	}
}