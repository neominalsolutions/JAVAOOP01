package models;

// User Defined bir tipi
// Classlar aynı tipteki nesneleri yönetmemizi sağlayan kalıplardır.
// ali ve ahmet nesnesi ayni tipte fakat farklı özelliklerdeki 2 farklı nesneydi.
public class User {

	// attributes private olan değişkenler
	
	// property (variables - özellikleri)
	
	public String firstName;
	public String lastName;
	//public String email; // ali@test.com
	private String email;
	
	public String getEmail() {
		return this.email;
	}
	
	public void setEmail(String email) {
		if(!email.contains("@")) { // @ işareti içermiyorsa
			throw new Error("Email içerisinde @ işareti tanımlanmalıdır");
			// throw işleminden sonra uygulama hata döndürür herhangi bir kod blogu çalışmaz
		} else {
			this.email = email;
		}
	}
	
	//public int yas;
	private int yas; // access modifier, erişim belirteçleri sayesinde artık private olan bir değer tanımladığımızdan dolayı User sınıfından erişime kapatmış olduk. (private sınıfın bir üyesinin dışarı erişimini engelleyen bir yapı)
	
	public int getYas() { // getter yani private bir değere sınıf dışından erişmemizi sağlayan bir method.
		return this.yas;
	}
	
	public void setYas(int yas) { // setter
		if(yas < 0)
			 yas = 0; // - bir değer ise kontrol edip 0 olarak güncelledim.
		this.yas = yas;
	}
	
	
	// methods (davranış)
	public String GetFullName() {
		return this.firstName + " " + this.lastName.toUpperCase();
	}
	
	
	
	
}
