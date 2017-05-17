public class motor extends macam_kendaraan{
	String KodeKendaraan = "Z0045";
	String Pembeli;
	
	void TambahPembeli(String l){
		Pembeli=l;
	}
	
	@Override
	public void Tampil(){
	    System.out.println("++++++++++++++++++++++++++++++++");
		System.out.println("Tampilan Data Dari Pembeli Motor");
		System.out.println("++++++++++++++++++++++++++++++++");
	}
	
	public void RincianMobil(){
		super.Tampil();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Kode Kendaraan macam_kendaraan  = " + getMerk());
		System.out.println("Nama Mobil                      = " + getNama());
		System.out.println("Tahun Produksi Mobil            = " + getThn_Produksi());
		System.out.println("Harga Mobil                     = " + getHarga());
		System.out.println("Berat Mobil                     = " + getBerat());
		System.out.println("++++++++++++++++++++++++++++++++++++\n\n");
	}	
	public void RincianMotor(){
		Tampil();
		System.out.println("++++++++++++++++++++++++++++++++++++");
		System.out.println("Kode Kendaraan Pembeli = " + getMerk());
		System.out.println("Nama Motor             = " + getNama());
		System.out.println("Tahun Produksi Motor   = " + getThn_Produksi());
		System.out.println("Harga Motor            = " + getHarga());
		System.out.println("Berat Motor            = " + getBerat());	
		System.out.println("++++++++++++++++++++++++++++++++++++\n\n");
	}
}