public class mainkendaraan extends motor{
	String Nama,Thn_Produksi;
	int Harga;
	
	
	void Tampil_Data_Lengkap(){
	    System.out.println("+++++++++++++++++++++++++++++");
		System.out.println("Daftar Data Lengkap Kendaraan");
		System.out.println("+++++++++++++++++++++++++++++");
	}
	
	
	void TambahPembeliKendaraan(String m, String n, int o){
		Nama=m;
		Thn_Produksi=n;
		Harga=o;
		Tampil_Data_Lengkap();
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("Nama Kendaraan   = " + Nama);
		System.out.println("Tahun Produksi   = " + Thn_Produksi);
		System.out.println("Harga            = " + Harga);
		System.out.println("+++++++++++++++++++++++++++\n\n");
	}
	
	public static void main(String argd[]){
	
		mainkendaraan Agung = new mainkendaraan();
		Agung.Merk_Kendaraan("Agung Nugraha", "2016",150000000);
		Agung.setMerk("Ferrari");
        Agung.setThn_Produksi("2017");
        Agung.setNama("Agung Nugraha");
        Agung.setHarga(250000000);
        Agung.setBerat(500);
		Agung.RincianMobil();
		Agung.RincianMotor();		
	}
	
}