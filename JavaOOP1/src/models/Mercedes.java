package models;

// Kalıtım ile Constructor kullanımı

public class Mercedes extends Car {
	
	// eğer bir super sınıf contructor içeriyorsa bu durumda bu sınıftan kalıtım alan sınıf bu contructor'ı uygulamak zorundadır.
	
	private String engineType; // mercedes için gerçerli bir özellik

	public Mercedes(int modelYear,String engineType) {
		super(modelYear); 
		// kalıtım aldığımız sınıfın contructor methodu anlamına gelir.
		// modelYear değeri kalıtım alınan car sınıfının contructor'ına atanacak.
		// eğer constuctor içerisinde super keyword çağırılıyorsa önce super kısmının değeri gönderilmelidir. daha sonra ilgili sınıf değerini içeridik değişkene aktarabilir.
		this.engineType = engineType;
	}

}
