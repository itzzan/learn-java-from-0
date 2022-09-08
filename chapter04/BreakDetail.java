
public class BreakDetail {
	//编写一个main函数
	public static void main(String[] args) {
		// lable1:
		// for (int j = 0; j < 4; j++) {
		// lable2:
		// 	for (int i = 0; i < 10; i++) {
		// 		if (i == 3) {
		// 			break lable1;
		// 		}
		// 		System.out.println(i);
		// 	}
		// }
		
		// System.out.println("退出for循环");
		
		lable1:
		for (int j = 0; j < 4; j++) {
		lable2:
			for (int i = 0; i < 10; i++) {
				if (i == 3) {
					break ;//等价于break lable2
				}
				System.out.println(i);
			}
		}
		
		System.out.println("退出for循环"); 
		
	}
}