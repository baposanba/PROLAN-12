public abstract class Mahasiswa {
  public String nama = "Agung Nugraha";
  public String nim = "10115252";
  public String kelas = "Prolan - 12";
  public String tahun = "2015";
          
  public String ambilNama() {
        return nama;
    }

public abstract void tampilNama();

public String ambilNim() {
        return nim;
    }

public abstract void tampilNim();

public String ambilKelas() {
        return kelas;
    }

public abstract void tampilKelas();

public String ambilTahun() {
        return tahun;
    }

public abstract void tampilTahun();
  
  protected abstract void kuliah();
  protected abstract void lulus();
  protected abstract void tidaklulus();
  
}