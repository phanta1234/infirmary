package upes.techteam.models;

public class Stock {

	int medid;
	String medicine;
	String amount;
	public Stock(int medid, String medicine, String amount) {
		this.medid = medid;
		this.medicine = medicine;
		this.amount = amount;
	}
	public Stock() {
	}
	public int getMedid() {
		return medid;
	}
	public void setMedid(int medid) {
		this.medid = medid;
	}
	public String getMedicine() {
		return medicine;
	}
	public void setMedicine(String medicine) {
		this.medicine = medicine;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
}
