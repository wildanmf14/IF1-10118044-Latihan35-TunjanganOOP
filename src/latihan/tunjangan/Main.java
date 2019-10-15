package latihan.tunjangan;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Gaji gaji = new Gaji();
		System.out.println("============Program Tunjangan============");        
		System.out.printf("Berapa gaji pokok Anda perbulan : Rp. ");
		gaji.gajiPokok = reader.nextDouble();
		System.out.printf("Status Anda? (Menikah/Belum) \t: ");
		gaji.statusNikah = reader.next();
		System.out.println("");
		System.out.println("==========Hasil Perhitungan Gaji Anda==========");
		
		if(gaji.statusNikah.equals("Menikah")) {
			gaji.hitungTunjangan();
			gaji.hitungGaji();
			
        	System.out.printf("Gaji Pokok\t : Rp. %,12.2f%n", gaji.gajiPokok);
        	System.out.printf("Tunjangan\t : Rp. %,12.2f%n", gaji.tunjangan);
        	System.out.printf("Total Gaji\t : Rp. %,12.2f%n", gaji.totalGaji);
      
			
		} else 
        	System.out.printf("Gaji Pokok\t : %,12.2f%n", gaji.gajiPokok);

        

		reader.close();
		System.out.println("Developed by : Wildan Muhammad Fikri");

	}

}
