public class MainProject extends Agung {
   public static void main (String[] args) {
       Agung Azun = new Agung();
       
       System.out.print("==========================================\n");
	   System.out.print("Nama Anda        :      "); Azun.tampilNama();
       System.out.print("NIM Anda         :      "); Azun.tampilNim();
       System.out.print("Kelas Anda       :      "); Azun.tampilKelas();
       System.out.print("Tahun masuk anda :      "); Azun.tampilTahun();
       System.out.print("==========================================\n");
       
       Azun.kuliah();
       Azun.lulus();
       Azun.tidaklulus();
      
       }
}