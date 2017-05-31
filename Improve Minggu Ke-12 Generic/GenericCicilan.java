public class GenericCicilan <T> implements interfaceKendaraan{
    T cicilan, jumlahcicilan , byrcicilan;
    String namapenyicil;
    
    public void setnamapenyicil(String namapenyicil){
        this.namapenyicil = namapenyicil;
    }
    public String getnamapenyicil(){
        return namapenyicil;
    }
    public void setjumlahcicilan(T jumlahcicilan){
        this.jumlahcicilan = jumlahcicilan;
    }
    public T getjumlahcicilan(){
        return jumlahcicilan;
    }
    public void jumlahcicilan(T jumlahcicilan){
        this.jumlahcicilan = jumlahcicilan;
    }
    public void setbyrcicilan(T byrcicilan){
        this.byrcicilan = byrcicilan;
    }
    public T getbyrcicilan(){
        return byrcicilan;
    }
    public void setcicilan(T cicilan){
        this.cicilan = cicilan;
    }
    public T sisacicilan(){
        return cicilan;
    }
    
            
    
    
    @Override
    public void infokendaraan() {
        System.out.println("\n++++++Rincian Cicilan Kendaraan++++++");
    }

    @Override
    public void rincianpembeli() {
                System.out.println("Nama Penyicil          = " + getnamapenyicil());
		System.out.println("Jumlah Cicilan         = " + getjumlahcicilan());
		System.out.println("Cicilan Yang Dibayar   = " + getbyrcicilan());
		this.cicilan = cicilan;
                System.out.println("Sisa Cicilan           = " + sisacicilan());
                
    }

     @Override
    public void garispenutup() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
    }

}