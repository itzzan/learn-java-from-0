
public class YangHui {
	//编写一个main函数
	public static void main(String[] args) {
		//使用二维数组打印一个10行的杨辉三角
		//规律
		//1. 第一行有 1 个元素, 第 n 行有 n 个元素 
		//2. 每一行的第一个元素和最后一个元素都是 1 
		//3. 从第三行开始, 对于非第一个元素和最后一个元素的元素的值. 
		//arr[i][j] arr[i][j] = arr[i-1][j] + arr[i-1][j-1]; //必须找到这个规律

		int arr[][] = new int[10][];
		for (int i = 0; i < arr.length; i++) {//遍历arr的每个元素
			//给每个一维数组（行）开辟空间
			arr[i] = new int[i + 1];
			//给每个一维数组赋值
			for (int j = 0; j < arr[i].length; j++) {
				if (j == 0 || j == arr[i].length - 1) {
					arr[i][j] = 1;
				} else {//中间的元素
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		//输出
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}
} 