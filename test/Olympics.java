package test;

public class Olympics {
	String country;
	String sport;
	int medal;
	
	public Olympics(String country, String sport, int medal) {
		super();
		this.country = country;
		this.sport = sport;
		this.medal = medal;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getSport() {
		return sport;
	}
	public void setSport(String sport) {
		this.sport = sport;
	}
	public int getMedal() {
		return medal;
	}
	public void setMedal(int medal) {
		this.medal = medal;
	}
	

}
