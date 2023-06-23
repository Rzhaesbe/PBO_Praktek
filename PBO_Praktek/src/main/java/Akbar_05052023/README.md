Readme: DataBukuAlamat

File readme ini memberikan gambaran dan penjelasan tentang kode Java yang terdapat dalam kelas `DataBukuAlamat`. Kode tersebut merupakan implementasi sederhana dari sistem manajemen data buku alamat. Kelas ini memiliki method untuk melakukan penyisipan, pembaruan, penghapusan, dan pengambilan data buku alamat.

Penjelasan Kode

 Struktur Kelas

Kelas `DataBukuAlamat` didefinisikan dengan atribut dan method berikut:

Atribut

- `data`: Array dari objek `BukuAlamat` untuk menyimpan entri buku alamat. Array ini memiliki ukuran tetap sebesar 100.
- `index`: Sebuah bilangan bulat untuk melacak indeks saat ini dalam array `data`.

 Method

- `insert(BukuAlamat bukuAlamat)`: Memasukkan objek `BukuAlamat` ke dalam array `data` pada posisi indeks saat ini, dan menambahkan nilai indeks sebesar 1.
- `update(int index, BukuAlamat bukuAlamat)`: Memperbarui objek `BukuAlamat` pada indeks yang ditentukan dalam array `data` dengan objek `bukuAlamat` yang diberikan.
- `getAll()`: Mengambil semua objek `BukuAlamat` yang valid dari array `data` dan mengembalikannya sebagai sebuah array.
- `delete(int index)`: Menghapus objek `BukuAlamat` pada indeks yang ditentukan dalam array `data` dengan mengatur atributnya menjadi nilai kosong.

 Metode Main

Metode `main` mendemonstrasikan penggunaan kelas `DataBukuAlamat` dengan melakukan langkah-langkah berikut:

1. Membuat sebuah instance dari kelas `DataBukuAlamat` dengan nama `data`.
2. Membuat sebuah instance dari kelas `BukuAlamat` dengan nama `temp` dan mengatur atribut-atributnya (nama, alamat, nomor telepon, dan email).
3. Memasukkan objek `temp` ke dalam instance `data` menggunakan method `insert`.
4. Mengambil semua objek `BukuAlamat` yang valid dari `data` menggunakan method `getAll` dan menyimpannya dalam array `list`.
5. Mencetak rincian dari setiap objek `BukuAlamat` dalam array `list`, termasuk nama, alamat, nomor telepon, dan email.

 Contoh Output

Kode contoh yang terdapat dalam metode `main` akan menghasilkan output berikut:

```
Buku Alamat ke--->1
Nama    : Azzammil Akbar Ramadhan
Alamat  : Tanah Datar, Sumbar
No Telp : 081218365391
Email   : azzammilakbarramdhan@gmail.com
```

Output ini menunjukkan keberhasilan penyisipan objek `BukuAlamat` dan pengambilan detailnya menggunakan kelas `DataBukuAlamat`.

Silakan modifikasi dan perluas kode sesuai dengan kebutuhan spesifik Anda.

----------------------------------------------------------------------------------------------------------------------------------
Readme: MenuBukuAlamat

File readme ini memberikan gambaran dan penjelasan tentang kode Java yang terdapat dalam kelas `MenuBukuAlamat`. Kode tersebut merupakan implementasi sederhana dari menu interaktif untuk manajemen data buku alamat. Pengguna dapat memasukkan, menghapus, memperbarui, dan menampilkan data buku alamat.

Penjelasan Kode

truktur Kelas

Kelas `MenuBukuAlamat` memiliki method `main` yang berfungsi sebagai titik masuk program. Di dalam method `main`, terdapat pengaturan menu interaktif untuk manajemen data buku alamat.

Atribut

Tidak ada atribut yang didefinisikan dalam kelas ini.

Method

- `main(String[] args)`: Method utama yang berisi logika menu interaktif untuk manajemen data buku alamat. Di dalam method ini, terdapat loop yang akan terus berjalan hingga pengguna memilih opsi "Keluar". Pilihan pengguna ditentukan menggunakan `BufferedReader` dan `InputStreamReader`. Berikut ini adalah tindakan yang dilakukan berdasarkan pilihan pengguna:
  - Pilihan 1: Pengguna diminta memasukkan detail buku alamat (nama, alamat, nomor telepon, dan email) menggunakan `BufferedReader`. Setelah itu, objek `BukuAlamat` dibuat dan dimasukkan ke dalam instance `data` menggunakan method `insert`.
  - Pilihan 4: Mengambil semua objek `BukuAlamat` yang valid dari instance `data` menggunakan method `getAll` dan menyimpannya dalam array `list`. Kemudian, rincian dari setiap objek `BukuAlamat` dalam array `list` dicetak ke layar.

Contoh Penggunaan

Untuk menggunakan program ini, jalankan kelas `MenuBukuAlamat`. Setelah itu, ikuti petunjuk pada layar untuk memilih opsi yang diinginkan, seperti memasukkan data baru atau menampilkan data yang ada.

Catatan: Kode ini hanya menyertakan implementasi terbatas untuk pilihan 1 dan 4. Anda dapat mengembangkan lebih lanjut sesuai kebutuhan Anda dengan menambahkan implementasi untuk pilihan lain seperti penghapusan data atau pembaruan data.

Silakan modifikasi dan perluas kode sesuai dengan kebutuhan spesifik Anda.

----------------------------------------------------------------------------------------------------------------------------------------------
 Readme: BukuAlamat

File readme ini memberikan gambaran dan penjelasan tentang kode Java yang terdapat dalam kelas `BukuAlamat`. Kode tersebut merupakan implementasi sederhana dari entitas Buku Alamat yang menyimpan informasi seperti nama, alamat, nomor telepon, dan email.

 Penjelasan Kode

Struktur Kelas

Kelas `BukuAlamat` memiliki atribut dan method berikut:

 Atribut

- `nama`: Sebuah string yang menyimpan nama pemilik buku alamat.
- `alamat`: Sebuah string yang menyimpan alamat pemilik buku alamat.
- `notelp`: Sebuah string yang menyimpan nomor telepon pemilik buku alamat.
- `email`: Sebuah string yang menyimpan alamat email pemilik buku alamat.

 Konstruktor

- `BukuAlamat()`: Konstruktor default yang tidak memiliki parameter. Digunakan untuk membuat objek `BukuAlamat` tanpa menginisialisasi atributnya.
- `BukuAlamat(String nama, String alamat, String notelp, String email)`: Konstruktor yang menerima parameter untuk menginisialisasi atribut nama, alamat, notelp, dan email dengan nilai yang diberikan.

 Method

- `getNama()`: Mengembalikan nilai atribut `nama`.
- `setNama(String nama)`: Mengatur nilai atribut `nama` dengan nilai yang diberikan.
- `getAlamat()`: Mengembalikan nilai atribut `alamat`.
- `setAlamat(String alamat)`: Mengatur nilai atribut `alamat` dengan nilai yang diberikan.
- `getNotelp()`: Mengembalikan nilai atribut `notelp`.
- `setNotelp(String notelp)`: Mengatur nilai atribut `notelp` dengan nilai yang diberikan.
- `getEmail()`: Mengembalikan nilai atribut `email`.
- `setEmail(String email)`: Mengatur nilai atribut `email` dengan nilai yang diberikan.

 Contoh Penggunaan

Untuk menggunakan kelas `BukuAlamat`, Anda dapat membuat objek `BukuAlamat` dengan menggunakan konstruktor default atau konstruktor yang menerima nilai untuk setiap atribut. Setelah membuat objek, Anda dapat menggunakan method getter dan setter untuk mengakses dan memperbarui nilai atribut.

Berikut adalah contoh penggunaan kelas `BukuAlamat`:

```java
BukuAlamat bukuAlamat = new BukuAlamat();
bukuAlamat.setNama("Akbar");
bukuAlamat.setAlamat("Politeknik");
bukuAlamat.setNotelp("1234567890");
bukuAlamat.setEmail("akbar@example.com");

System.out.println("Nama    : " + bukuAlamat.getNama());
System.out.println("Alamat  : " + bukuAlamat.getAlamat());
System.out.println("No Telp : " + bukuAlamat.getNotelp());
System.out.println("Email   : " + bukuAlamat.getEmail());
```

Output:

```
Nama    : Akbar
Alamat  : Politeknik
No Telp : 1234567890
Email   : akbar@example.com
```

Anda juga dapat menggunakan konstruktor yang menerima parameter untuk menginisialisasi atribut saat membuat objek:

```java
BukuAlamat bukuAlamat = new BukuAlamat("Akbar", "Politeknik", "0987654321", "akbar@example.com");
```