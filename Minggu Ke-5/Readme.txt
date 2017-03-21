pada program kendaraan ini mempunyai 3 kelas pewaris dan yang kakeknya adalah class macam_kendaraan

class macam_kendaraan mempunyai :

atribut = KodeKendaraanerk,Thn_Produksi,Nama,Harga,Berat
method  = Tampil, Merk_Kendaraan, Berat_Kendaraan

class bapak : class motor

class motor mempunyai :

atribut baru= Kode_Kendaraan,Pembeli
method baru = TambahPembeli,Tampil, RincianMobil, RincianMotor

class anak : MainKendaraan

class anak mempunyai :

atribut baru= Nama,Thn_Produksi,Harga
method baru = Tampil_Data_Lengkap, TambahPembeliKendaraan

*pada kelas bapak : class motor memiliki semua atribut dan method dari kelas kakek : class macam_kendaraan, ada penambahan atribut di class motor yaitu Kode_Kendaraan dan Pembeli serta method TambahPembeli,Tampil, RincianMobil dan RincianMotor.

*Di kelas kakek mempunya Kode_Kendaraan Juga , maka penggunaan atribut Kode_Kendaraan di class macam_kendaraan menggunakan "super" untuk menampilkan Kode_Kendaraan class macam_kendaraan.

*Tapi jika ingin memanggil Kode_Kendaraan di class motor , cukup memanggil atributnya saja dan tanpa menggunakan kata "super"

*dan terakhir kelas anak : class mainkendaraan terdapat atribut yang sama dengan di kelas kakek : class mainkendaraan dan juga kelas bapak : class motor.