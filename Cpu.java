package com.sh.cpu;

public class Cpu {
	public int speed;
	public String brand;
	protected double price;
	public Cpu(){
		super();
		//第一个构造方法
	}
	Cpu(int speed,double price){
		//第二个构造方法
	}
	public void setSpeed(int m){
		if(m<0){
			this.speed=0;
		}else{
			this.speed=m;
		}
	}
	public int getSpeed(){
		return speed;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
}
