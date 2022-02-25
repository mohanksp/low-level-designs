package core.oodesign.structural.adapter;

public class Address {

	private String hno;
	private String landmark;
	private String city;
	private String country;

	public String getHno() {
		return hno;
	}

	public void setHno(String hno) {
		this.hno = hno;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", landmark=" + landmark + ", city=" + city + ", country=" + country + "]";
	}
	
	

}
