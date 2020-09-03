package ch1220;

/**
 * @ClassName Test4
 * @Description 买票问题
 * @Auyhor q1942
 * @Date 2019/12/20 14:37
 * @Version 1.0
 */
public class Test4 {
    public static void main(String[] args) {
        int ch=0;//计算中国票
        int us=0;//计数美国票
        int jp=0;//计数日本票
        int sun=0;//计数总共的方法数量
        for (ch=0;ch<=20;ch++){//中国票最大
            for (us=0;us<=33;us++){//美国票
                for (jp=0;jp<=100;jp++){//日本票
                        if((ch+us+jp==100)&&(ch*5+us*3+jp/3==100)&&(jp%3==0)){//满足票的张数为100,且买票总共的钱正好用完,日本票为3的倍数,所以可以被3整除
                            sun++;//增加次数
                            System.out.println("中国票:"+ch+"美国票:"+us+"日本票:"+jp);
                        }
                }
            }
        }
        System.out.println("一共有:"+sun+"种方法;");
    }
}
