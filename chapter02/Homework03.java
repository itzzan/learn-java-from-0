public class Homework03 {
	public static void main(String[] args) {
		
		//编程，保存两本书名，用+号拼接，看效果，保存两个性别，用+号拼接，看效果，保存两本书价格，用+号拼接，看效果
		
		String book1 = "天龙八部";
		String book2 = "笑傲江湖";
		System.out.println(book1 + book2);//天龙八部笑傲江湖 -  字符串拼接

		//性别应该使用char保存
		char gender1 = '男';
		char gender2 = '女';
		System.out.println(gender1 + gender2);//字符相加，就是其码值相加，得到一个数字

		//保存两本书的价格
		double price1 = 123.56;
		double price2 = 100.11;
		System.out.println(price1 + price2);//就是两个数相加
		
	}
}