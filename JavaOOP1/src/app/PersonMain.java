package app;

import models.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(); // instance alma işlemi
		p1.firstName = "Ali";
		p1.lastName = "Tan";
		// encapsulation yapmış olduk
		// programın tc kimlik no hesaplama kontrol sürecinin class içerisine kapsüllemiş olduk. Person sınıfını kullanacak olan developer buradaki algoritmayı bilmek zorunda değil. sadece tcNo set etme methodunu bilse yeterlidir. 
		p1.setIdentityNumber("12345111789");
		
		System.out.println(p1.firstName + p1.lastName + p1.getIdentityNumber());
		
		Person p2 = new Person();
		p2.firstName = "Mustafa";
		p2.lastName = "Can";
		p2.setIdentityNumber("842213240F");
		

	}

}
