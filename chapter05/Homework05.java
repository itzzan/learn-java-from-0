
public class Homework05 {
	//编写一个main函数
	public static void main(String[] args) {
		//随机生成10个整数（1-100的范围）保存到数组，并倒序打印以及求平均值
		//求最大值和最大值的下标，并查找里面是否有8
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
		}
		System.out.println("===正序情况===");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//倒序打印
		//求平均值
		double sum = 0;
		int max = 0;
		int index = -1;
		System.out.println("\n===倒序情况===");
		for (int i = arr.length - 1; i >= 0; i--) {

			
			System.out.print(arr[i] + " ");
			sum += arr[i];
			if (arr[i] > max) {
				max = arr[i];
				index = i;
			}
		}
		System.out.println("\n平均值=" + (sum / 10.0));
		System.out.println("最大值=" + max);
		System.out.println("最大值下标=" + index);

		//查找数组中是否有8
		int findNum = 8;
		int index2 = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == findNum) {
				index2 = i;
				System.out.println("找到数" + findNum + " 下标=" + index2);
				
				break;
			}
		}

		if (index2 == -1) {
			System.out.println("没有找到数" + findNum);
		}
	}
} 