
public class Break01 {
	//编写一个main函数
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("退出for循环");
	}
}