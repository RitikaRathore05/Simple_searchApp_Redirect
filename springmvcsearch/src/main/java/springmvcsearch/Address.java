package springmvcsearch;

public class Address {

	private String Street;
	private String city;
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [Street=" + Street + ", city=" + city + "]";
	}
	
}
