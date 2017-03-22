import java.util.Scanner;
class MencariNilaiMinMax{

	public static void main(String[] args) 
	{
		int Jumlah, Nilai,i,min=100,max=0;
		char pilihan;
		
		MaxMin tes = new MaxMin();
		Scanner input = new Scanner (System.in);
		System.out.println("\n+++++++++++++++++++++++++++++++++++++++++");
		System.out.println("Program Mencari Nilai Minimal Dan Maximal");
		System.out.println("+++++++++++++++++++++++++++++++++++++++++");
		System.out.print("Masukan Banyak Data = ");
        Jumlah = input.nextInt();
		System.out.println("\nJika Memilih A maka mencari nilai Minimum , Jika B maka mencari nilai Maximum");
		System.out.print("Masukan Pilihan (A atau B) = ");
        pilihan = input.next().charAt(0);
		System.out.println("+++++++++++++++++++++++++++++++");
		for (i=1;i<=Jumlah;i++){		
			System.out.print("Masukan Nilai ke-"+ i +"         = ");
            Nilai = input.nextInt();
			if (pilihan =='A'){
				min=tes.pilihanA(Nilai,min);
			}
			if (pilihan == 'B'){
				max=tes.pilihanB(Nilai,max);
			}
		}
		System.out.println("+++++++++++++++++++++++++++++++");
		System.out.println("Banyak Data yang Dimasukan = " + Jumlah);
		System.out.println("\n+++++++++++++++++++++++++++++++");
		System.out.println("Nilai minimum              = " + min);
		System.out.println("Nilai maximum              = " + max);
		System.out.println("+++++++++++++++++++++++++++++++");
	}
}

class MaxMin{
	int pilihanA(int x, int y){
		if(x<y){
			y=x;
			return y;
		}
		return y;
	}
	
	int pilihanB(int x, int y){
		if(x>y){
			y=x;
			return y;
		}
		return y;
	}
}