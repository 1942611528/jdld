package ch1220;

import java.util.Scanner;

/**
 * @ClassName Test3
 * @Description 回文数问题
 * @Auyhor q1942
 * @Date 2019/12/20 14:33
 * @Version 1.0
 */
public class Test3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);//实例化输入流方法
        System.out.println("请输入5位数:");
        int sts=sc.nextInt();//接收用户输入
        String st=String.valueOf(sts);//转换类型
        String[] bnst=st.split("");//将输入的数据按位截取,并转换为字符串数组
        if(bnst[0].equals(bnst[bnst.length-1])&&bnst[1].equals(bnst[bnst.length-2])){//对比每一位的对用镜像数
            System.out.println(st+"是回文数");
        }else {
            System.out.println(st+"不是回文数");
        }
    }
}
