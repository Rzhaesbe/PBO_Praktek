Readme: StudentRecord

File readme ini memberikan gambaran dan penjelasan tentang kode Java yang terdapat dalam kelas `StudentRecord`. Kode tersebut merupakan implementasi dari sebuah sistem catatan siswa yang mencakup informasi seperti nama, alamat, usia, serta nilai dalam beberapa mata pelajaran.

 Penjelasan Kode

Struktur Kelas

Kelas `StudentRecord` memiliki beberapa atribut dan method yang berkaitan dengan data siswa. Berikut adalah penjelasan mengenai atribut dan method yang ada:

 Atribut

- `name`: Menyimpan nama siswa.
- `address`: Menyimpan alamat siswa.
- `age`: Menyimpan usia siswa.
- `grade`: Menyimpan rata-rata nilai siswa.
- `mathGrade`: Menyimpan nilai matematika siswa.
- `englishGrade`: Menyimpan nilai bahasa Inggris siswa.
- `scienceGrade`: Menyimpan nilai ilmu pengetahuan siswa.
- `average`: Menyimpan rata-rata nilai siswa.
- `studentCount`: Menyimpan jumlah total siswa.

 Metode

- `StudentRecord()`: Konstruktor default yang akan dijalankan saat pembuatan objek `StudentRecord`. Di dalamnya, nilai atribut `studentCount` akan bertambah.
- `StudentRecord(String temp)`: Konstruktor yang menerima parameter `temp` untuk mengatur nilai atribut `name`. Atribut `studentCount` akan bertambah.
- `StudentRecord(String name, String address)`: Konstruktor yang menerima parameter `name` dan `address` untuk mengatur nilai atribut `name` dan `address`. Atribut `studentCount` akan bertambah.
- `StudentRecord(double mGrade, double eGrade, double sGrade)`: Konstruktor yang menerima parameter `mGrade`, `eGrade`, dan `sGrade` untuk mengatur nilai atribut `mathGrade`, `englishGrade`, dan `scienceGrade`. Atribut `studentCount` akan bertambah.
- Getter dan Setter: Metode untuk mengambil nilai atribut dan mengatur nilai atribut.
- `getAvarage()`: Menghitung rata-rata nilai siswa dengan menggunakan atribut `mathGrade`, `englishGrade`, dan `scienceGrade`. Nilai rata-rata akan disimpan dalam atribut `average`.
- `getStudentCount()`: Mengembalikan jumlah total siswa yang telah dibuat melalui atribut `studentCount`.
- `getGrade()`: Mengembalikan grade siswa berdasarkan rata-rata nilai yang dihitung dengan menggunakan metode `getAvarage()`.
- `print(String temp)`: Mencetak informasi nama, alamat, dan usia siswa ke layar dengan menggunakan nilai atribut.
- `print(double eGrade, double mGrade, double sGrade)`: Mencetak informasi nama, nilai matematika, bahasa Inggris, dan ilmu pengetahuan siswa ke layar.

----------------------------------------------------------------------------------------------------------------------------------------------
Readme: StudentRecordExample

File readme ini memberikan gambaran dan penjelasan tentang kode Java yang terdapat dalam kelas `StudentRecordExample`. Kode tersebut merupakan contoh penggunaan kelas `StudentRecord` yang merepresentasikan data dan fungsi terkait dengan catatan siswa, termasuk nama, alamat, usia, serta nilai dalam beberapa mata pelajaran.

Penjelasan Kode

 Struktur Kelas

Kelas `StudentRecordExample` memiliki method `main` yang berfungsi sebagai titik masuk program. Di dalam method `main`, terdapat beberapa contoh penggunaan kelas `StudentRecord`.

Contoh Penggunaan

1. Pembuatan Objek dan Pengaturan Nilai

   Pada bagian ini, objek `annaRecord` dibuat menggunakan konstruktor default dan kemudian nilai-nilai atributnya diatur menggunakan method setter. Informasi seperti nama, alamat, usia, dan nilai dalam beberapa mata pelajaran (Matematika, B.Inggris, Ilmu Pengetahuan) ditetapkan pada objek `annaRecord`.

2. Pengambilan Nilai Atribut

   Nilai-nilai atribut objek `annaRecord` diambil menggunakan method getter dan dicetak ke layar menggunakan perintah `System.out.println()`.

3. Fungsi Rata-rata dan Grade

   Menggunakan method `getAverage()` dan `getGrade()` pada objek `annaRecord`, rata-rata nilai dan grade (berdasarkan rata-rata) dicetak ke layar.

4. Contoh Penggunaan Lainnya

   Objek `aliRecord` dan `budiRecord` dibuat menggunakan konstruktor dengan parameter untuk mengatur nilai atribut. Pada objek `aliRecord`, terdapat pemanggilan method `print()` dengan parameter kosong dan dengan parameter nilai dalam beberapa mata pelajaran. Pada objek `budiRecord`, hanya terdapat pemanggilan method `print()` dengan parameter kosong.

5. Menghitung Jumlah Siswa

   Menggunakan method `getStudentCount()` dari kelas `StudentRecord`, jumlah total siswa yang telah dibuat dicetak ke layar.

 Contoh Output

Pada saat program dijalankan, output yang dihasilkan akan terlihat seperti ini:

```
Nama                : Anna
Alamat              : Padang
Umur                : 23
Matematika          : 80
B.Inggris           : 70
Ilmu Pengetahuan    : 80
Rata-Rata Nilai     : 76.66666666666667
Grade Nilai         : C
```

```
Nama                : Ali
Alamat              : Padang
```

```
Nilai Matematika     : 80
Nilai B.Inggris      : 70
Nilai Ilmu Pengetahuan: 80
```

```
Nama                : Budi
Alamat              : Bukittingi
```

```
Jumlah Siswa   : 3
```

----------------------------------------------------------------------------------------------------------------------------------------------
