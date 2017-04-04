public class mainkendaraan extends motor{
	String Nama,Thn_Produksi;
	int Harga;
	
	
	@Override
	void Berat_Kendaraan(int j){
		Berat=j;	
	}
	
	@Override
	void Tampil(){
		System.out.println("Daftar  Tampilan Dari MainKendaraan");
	}
	
	
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
		Agung.Berat_Kendaraan(250);
		Agung.TambahPembeli("Bagas Erlangga");
		Agung.TambahPembeliKendaraan("Bagas Erlangga", "2000" ,100000000);
		Agung.RincianMobil();
		Agung.RincianMotor();
	}
}