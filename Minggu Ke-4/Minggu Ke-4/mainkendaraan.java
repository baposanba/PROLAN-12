public class mainkendaraan
{
     public static void main(String[]args)
	 {
           //pemanggilan konstruktor
		   pembeli agung = new pembeli();	
           mobil method = new mobil();		   
		   motor cek = new motor();
		   
		   System.out.println("= = = = = = = = = = = = = = = = = = =");
	       System.out.println("Nama          : " +agung.Nama);
		   System.out.println("Tanggal Lahir : " +agung.Tgl_lahir);
		   System.out.println("Umur          : " +agung.Umur);
		   System.out.println("Jenis Kelamin : " +agung.JenisKel);
		   System.out.println("Status        : " +agung.Status);
		   System.out.println("= = = = = = = = = = = = = = = = = = =");
		  
  		   method.Tampil_merk_mobil("Lamborghini");
		   method.Tampil_data_mobil("Alya", 150000000);
		   method.Tampil_data_mobil("Agya", 140000000,"30Kg");
		   
		   cek.data_motor(10000000, 2015, "Mio Z");
		   System.out.println("Harga Motor    : " +cek.harga_motor);
		   System.out.println("Tahun Produksi : " +cek.tahun_produksi);
		   System.out.println("Merk Motor     : " +cek.merk_motor);

	 }
}