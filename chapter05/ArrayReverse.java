
public class ArrayReverse {
	//��дһ��main����
	public static void main(String[] args) {
		//���󣺰������Ԫ�����ݷ�ת
		//arr {11,22,33,44,55,66} -> {66,55,44,33,22,11}
		//˼·
		//���ɣ�
		//1. ��arr[0] �� arr[5] ���н��� {66,22,33,44,55,11}
		//2. ��arr[1] �� arr[4] ���н��� {66,55,33,44,22,11}
		//3. ��arr[2] �� arr[3] ���н��� {66,55,44,33,22,11}
		//4. һ��Ҫ���� 3 �� = arr.length / 2
		//5. ÿ�ν���ʱ����Ӧ���±��� arr[i] �� arr[arr.length - 1 - i]
		//
		//�Ż�
		// int arr[] = {11, 22, 33, 44, 55, 66};
		// int temp = 0;
		// int len = arr.length;
		// for (int i = 0; i < len / 2; i++) {
		// 	temp = arr[len - 1 - i];//����
		// 	arr[len - 1 - i] = arr[i];
		// 	arr[i] = temp; 
		// }
		// //��ӡ
		// System.out.println("===��ת������===");
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.println(arr[i]);
		// }

		//�Լ���д�������䵹�Ŵ�����һ������
		//Ȼ���ٸ���ԭ�ȵ����� ����ֱ��ָ��arr2 �� arr = arr2
		int arr[] = {11, 22, 33, 44, 55, 66};
		int arr2[] = new int[arr.length];
		for (int i = arr.length - 1; i >= 0; i--) {
			//��������һ��ѭ������ j -> 0 -> 5
			arr2[arr.length - 1 - i] = arr[i];
		}
		//��arr ָ��arr2 �����ݿռ䣬��ʱ arr ԭ�������ݿռ��û�б������ã��ᱻ��������������
		arr = arr2;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
} 