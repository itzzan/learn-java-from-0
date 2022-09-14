
public class TwoDimensionalArray03 {
	//编写一个main函数
	public static void main(String[] args) {
		
		//需求：动态创建一个二维数组
		//一共有三个一维数组，每个一维数组的元素是不一样的
		
		int arr[][] = new int[3][];//不确定列数就不写 ，创建 二维数组，但是只是确定了一维数组的个数
		//每个一维数组还没有开数据空间
		for (int i = 0; i < arr.length; i++) {//遍历arr每个一维数组
			//给每个一维数组开空间 new
			//如果没有给一维数组 new ，那么arr[i] 就是 null
			arr[i] = new int[i + 1];

			//遍历一维数组，并给一维数组的每个元素赋值
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + 1;//赋值
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
} 