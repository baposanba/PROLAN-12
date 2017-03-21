public class macam_kendaraan{
	String KodeKendaraan = "X0023";
	String Merk,Thn_Produksi,Nama;
	int Harga,Berat;
 
	void Tampil(){
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("Tampilan Data Dari Kendaraan");
		System.out.println("++++++++++++++++++++++++++++");	
	}
	void Merk_Kendaraan(String x, String y, int z){
		Nama=x;
		Thn_Produksi=y;
		Harga=z;
	}
 
	void Berat_Kendaraan(int j){
		Berat=j;	
	}
 
}