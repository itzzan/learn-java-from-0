import java.util.Scanner;
public class ArrayAdd {
	//��дһ��main����
	public static void main(String[] args) {
		//Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java 
		//1) ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3} 
		//2) ���ӵ�Ԫ�� 4��ֱ�ӷ����������� arr = {1,2,3,4} 
		
		//˼·����
		//1. �����ʼ���� int arr[] = {1,2,3};
		//2. arr[3] = 4;//error ����ԭ�ȵ��±����Ϊ2�������ͻ���ʾ�±�Խ��
		//3. ����һ���µ����� int arrNew = new int[arr.length+1];
		//4. ����arr ���飬���ν�arr��Ԫ�ؿ����� arrNew ����
		//5. �� 4 ���� arrNew[arrNew.length - 1] = 4;//��4���� arrNew �����һ��Ԫ��
		//6. ��arr ָ�� arrNew ����ôԭ����arr����ͻᱻ����

		int arr[] = {1, 2, 3};
		int arrNew[] = new int[arr.length + 1]; 
		for (int i = 0; i < arr.length; i++) {
			arrNew[i] = arr[i];
		}
		//��4����arrNew�����һ��Ԫ��
		arrNew[arrNew.length - 1] = 4;
		//�� arr ָ�� arrNew
		arr = arrNew;
		//���arr ����Ч��
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		
	}
} 