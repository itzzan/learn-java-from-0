
public class BubbleSort {
	//��дһ��main����
	public static void main(String[] args) {
		//ð������ - ����
		int arr[] = {24, 69, 80, 57, 13};
		for (int j = 1; j < arr.length; j++) {
			for (int i = 0; i < arr.length - j; i++) {
				if (arr[i] > arr[i+1]) {
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
} 