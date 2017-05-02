package com.lxl.Observer;

public class Test {
public static void main(String[] args) {
	  // 创建一个被观察者对象
    Product p = new Product("电视机", 176);
    // 创建两个观察者对象
    NameObserver no = new NameObserver();
    PriceObserver po = new PriceObserver();
    // 向被观察对象上注册两个观察者对象
    p.registObserver(no);
    p.registObserver(po);
    // 程序调用setter方法来改变Product的name和price属性
    p.setName("书桌");
    p.setPrice(345f);
 
}
}
