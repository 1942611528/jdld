package ch1220;

/**
 * @ClassName Test2
 * @Description 计算X数
 * @Auyhor q1942
 * @Date 2019/12/20 14:25
 * @Version 1.0
 */
public class Test2 {
    public static void main(String[] args) {
        for (int i=10;i<100;i++){//使用循环判断10到99的数
            if(8*i<=99&&9*i>99){//需要满足X的两个限制条件
                System.out.println("X为:"+i+",且809*X为:"+(809*i));//输出的同时计算
            }
        }
    }
}
