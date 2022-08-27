//演示转义字符的使用

public class ChangeChar {

	public static void main(String[] args) {

//		\t：一个制表位，实现对齐的功能
		System.out.println("北京\t天津\t上海");
//		\n：换行符
		System.out.println("jack\nsmith\nary");
//		\\：一个\
		System.out.println("F:\\Java\\code");
//		\"：一个“
		System.out.println("老张说:\"要好好学习java，有前途\"");
//		\'：一个‘
		System.out.println("老张说:\'要好好学习java，有前途\'");

//		\r：一个回车
//		1. 输出 老张的
//		2. \r 表示回车 - 回车过后将光标放到输出的当前行的第一个字符，用后面的字符替换当前的字符
		System.out.println("老张的\r教育"); // 教育的
		System.out.println("老张的\r\n教育"); // 老张的
											 // 教育


	}
}