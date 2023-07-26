package models;

// OOP da sınıf isimleri tekil yazılır
// tek bir nesne referansını barındırıklarından dolayı çoğul yazılma
// çoğullaştırmak için ArrayList kütüphanesi kullanıyoruz.
// java da bir sınıf sadece 1 sınıftan kalıtım alabilir. birden fazla sınıftan kalıtım alınamaz.
// eğer bir sınıf kalıtım dışında ortak bir özellik kazanmak istiyorsa Interface dediğimiz tipler sayesinde bunu yapabiliyoruz.
public class Employee extends Person  {
	
	// firstName,lastName,identityNumber from Person

	private String socialNumber;
	
	public String getSocialNumber() {
		return this.socialNumber;
	}
	
	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}
	
}
