//Switchϸ��

public class SwitchDetail {
	//��дһ��main����
	public static void main(String[] args) {

		//1. ���ʽ�������ͣ�Ӧ��case��ĳ�������һ��
		//�����ǿ����Զ�ת�ɿ����໥�Ƚϵ����ͣ�������������ַ�����������int
		
		// char c = 'a';
		// //String c = "a";
		// switch (c) {
		// 	//case "a" :
		// 	case 'a' :
		// 		System.out.println("ok1");
		// 		break;
		// 	//case 'b' :
		// 	//case "hello" ://error
		// 	//case "20" ://ok
		// 	case 20 :
		// 		System.out.println("ok2");
		// 		break;
		// 	default :
		// 		System.out.println("ok3");
		// }
		
		//2. switch(���ʽ)�б��ʽ�ķ���ֵ�����ǣ���byte��short��int��char��enum[ö��]��String��
		// double c1 = 1.1;
		// switch (c1) {
		// 	case 1.1 :
		// 		System.out.println("ok1");
		// 		break;
		// 	case 2.1 :
		// 		System.out.println("ok2");
		// 		break;
		// 	default :
		// 		System.out.println("ok3");
		// }

		//3. case�Ӿ��е�ֵ�����ǳ������߳������ʽ�������Ǳ���
		
		// char c = 'a';
		// char c2 = 'c';
		// switch (c) {
		// 	case 'a' :
		// 		System.out.println("ok1");
		// 		break;
		// 	case c2 :
		// 		System.out.println("ok2");
		// 		break;
		// 	default :
		// 		System.out.println("ok3");
		// }
		 
		//4. default�ǿ�ѡ�ģ���û��ƥ���caseʱ��ִ��default
		//���û��default�Ӿ䣬��û��ƥ���κγ�������û�����
		
		//5. break���������ִ����һ��case��֧��ʹ��������switch����
		//���û��дbreak�������˳��ִ�е�switch��β����������break���

		char c = 'a';
		char c2 = 'c';
		switch (c) {
			case 'a' :
				System.out.println("ok1");
				//break;
			case 'b' :
				System.out.println("ok2");
				//break;
			default :
				System.out.println("ok3");
		}
	}
}