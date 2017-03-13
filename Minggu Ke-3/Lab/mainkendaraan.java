class mobil
{
   String merk_mobil;
   int harga_mobil;
   byte kapasitas_mobil,berat_mobil;
   
	void maju_mobil()
	{
		System.out.println("Mobil anda melaju dengan kecepatan 200 KM per jam...");	
	}
	void mundur_mobil()
	{
	       System.out.println("Gigi R adalah untuk mundur...");	
	}
	void berhenti_mobil()
	{
	       System.out.println("Gunakan rem jika dijalan macet...");	
	}
      
}

class motor
{
	String merk_motor;
    Short tahun_produksi;
	int harga_motor;
	Byte berat_motor;
    void tampungan_motor()
	{
		System.out.println("Motor ini hanya bisa menampung 2 orang saja...");	
	}
	void maju_motor()
	{
		System.out.println("Motor anda melaju dengan kecepatan 100 KM per jam...");	
	}
	
	void berhenti_motor()
	{
		System.out.println("Berhenti jika ada lampu merah...");	
	}
}

public class mainkendaraan
{
     public static void main(String[]args)
	 {
		 mobil agung = new mobil();
	     agung.merk_mobil = "Lamborghini";
		 agung.maju_mobil();
	 }
}