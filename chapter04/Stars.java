
public class Stars {
	//编写一个main函数
	public static void main(String[] args) {
		//打印一个空心的金字塔
		//化繁为简
		//1. 先打印一个矩形
		//*****
		//*****
		//*****
		//*****
		//
		//2. 打印半个金字塔
		//
		//3. 打印整个金字塔
		//
		//4. 打印空心金字塔
		//镂空 - 当前行的第一个位置是*，最后一个位置也是*
		
		//先死后活
		//5. 层数做成变量 int totalLevel = 5;
		int totalLevel = 10;

		for (int i = 1; i <= totalLevel; i++) { //i 表示层数

			//打印*之前需要的空格 (总层数-当前层数)
			for (int k = 1; k <= totalLevel - i; k++) {
				System.out.print(" ");
			}

			//控制打印每层的*个数
			for (int j = 1; j <= 2 * i - 1; j++) {
				//当前行的第一个位置是*，最后一个位置也是*，最后一层全部都是*
				if (j == 1 || j == 2 * i - 1 || i == totalLevel) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			//每打印一层*后。就换行 println
			System.out.println("");
		}
		
	}
}