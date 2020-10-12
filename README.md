# JAVA-ProjectWork
Java课程作业项目仓库

#阅读程序

## 一、实验目的
1. 学会使用JAVA编写简单的类，理解类的属性与方法，熟悉JAVA的构造方法
2. 学习访问权限的类型，体验public、private、protected等不同修饰符的用法
## 二、实验过程
1. 在不同的包中创建CPU、PC、HardDisk和Test四个类，并满足以下要求：
- CPU类必须有一个int型的成员变量speed，有一个void类型的setSpeed（int m）方法将参数m的值赋值给speed，一个int类型的getSpeed（）返回speed的值
- HardDisk类必须有一个int型的成员变量amount，有一个void类型的setAmount（int m）方法将参数m的值赋值给amount，一个int类型的getAmount（）方法返回amount的值
- PC类需要实例化CPU类的对象cpu和HardDisk类的对象HD，有一个void类型的setCpu（Cpu c）方法将参数c的值赋给cpu，一个void类型的setHardDisk（HardDisk h）方法将参数h的值赋给HD，一个void类型的show方法可以显示cpu的速度和硬盘的容量。
- Text类作为主类，需要在main方法中实例化CPU的对象cpu，将自己的speed属性设置为2200；实例化HardDisk的对象disk，将自己的amount属性设置为200；实例化PC的对象pc。对象pc需要成功调用setCPU（CPU c）方法，调用时实参是对象cpu；需要成功调用setHardDisk（HardDisk h）方法，调用时实参是对象disk；需要成功调用show（）方法。
2. 完成附加要求：
- 将多个类放置在不同的包中。
- 每个类中定义不少于两个构造方法，定义不少于两个属性，且多样化属性类型和修饰符。
- 在类中定义get和set方法操作属性。
- 在CPU类中定义的setSpeed（int）方法设置逻辑判断，speed需大于0。
## 三、核心代码
1. 方法一
```
public void setCpu(CPU c){
	this.cpu=c;
	}
```
2. 方法二
```
public void setHardDisk(HardDisk h){
	this.HD=h;
	} 
```
3. 方法三
```
public void show(){
	System.out.println("CPU的速度为："+cpu.getSpeed()+"
			;硬盘的容量为："+HD.getAmount());
	}
```
4. 方法四
```
public void setSpeed(int m){
		if(m<0){
			this.speed=0;
		}else{
			this.speed=m;
		}
	}
```
## 四、实验结果

运行程序成功，输出语句———CPU的速度为：2200;硬盘的容量为：200

![图片文件](http://note.youdao.com/yws/public/resource/1702e58cbd09251464ea013ed8cbb85d/xmlnote/WEBRESOURCE99148ae5dc3d90a8ed2f3a6eb4c37f59/10)
## 五、实验感想
通过本次实验，我掌握了JAVA编程的基本规则语法，对类与对象的概念，以及构造方法的使用，进行了深层次的学习，还通过修改属性修饰符为private或protected体会到了不同包下不同修饰符的权限设置。同时，我通过GitHub提交实验报告的任务，接触到了如何使用MarkDown语法书写ReadMe文档以及其它关于GitHub的使用问题，基本完成了本次实验的内容。
