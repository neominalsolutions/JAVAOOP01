package app;

import models.Employee;
import models.Person;

public class EmployeeMain {

	// var olan modeller üzerinden yeni modeller türetmek modellerimize daha kolay yeni özellikler kazandırmak için kullanılan bir yöntem.
	// kod tekrarını engelleyen bir yöntem.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1 = new Employee();
		e1.firstName = "Can";
		e1.lastName = "Tan";
		e1.setIdentityNumber("12345678901");
		e1.setSocialNumber("1245-000-124");
		
		if(e1 instanceof Employee) {
			System.out.println("e1 sınıfı Employee instance mı");
		}
		
		// e1 nesnesi Persondan türetildiğinden dolayı aynı zaman Person sınıfın bir örneği olarak da kabul ediyor.
		// e1 Person şablonunda türetilen bir sınıf mı
		if(e1 instanceof Person) {
			System.out.println("e1 sınıfı Person instance mı");
		}
		
		System.out.println(e1.firstName.concat(" ").concat(e1.lastName).concat(" ").concat(e1.getIdentityNumber()).concat(" ").concat(e1.getSocialNumber()));
		
		

	}

}
