
public class BreakDetail {
	//��дһ��main����
	public static void main(String[] args) {
		// lable1:
		// for (int j = 0; j < 4; j++) {
		// lable2:
		// 	for (int i = 0; i < 10; i++) {
		// 		if (i == 3) {
		// 			break lable1;
		// 		}
		// 		System.out.println(i);
		// 	}
		// }
		
		// System.out.println("�˳�forѭ��");
		
		lable1:
		for (int j = 0; j < 4; j++) {
		lable2:
			for (int i = 0; i < 10; i++) {
				if (i == 3) {
					break ;//�ȼ���break lable2
				}
				System.out.println(i);
			}
		}
		
		System.out.println("�˳�forѭ��"); 
		
	}
}