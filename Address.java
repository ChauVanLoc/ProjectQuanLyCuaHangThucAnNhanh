package managementStore;

public class Address {
	private int number;
	private String road;
	private String quarter;
	private String ward;
	private String distric;
	private String province;

	public Address(int number, String road, String quarter, String ward, String distric, String province) {
		this.number = number;
		this.road = road;
		this.quarter = quarter;
		this.ward = ward;
		this.distric = distric;
		this.province = province;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getWard() {
		return ward;
	}

	public void setWard(String ward) {
		this.ward = ward;
	}

	public String getDistric() {
		return distric;
	}

	public void setDistric(String distric) {
		this.distric = distric;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

}
