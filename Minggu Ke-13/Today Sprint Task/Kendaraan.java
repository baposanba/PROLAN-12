public class Kendaraan {
    public <T> void NamaKendaraan (T namaKendaraan) {
        System.out.println("Nama Kendaraan         : " +namaKendaraan);     
    }
    public <T> void JenisKendaraan (T jnsKendaraan) {
        System.out.println("Jenis Kendaraan        : " +jnsKendaraan);
    }
    public <T> void TahunProduksi (T thnProduksi) {
        System.out.println("Tahun Produksi         : " +thnProduksi);
    }
    public <T,N> void Harga (T x , N y) {
        System.out.println("Harga PerKendaraan     : " +x);
        System.out.println("Jumlah Stok Kendaraan  : " +y);
    } 
    public static void main (String[] args) {
        Kendaraan info = new Kendaraan();
        
        info.NamaKendaraan("Ferrari");
        info.JenisKendaraan("Mobil");
        info.TahunProduksi("2017");
        info.Harga(15000000,20);
        
    } 
    
}
