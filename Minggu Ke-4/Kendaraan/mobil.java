class mobil
{
	 
   //method mengembalikan nilai dengan menggunakan parameter
   public String Tampil_merk_mobil(String merk_mobil)
   {
        return merk_mobil;
   }
    
	
	
	//method overloading dan penggunaan
    public void Tampil_data_mobil(String Nama_mobil, int harga_mobil)	
	{
		System.out.println("= = = = = = = = = = = = = = = =");
		System.out.println("Nama_mobil  :  " +Nama_mobil);
		System.out.println("harga_mobil :  " +harga_mobil);
		System.out.println("= = = = = = = = = = = = = = = =");
	}
	
	public void Tampil_data_mobil(String Nama_mobil, int harga_mobil, String berat_mobil)	
	{
	    System.out.println("= = = = = = = = = = = = = = = =");
		System.out.println("Nama_mobil  :  " +Nama_mobil);
		System.out.println("harga_mobil :  " +harga_mobil);
		System.out.println("Berat Mobil :  " +berat_mobil);
		System.out.println("= = = = = = = = = = = = = = = =");
	}
}