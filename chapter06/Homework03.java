
public class Homework03 {
	//��дһ��main����
	public static void main(String[] args) {
		// Book book1 = new Book();
		// double n = 29;
		// double res = book1.updatePrice(n);
		// System.out.println("���ĺ�ļ۸�=" + res);
		
		//����
		Book book = new Book("Ц������", 300);
		book.info();
		book.updatePrice();
		book.info();
	}
}

//��д��Book�����巽��updatePrice��ʵ�ָ���ĳ����ļ۸�
//���壺����۸�>150�������Ϊ150������۸�>100������Ϊ100�����򲻱�
//����
//1. ���� Book
//2. ���� price name
//3. ������ updatePrice
//4. �βΣ���
//5. ����ֵ void
//6. �ṩһ��������

class Book {
	String name;
	double price;
	public Book(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public void updatePrice() {
		if (this.price > 150) {
			this.price = 150;
		} else if (this.price > 100) {
			this.price = 100;
		}
	}

	//��ʾ�鼮���
	public void info() {
		System.out.println("����=" + this.name + " �۸�=" + this.price);
	}


}

// class Book {
// 	public double updatePrice(double price) {
// 		if (price > 150) {
// 			return 150;
// 		} else if (price > 100 && price <= 150) {
// 			return 100;
// 		} else {
// 			return price;
// 		}
// 	}
// }