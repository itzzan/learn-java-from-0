import java.util.Scanner;

public class BMI_Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入您的姓名：");
        String name = myScanner.next();
        System.out.println("请输入您的性别（true表示男性，false表示女性）");
        boolean gender = myScanner.nextBoolean();
        System.out.println("请输入您的身高，精确到小数点后2位，单位为米");
        double height = myScanner.nextDouble();
        System.out.println("请输入您的体重，单位公斤");
        int weight = myScanner.nextInt();
        //计算BMI数值
        double BMI = weight / Math.pow(height, 2);

        //判断
        if (gender) {//男性
            if (BMI < 20) {
                System.out.println("先生，您的体重过轻，请加强膳食的补充！");
            } else if (BMI < 25) {
                System.out.println("先生，恭喜你，你的体重适中，请保持！");
            } else if (BMI < 30) {
                System.out.println("先生，您的体重已经过重，请注意锻炼身体！");
            } else if (BMI < 35){
                System.out.println("先生，您已经属于肥胖行列，请注意饮食习惯！");
            } else {
                System.out.println("先生，您已经非常肥胖，必须下定决心减肥了！");
            }
        } else {//女性
            if (BMI < 19) {
                System.out.println("女士，您的体重过轻，请加强膳食的补充！");
            } else if (BMI < 24) {
                System.out.println("女士，恭喜你，你的体重适中，请保持！");
            } else if (BMI < 29) {
                System.out.println("女士，您的体重已经过重，请注意锻炼身体！");
            } else if (BMI < 34){
                System.out.println("女士，您已经属于肥胖行列，请注意饮食习惯！");
            } else {
                System.out.println("女士，您已经非常肥胖，必须下定决心减肥了！");
            }
        }



    }
}
