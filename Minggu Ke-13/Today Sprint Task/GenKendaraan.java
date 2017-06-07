public class GenKendaraan <A> {
    
    public void NamaPembeli(String namaPembeli) {
        System.out.println("Nama Pembeli          : " +namaPembeli);
    }
    public <T,N> void Mobil (T namaMobil, N hargaMobil) {
        System.out.println("Nama  Mobil           : " +namaMobil);
        System.out.println("Harga Mobil           : " +hargaMobil);
    }
    public <T,N> void Motor (T namaMotor, N hargaMotor) {
        System.out.println("Nama Motor            : " +namaMotor);
        System.out.println("Harga Mobil           : " +hargaMotor);
    }
    public static void main (String[] args) {
        GenKendaraan ts = new GenKendaraan();
        GenKendaraan<String>  nm  = new GenKendaraan<>();
        GenKendaraan<Integer> hrg = new GenKendaraan<>();
        
        ts.NamaPembeli("Agung Nugraha");
        nm.Mobil("Lamborghini",300000000);
        hrg.Motor("Mio",15000000); 
    }
}