import java.util.Scanner;
public class MainKendaraan{
         	
	public static void main(String argd[]){
                char menu;
                motor mtr = new motor();
                mobil mbl = new mobil();
                GenericPembayaran<Integer> byr = new GenericPembayaran<>();
				 
                System.out.println("+++++Program Kendaraan+++++");
                System.out.println("A. Rincian Pembeli Motor       ");
                System.out.println("B. Rincian Pembeli Mobil       ");
		        System.out.println("C. Rincian Pembayaran Kendaraan");
                
                Scanner input = new Scanner (System.in);
                System.out.print("Masukan Menu = ");
                menu = input.next().charAt(0);
                
                switch (menu){
                    case 'A': 
                              mtr.setNama(input.nextLine());
                              System.out.print("Nama = ");
                              mtr.setNama(input.nextLine());
                              System.out.print("Merk = ");
                              mtr.setMerk(input.nextLine());
                              System.out.print("Thn Produksi = ");
                              mtr.setThn_Produksi(input.nextLine());
                              System.out.print("Harga =");
                              mtr.setHarga(input.nextInt());
							  System.out.print("Berat =");
                              mtr.setBerat(input.nextInt());
                              
                              mtr.infokendaraan();
                              mtr.rinciankendaraan();
                              mtr.rincianpembeli();
                              mtr.garispenutup();
                              break;
                
                    case 'B': 
					          mbl.setNama(input.nextLine());
                              System.out.print("Nama = ");
                              mbl.setNama(input.nextLine());
                              System.out.print("Merk = ");
                              mbl.setMerk(input.nextLine());
                              System.out.print("Thn Produksi = ");
                              mbl.setThn_Produksi(input.nextLine());
                              System.out.print("Harga =");
                              mbl.setHarga(input.nextInt());
							  System.out.print("Berat =");
                              mbl.setBerat(input.nextInt());
                              
                              mbl.infokendaraan();
                              mbl.rinciankendaraan();
                              mbl.rincianpembeli();
                              mbl.garispenutup();
                              break;
					
					case 'C': byr.setjeniskendaraan(input.nextLine());
                              System.out.print("Jenis Kendaraan = ");
							  byr.setjeniskendaraan(input.nextLine());
                              System.out.print("Harga Kendaraan = ");
                              byr.sethargakendaraan(input.nextInt());  
                             
                              byr.infokendaraan();
                              byr.rincianpembeli();
                              byr.garispenutup();
                              break;
                }
	}
	
}