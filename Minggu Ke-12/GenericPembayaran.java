public class GenericPembayaran <T> implements interfaceKendaraan{
    private T bayar, hargakendaraan;
    String jeniskendaraan;
    float discmember=0.7f;
    
    public void setjeniskendaraan(String jeniskendaraan){
        this.jeniskendaraan = jeniskendaraan;
    }
    public String getjeniskendaraan(){
        return jeniskendaraan;
    }
    public void sethargakendaraan(T hargakendaraan){
        this.hargakendaraan = hargakendaraan;
    }
    public T gethargakendaraan(){
        return hargakendaraan;
    }
    
    public T membayar(){
        return bayar;
    }
    
            
    
    
    @Override
    public void infokendaraan() {
        System.out.println("\n++++++++++Rincian Pembayaran Kendaraan++++++++++");
    }

    @Override
    public void rincianpembeli() {
                System.out.println("Jenis Kendaraan = " + getjeniskendaraan());
		        System.out.println("Harga Kendaraan = " + gethargakendaraan());
		        System.out.println("Diskon Member   = " + discmember);
				this.bayar= hargakendaraan;
                System.out.println("Total Bayaran   = " + membayar());
                
    }

     @Override
    public void garispenutup() {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
    }


}