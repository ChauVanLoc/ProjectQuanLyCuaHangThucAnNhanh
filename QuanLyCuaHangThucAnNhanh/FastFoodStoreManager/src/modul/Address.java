package modul;

public class Address {
	private String road; // tên đường
	private String district; // Quận huyện
	private String provineOrCity; // Tỉnh hoặc thành phố

	public Address(String road, String district, String provineOrCity) {
		this.road = road;
		this.district = district;
		this.provineOrCity = provineOrCity;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getProvineOrCity() {
		return provineOrCity;
	}

	public void setProvineOrCity(String provineOrCity) {
		this.provineOrCity = provineOrCity;
	}
}
