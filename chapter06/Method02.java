
public class Method02 {
	//编写一个main方法
	public static void main(String[] args) {
		//看一个需求： 请遍历一个数组 , 输出数组的各个元素值
		int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};

		//使用方法完成输出
		MyTools tools = new MyTools();


		//遍历map数组
		//传统的解决方法就是直接遍历
		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.println(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		
		//使用方法
		tools.printArr(map);




		//要求再次遍历map数组
		//复制粘贴一份
		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.println(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		
		tools.printArr(map);
	}
}


//把输出的功能，写到一个类的方法中，然后调用该方法揭开
class MyTools {
	//方法，接受一个二维数组
	
	public void printArr(int[][] map) {
		System.out.println("=========");
		//对传入的map数据
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}