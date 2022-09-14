
public class TwoDimensionalArray01 {
	//编写一个main函数
	public static void main(String[] args) {
		//请用二维数组输出如下图形 
		//0 0 0 0 0 0 
		//0 0 1 0 0 0 
		//0 2 0 3 0 0 
		//0 0 0 0 0 0
		
		//二维数组：
		//1. 从定义形式上看 int[][]
		//2. 原来的一维数组的每个元素是一维数组，就构成了二维数组
		int arr[][] = {{0, 0, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, 
						{0, 2, 0, 3, 0, 0}, {0, 0, 0, 0, 0, 0}};
		//关于二维数组的关键概念
		//(1)
		System.out.println("二维数组的元素个数=" + arr.length);
		//(2)二维数组的每个元素是一维数组，所以如果需要得到每个一维数组的值
		//	 还需要再次遍历
		//(3)如果我们要访问第(i+1)个一维数组的第(j+1)个值，arr[i][j]
		//	 举例：访问3 - arr[2][3]
		System.out.println(arr[2][3]);

		//输出二维图形
		for (int i = 0; i < arr.length; i++) {//遍历二维数组的每个元素
			//遍历二维数组的每个元素（数组）
			//arr[i] 表示二维数组的第 i+1 个元素，比如 arr[0]：二维数组的第一个元素
			//arr[i].length 得到对应的每个一位数组的长度
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}
} 