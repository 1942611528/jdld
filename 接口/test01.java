package Ir;

import java.util.Scanner;

class Cat implements Animal{
	private String name="";
	private int legNum=0;
	@Override
	public void Animal(String name,int legNum) {
		this.name=name;
		this.legNum=legNum;
	}
	@Override
	public void shout() {
		System.out.println("����");
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getLegNum() {
		return legNum;
	}
}
class Dog implements Animal{
	private String name="";
	private int legNum=0;
	@Override
	public void Animal(String name,int legNum) {
	    try {
	    	if(legNum>4&&legNum<4) {
	    		throw new Exception("è����������");
	    	}
	    } catch (Exception e) {
	        e.printStackTrace();
	        System.out.println("�����쳣");
	    }
		this.name=name;
		this.legNum=legNum;
	}
	@Override
	public void shout() {
		System.out.println("����");
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public int getLegNum() {
		return legNum;
	}
}
public class test01 {
		static Scanner sc=new Scanner(System.in);
		static Cat[] cat=new Cat[5];
	public static void main(String[] args) {
		cat[0]=new Cat();
		cat[0].Animal("a", 4);
		cat[0].shout();
		System.out.println("���������:");
		int c=sc.nextInt();
		switch (c) {
		case 1:
			while (true) {
				Anm();
				System.out.println("�Ƿ����1/0:");
				int cs=sc.nextInt();
				if (cs==1) {
					break;
				}
			}
			break;
		default:
			break;
		}
		System.out.println(cat[0].getName());
		System.out.println(cat[0].getLegNum());
	}
	public static void Anm() {
		System.out.println("����������:");
		String name=sc.next();
		System.out.println("�������ȵ�����:");
		int leg=sc.nextInt();
		cat[0].Animal(name, leg);
	}
}
