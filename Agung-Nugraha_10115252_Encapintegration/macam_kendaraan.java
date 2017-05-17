public abstract class macam_kendaraan{
	String KodeKendaraan = "X0023";
	String Merk,Thn_Produksi,Nama;
	int Harga,Berat;
	
	
	//set and get
	
	public String getMerk(){
        return Merk;
    }
   
    public void setMerk(String Merk){
        this.Merk = Merk;
    }

    public String getThn_Produksi(){
        return Thn_Produksi;
    }
    
    public void setThn_Produksi(String Thn_Produksi){
        this.Thn_Produksi = Thn_Produksi;
    }
    
    public String getNama(){
        return Nama;
    }
    
    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public int getHarga(){
        return Harga;
    }
    
    public void setHarga(int Harga){
        this.Harga = Harga;
    }

    public int getBerat(){
        return Berat;
    }
    
    public void setBerat(int Berat){
        this.Berat = Berat;
    }
    
	
	public void macam_kendaraan(){
		System.out.println("++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Disini mempunya bermacam-macam kendaraan");	
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n");			
	}
 
	public void Tampil(){
		System.out.println("++++++++++++++++++++++++++++");
		System.out.println("Tampilan Data Dari Kendaraan");
		System.out.println("++++++++++++++++++++++++++++");	
	}
	public void Merk_Kendaraan(String x, String y, int z){
		Nama=x;
		Thn_Produksi=y;
		Harga=z;
	}
 
	public void Berat_Kendaraan(int j){
		Berat=j;	
	}
 
    protected abstract void RincianMobil();
    protected abstract void RincianMotor();
}