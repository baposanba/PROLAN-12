public class motor extends macam_kendaraan{
	String KodeKendaraan = "Z0045";
	String Pembeli;
	
	void TambahPembeli(String l){
		Pembeli=l;
	}
	
	void Tampil(){
	    System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Tampilan Data Dari Pembeli Motor");
		System.out.println("++++++++++++++++++++++++++++++++");
	}
	
	void RincianMobil(){
		super.Tampil();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Kode Kendaraan macam_kendaraan  = " + super.KodeKendaraan);
		System.out.println("Nama Mobil                      = " + super.Nama);
		System.out.println("Tahun Produksi Mobil            = " + super.Thn_Produksi);
		System.out.println("Harga Mobil                     = " + super.Harga);
		System.out.println("Berat Mobil                     = " + super.Berat);
		System.out.println("++++++++++++++++++++++++++++++++++++\n\n");
	}	
	void RincianMotor(){
		Tampil();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Kode Kendaraan Pembeli = " + KodeKendaraan);
		System.out.println("Nama Motor             = " + super.Nama);
		System.out.println("Tahun Produksi Motor   = " + super.Thn_Produksi);
		System.out.println("Harga Motor            = " + super.Harga);
		System.out.println("Berat Motor            = " + super.Berat);	
		System.out.println("Pembeli                = " + Pembeli);
		System.out.println("++++++++++++++++++++++++++++++++++++\n\n");
	}
}