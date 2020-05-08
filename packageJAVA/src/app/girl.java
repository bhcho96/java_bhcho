package app;

import lib.woman;

public class girl extends woman {
	private int weight, money;
	private String name;
	
	public girl(String name, int weight, int money) {
		this.name = name;
		this.weight = weight;
		this.money = money;
	}
	
	public void eat() {weight += 5;}
	public void shopping() {money -= 100;}
	public String getname() {return name;}
	public int getweight() {return weight;}
	public int getmoney() {return money;}
	public void print() {
		System.out.println("ÀÌ¸§: " + name + ", ¸ö¹«°Ô: " + weight + ", µ·: " + money);
	}
	
	public static void main(String [] args) {
		
		girl hgd = new girl("¾Æ¹«°³", 60, 1000);
		hgd.print();
		hgd.eat();
		hgd.print();
		hgd.shopping();
		hgd.print();
	}
}
