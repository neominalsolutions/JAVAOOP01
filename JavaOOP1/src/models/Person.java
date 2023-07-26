package models;

// super class
public class Person {
	
	public String firstName;
	public String lastName;
	
	private String identityNumber; // TcNo
	
	public String getIdentityNumber() {
		return this.identityNumber;
	}
	
	public void setIdentityNumber(String identityNumber) {
		// "" -> empty " " -> blank
		if(identityNumber.isBlank() || identityNumber.isEmpty()) {
			throw new Error("Tc kimlik alanı boş geçilemez");
		}
		
		if(identityNumber.length() < 11 || identityNumber.startsWith("0")){
			throw new Error("Tc kimlik no 11 karakter olmalı ve 0 ile başlamamlıdır");
		} else {
			// foreach
			for (char character : identityNumber.toCharArray()) {
				if(!Character.isDigit(character)) { // numeric olmayan bir karakter varsa
					// throw Error bir hata fırlatma işlemi olduğu için kod bu bloktan sonra döngüde de olsa if de de olsa kesilir kod çalışmaz
					throw new Error("Tc kimlik no sadece rakamlardan oluşmalıdır");
				}
			}
			
			// hata durumu yoksa değeri ata.
			this.identityNumber = identityNumber;
			
		}
		
	}
	

}
