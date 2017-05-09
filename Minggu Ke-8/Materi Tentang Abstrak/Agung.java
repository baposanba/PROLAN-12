public class Agung extends Mahasiswa {
    
 
     @Override
    public  String ambilNama() {
        return super.ambilNama();
    }

    @Override
    public void tampilNama() {
        System.out.println(ambilNama());
	}
    
    
     @Override
    public String ambilNim() {
        return super.ambilNim();
    }

    @Override
    public void tampilNim() {
        System.out.println(ambilNim());
        }
    
    
    @Override
    public String ambilKelas() {
        return super.ambilKelas();
    }

    @Override
    public void tampilKelas() {
        System.out.println(ambilKelas());
        }
    
    @Override
    public String ambilTahun() {
        return super.ambilTahun();
    }

    @Override
    public void tampilTahun() {
        System.out.println(ambilTahun());
        }
    
    
    @Override
    protected void kuliah() {
        System.out.println("Anda Terdaftar Menjadi Mahasiswa UNIKOM BANDUNG "); 
    }

    @Override
    protected void lulus() {
        System.out.println("Selamat Anda Lulus Di UNIKOM BANDUNG "); 
    }

    @Override
    protected void tidaklulus() {
        System.out.println("Mohon Maaf, Anda Tidak Lulus Dan Harus Mengulang Lagi"); 
    }
    
     
}