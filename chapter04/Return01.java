
public class Return01 {
	//编写一个main函数
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {

			if (i == 3) {
				System.out.println("老韩教育" + i);
				return;//当return用在方法时，表示跳出方法，如果用在main里面，就是退出main方法
				//break;
			}
			System.out.println("Hello World!");
		}
		System.out.println("go on...");
		
	}
}