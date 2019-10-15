package latihan.tunjangan;

public class Gaji {
	public double gajiPokok;
	public double tunjangan;
	public double totalGaji;
	public String statusNikah;
	
	public void hitungTunjangan() {
		tunjangan =  gajiPokok * 0.35;
	}
	public void hitungGaji() {
		totalGaji = this.gajiPokok + tunjangan;
	}
}
