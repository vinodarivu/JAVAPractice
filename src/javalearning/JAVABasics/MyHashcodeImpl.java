/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalearning.JAVABasics;

import java.util.HashMap;

/**
 *
 * @author U6032545
 */
public class MyHashcodeImpl {

	public static void main(String a[]) {

		HashMap<Price, String> hm = new HashMap<Price, String>();
		hm.put(new Price("Banana", 20), "Banana");
		hm.put(new Price("Apple", 40), "Apple");
		hm.put(new Price("Orange", 30), "Orange");
		// creating new object to use as key to get value
		Price key = new Price("Banana", 20);
		String t1 = "vinod";
		String t2 = "vinod";
		System.out.println("String Equals method===" + t1.equals(t2));
		System.out.println("*************************************************************************************");
		System.out.println("Object Equals Method===" + key.equals(key));
		System.out.println("*************************************************************************************");
		System.out.println("Hashcode of the key: " + key.hashCode());
		System.out.println("*************************************************************************************");
		System.out.println("Value from map: " + hm.get(key));
		System.out.println("*************************************************************************************");
	}
}

class Price {

	private String item;
	private int price;

	public Price(String itm, int pr) {
		this.item = itm;
		this.price = pr;
	}

	@Override
	public int hashCode() {

		int hashcode = 0;
		hashcode = price * 20;
		hashcode += item.hashCode();
		System.out.println("===========Inside hashcode override method=========>" + hashcode);
		return hashcode;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("============Inside equals override method===========");
		if (obj instanceof Price) {
			Price pp = (Price) obj;
			return (pp.item.equals(this.item) && pp.price == this.price);
		} else {
			return false;
		}
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String toString() {
		return "item: " + item + "  price: " + price;
	}
}
