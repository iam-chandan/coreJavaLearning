package com.coreJava.stringBuffer;

public class EmailTemplate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName = "Abhisekh";
		String date = "10-Aug-2025";
		String orderStatus = "order dispatched from ware house";
		
		StringBuilder sb = new StringBuilder("Dear ");
		sb.append(userName);
		sb.append(",\nYour order has been received and will be delivered by ");
		sb.append(date);
		sb.append(" and current order status is");
		sb.append(orderStatus+".");
		System.out.println(sb);
	}

}
