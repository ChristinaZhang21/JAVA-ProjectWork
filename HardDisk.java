package com.sh.harddisk;

public class HardDisk {
	public int amount;
	private String brand;
	protected double price;

	public HardDisk(){
		super();
		//��һ�����췽��
	}
	public HardDisk(String brand){
		this.brand=brand;
		//�ڶ������췽��
	}
	HardDisk(double price){
		//���������췽��
	}
	
	public void setAmount(int m){
		if(m<0){
			this.amount=0;
		}else{
			this.amount=m;
		}
	}
	public int getAmount(){
		return amount;
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
