 public class motor extends macam_kendaraan{
 
    @Override
    public void infokendaraan() {
        System.out.println("\n++++++++++Rincian Pembeli Motor++++++++++");
    }

    @Override
    public void rincianpembeli() {
        System.out.println("ID Karyawan   = " + getNama());
		System.out.println("Nama Karyawan = " + getMerk());
		System.out.println("Alamat        = " + getThn_Produksi());
		System.out.println("Tanggl Lahir  = " + getHarga());
		System.out.println("Jenis Kelamin = " + getBerat());
		
    }

    @Override
    public void garispenutup() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }

    @Override
    protected void rinciankendaraan() {
        System.out.println("Berikut Adalah Rincian Kendaraan Motor :");
    }
}