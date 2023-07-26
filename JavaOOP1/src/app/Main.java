package app;

import models.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a = 5;
		User ali = new User(); // User Class newlendiğinde ali alından bir nesne değişken oluşuyor.
		// ali ramde tutuluyor ama User şablonu üzerinden çalışıyor.
		ali.firstName = "Ali";
		ali.lastName = "Yakut"; // ToUpperCase(); büyük harfe çevir.
		// ali.yas = 15;
		ali.setYas(-15);
		ali.setEmail("test");
		
		System.out.println(ali.GetFullName());
		
		User ahmet = new User(); // newleme işlemine instance alma
		ahmet.firstName = "Ahmet";
		ahmet.lastName = "Tan";
		ahmet.setEmail("ahmet@akbank.com");
		ahmet.setYas(-30); // -30 diye bir yaş yok bunu engellemek zorundayım.
		// - değer girilerise yaşı 0 olarak değiştirmemiz lazım.
		
		
		System.out.println(ahmet.GetFullName());
		System.out.println("ahmet'in yaşı: " + ahmet.getYas());
		System.out.println("ali'in yaşı: " + ali.getYas());

	}

}
