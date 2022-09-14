/*
 * 商城库存清单案例
 * 以变量的形式对商品的数据保存
 * 品牌，尺寸大小，价格，配置，库存数量
 *      三台商品 ： 苹果、thinkpad、华硕
 *
 * 计算出总的库存数，商品的总金额
 */

public class StoreList {
    public static void main(String[] args) {
        //苹果笔记本电脑
        String macBrand = "MacBookAir";
        double macSize = 13.3;
        double macPrice = 6988.88;
        String macConfig = "i5处理器4GB内存128GB固态";
        int macCount = 5;

        //联想笔记本电脑
        String thinkpadBrand = "ThinkpadT450";
        double thinkpadSize = 14.0;
        double thinkpadPrice = 5900.90;
        String thinkpadConfig = "i5处理器4GB内存500GB硬盘";
        int thinkpadCount = 10;

        //华硕
        String ASUSBrand = "ASUS-FL5800";
        double ASUSSize = 15.6;
        double ASUSPrice = 4999.50;
        String ASUSConfig = "i7处理器4GB内存128GB固态";
        int ASUSCount = 15;

        //列表的顶部
        System.out.println("---------------------------商城库存清单---------------------------");
        System.out.println("品牌型号     尺寸    价格    配置                    库存数");

        //列表的中部
        System.out.println(macBrand + "  " + macSize + "  " + macPrice + "  " + macConfig + "  " + macCount);
        System.out.println(thinkpadBrand + "  " + thinkpadSize + "  " + thinkpadPrice + "  " + thinkpadConfig + "  " + thinkpadCount);
        System.out.println(ASUSBrand + "  " + ASUSSize + "  " + ASUSPrice + "  " + ASUSConfig + "  " + ASUSCount);

        //统计总库存数 总库存金额
        int totalCount = macCount + thinkpadCount + ASUSCount;
        double totalMoney = (macCount * macPrice) + (thinkpadCount * thinkpadPrice) + (ASUSCount * ASUSPrice);
        System.out.println("总库存数：" + totalCount);
        System.out.println("总金额：" + totalMoney);


    }
}
