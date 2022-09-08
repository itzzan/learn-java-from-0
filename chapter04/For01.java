
public class For01 {
	//编写一个main函数
	public static void main(String[] args) {
		//需求：打印10句：“你好，Zan教育”
		//传统的写法
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");
		// System.out.println("你好，Zan教育");

		//for的写法
		for (int i = 1; i <= 10; i++) {
			System.out.println("你好，Zan教育" + i);
		}
		//System.out.println("你好，Zan教育" + i);//error
		
	}
}