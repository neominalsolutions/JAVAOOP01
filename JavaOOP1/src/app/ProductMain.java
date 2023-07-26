package app;

import java.util.Scanner;

import models.Person;
import models.Product;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p = new Product(); // boş contructor hali
		Product p1 = new Product("ürün-1");
		Product p2 = new Product("ürün2", 10);
		Product p3 = new Product("ürün-3", 10, 30);
		
		// Normal bir contructor kullanımı gördük
		
		System.out.println("p :" + p.getName());
		System.out.println("p1 :" + p1.getName());
		System.out.println("p2 :" + p2.getName() + " " + p2.getStock());
		System.out.println("p3 :" + p3.getName() + " " + p3.getStock() + " " + p3.getPrice());
		
		
		
		
		// farklı şekillerde instance almamızı sağlıyor.
		
		// Scanner scanner = new Scanner(System.in);
		
		

	}

}
