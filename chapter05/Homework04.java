
public class Homework04 {
	//��дһ��main����
	public static void main(String[] args) {
		//��֪�и���������飬Ҫ�����һ�����飬������˳����Ȼ������
		//���磺[10, 12, 45, 90]
		//���23������Ϊ[10, 12, 23, 45, 90]
		//˼·�������������� + ��λ
		//1. ��ȷ����ӵ���Ӧ�ò��뵽�ĸ�����
		//2. Ȼ������
		
		//�ȶ���ԭ����
		// int[] arr = {10, 12, 45, 90};
		// int insertNum = 23;
		// int index = -1;//index����Ҫ�����λ��
		// //����arr���飬�������insertNum <= arr[i]
		// //˵�� i ����Ҫ�����λ��
		// //����index = i������λ��
		// //����������û�з��� insertNum <= arr[i] 
		// //˵�� index = arr.length;
		// //��:��ӵ�arr�����
		
		// for (int i = 0 ; i < arr.length; i++) {
		// 	if (insertNum <= arr[i]) {
		// 		index = i;
		// 		break; // �ҵ�λ�ú���˳�
		// 	}
		// }
		// //�ж�index��ֵ�����Ƿ��ҵ�λ��
		// if (index == -1) {
		// 	//˵��û�ҵ�λ��
		// 	index = arr.length;
		// }

		// //����
		// //�ȴ���һ���µ����飬��СΪ arr.length + 1
		// int[] arrNew = new int[arr.length + 1];
		// //֮��arr��Ԫ�ؿ�����arrNew������Ҫ����index��λ��
		
		// for (int i = 0, j = 0; i < arrNew.length; i++) {
		// 	if (i != index) {
		// 		//˵�����԰�arr��Ԫ�ؿ�����arrNew
		// 		arrNew[i] = arr[j];
		// 		j++;
		// 	} else {//i���λ�þ���Ҫ���������
		// 		arrNew[i] = insertNum;
		// 	}
		// }
		// arr = arrNew;
		// System.out.println("===�����arr�����Ԫ�����===");
		// for (int i = 0; i < arr.length; i++) {
		// 	System.out.print(arr[i] + " ");
		// }

		




		//�Լ���д��
		int[] arr = {10, 12, 45, 90};
		int[] arr2 = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			arr2[i] = arr[i];
		}
		arr2[arr.length] = -1;
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2.length - 1 - i; j++) {
				if (arr2[j] > arr2[j+1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j+1];
					arr2[j+1] = temp;
				}
			}
		}
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
	}
} 