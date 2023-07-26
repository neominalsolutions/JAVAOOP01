package models;

public class Product {
	
	// nesnelerimize değer ataması yaparken bu değerleri initialize dediğimiz aşamada yaparız.
	// nesne newlenirken nesneye kazandırılan özellikler consturctor dediğimiz özel bir method sayesinde olur.
	// constuctor methodlar sınıflar ile aynı isimde yazılır
	// ve sınıfın içerisinde propertylere setterlar dışında değer atamak için kullanılır.
	
	private int stock; // stok değeri
	
	public int getStock() {
		return stock;
	}
	
	private String name; // isim
	
	public String getName() { // getter
		return name;
	} 
	
	private double price; // fiyat
	
	public double getPrice() { // getter
		return price;
	}
	
	public Product() {
		// nesne referanslarının ilk ramde oluşturuğu yer.
	}
	
	public Product(String name) {
		this.name = name;
	}
	
	public Product(String name, int stock) {
		
		if(name.isBlank()) {
			throw new Error("name alanı boş geçilemez");
		}
		
		this.name = name;
		this.stock = stock;
	}
	
	public Product(String name, int stock, double price) {
		this.name = name;
		this.stock = stock;
		this.price = price;
	}
	
	// nesneyi 4 farklı şekilde oluşturabiliriz.
	
	

}
