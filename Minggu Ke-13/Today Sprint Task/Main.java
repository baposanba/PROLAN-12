public class Main {
   public <T> GenKendaraan Informasi (T Info) {
       return (GenKendaraan) Info;
   }
   
 public static void main(String[] args) {
   Main mn = new Main();
   
   mn.Informasi(new GenKendaraan<>()).NamaPembeli("Agung Nugraha");
   mn.Informasi(new GenKendaraan<>()).Mobil("Lamborghini",300000000);
   mn.Informasi(new GenKendaraan<>()).Motor("Mio",15000000);
   }
}
