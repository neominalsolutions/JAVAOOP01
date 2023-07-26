package models;

public class AdminUser extends SuperUser  {

	public String securityKey;
	
}

// SuperUser extends User (Büyük büyük ded)
// AdminUser extends SuperUser (Büyük Dedemiz)
// AdminUser SuperUser ve User özelliklerine sahip olacaktır.