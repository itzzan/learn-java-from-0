
public class Method02 {
	//��дһ��main����
	public static void main(String[] args) {
		//��һ������ �����һ������ , �������ĸ���Ԫ��ֵ
		int[][] map = {{0, 0, 1}, {1, 1, 1}, {1, 1, 3}};

		//ʹ�÷���������
		MyTools tools = new MyTools();


		//����map����
		//��ͳ�Ľ����������ֱ�ӱ���
		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.println(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		
		//ʹ�÷���
		tools.printArr(map);




		//Ҫ���ٴα���map����
		//����ճ��һ��
		// for (int i = 0; i < map.length; i++) {
		// 	for (int j = 0; j < map[i].length; j++) {
		// 		System.out.println(map[i][j] + " ");
		// 	}
		// 	System.out.println();
		// }
		
		tools.printArr(map);
	}
}


//������Ĺ��ܣ�д��һ����ķ����У�Ȼ����ø÷����ҿ�
class MyTools {
	//����������һ����ά����
	
	public void printArr(int[][] map) {
		System.out.println("=========");
		//�Դ����map����
		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[i].length; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

}