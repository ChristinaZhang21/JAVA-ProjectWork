package com.sh.pc;

import com.sh.cpu.*;
import com.sh.harddisk.HardDisk;

public class Pc {
	public String type;
	private double price;
	int parm; 
	Cpu cpu=new Cpu();
	HardDisk HD=new HardDisk();
	public Pc(){
		super();
		//��һ�����췽��
	}
	Pc(String type,int parm){
		//�ڶ���
	}
	public void setCpu(Cpu c){
		this.cpu=c;
	}
	public void setHardDisk(HardDisk h){
		this.HD=h;
	}
	public void show(){
		System.out.println("CPU���ٶ�Ϊ��"+cpu.getSpeed()+
							";Ӳ�̵�����Ϊ��"+HD.getAmount());
	}
	//����������Է���
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getParm() {
		return parm;
	}
	public void setParm(int parm) {
		this.parm = parm;
	}
}
