
public class ContinueDetail {
	//��дһ��main����
	public static void main(String[] args) {
		
		label1: 
		for(int j = 0; j < 2; j++) { 
		label2: 
			for(int i = 0; i < 10; i++) {
				if(i == 2) { 
				//�����ֱ����ʲôֵ�������� 
					//continue ; //�ȼ��� continue lable2 - ���2�� 0 1 3 4 5 6 7 8 9 
					//continue label2; //���2�� 0 1 3 4 5 6 7 8 9 - ��continueһ��
					continue label1; //���2�� 0 1
				}
				System.out.println("i = " + i); 
			} 
		}
	}
}