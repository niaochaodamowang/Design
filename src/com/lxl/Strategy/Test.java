package com.lxl.Strategy;

public class Test {
	  public static void main(String[] args)
	    {
	       //客户端没有选择打折策略类
	       DiscountContext dc = new DiscountContext(null);
	       double price1 = 79;
	       //使用默认的打折策略
	       System.out.println("79元的书默认打折后的价格是："
	           + dc.getDiscountPrice(price1));
	       //客户端选择合适的VIP打折策略
	       dc.setDiscount(new VipDiscount());
	       double price2 = 89;
	       //使用VIP打折得到打折价格
	       System.out.println("89元的书对VIP用户的价格是："
	           + dc.getDiscountPrice(price2));
	    }
}
