import java.util.Scanner;
public class Continue01 {
	//±àÐ´Ò»¸ömainº¯Êý
	public static void main(String[] args) {
		
		int i = 1;
		while (i <= 4) {
			i++;
			if (i == 2) {
				continue;
			}
			System.out.println(i);
		}

	}
}