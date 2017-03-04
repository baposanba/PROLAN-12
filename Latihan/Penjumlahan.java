import java.util.Scanner;
public class Penjumlahan
{ 
  public static void main(String[] args) 
  {
     Scanner input = new Scanner (System.in);
	 int a,b,jumlah;
 
     System.out.print("Masukan Angka Pertama  : ");
     a = input.nextInt();
     System.out.print("Masukan Angka Kedua    : ");
     b = input.nextInt();
     jumlah = a+b;
     System.out.print("Hasil nya adalah : ");
     System.out.print(jumlah); 
  }
}