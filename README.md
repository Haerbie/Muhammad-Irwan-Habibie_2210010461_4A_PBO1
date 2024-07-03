# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa Kode Buku, Judul, Pengarang, Tahun Terbit, dan Genre, dan memberikan output berupa informasi Apa yang kita inputkan.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Buku`, `Genre`, dan `Main` adalah contoh dari class.

```bash
public class Buku {
    ...
}

public class Genre extends Buku {
    ...
}

public class Main {
    ...
}
```

2. **Object** adalah instance dari class. Pada kode ini, `Genre[] daftarBuku = new Genre[jumlahBuku];` dan `daftarBuku[i] = new Genre(kodeBuku, judul, pengarang, tahunTerbit, genre);` adalah contoh pembuatan object.

```bash
Genre[] daftarBuku = new Genre[jumlahBuku];
daftarBuku[i] = new Genre(kodeBuku, judul, pengarang, tahunTerbit, genre);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `kodeBuku`, `judul`, `pengarang`, `tahunTerbit` dan `genre` adalah contoh atribut.

```bash
String kodeBuku;
String judul;
String pengarang;
int tahunTerbit;
String genre;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `Buku` dan `Genre`.

```bash
    public Buku(String kodeBuku, String judul, String pengarang, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    public Genre(String kodeBuku, String judul, String pengarang, int tahunTerbit, String genre) {
        super(kodeBuku, judul, pengarang, tahunTerbit);
        this.genre = genre;
    }

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setKodeBuku`, `setJudul`, `setPengarang`, `setTahunTerbit` dan `setGenre` adalah contoh method mutator.

```bash
    public void setKodeBuku(String kodeBuku) {
        this.kodeBuku = kodeBuku;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getKodeBuku`, `getJudul`, `getPengarang`, `getTahunTerbit` dan `getGenre` adalah contoh method accessor.

```bash
    public String getKodeBuku() {
        return kodeBuku;
    }

    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public String getGenre() {
        return genre;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `nama` dan `npm` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String genre;
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `Genre` mewarisi `Buku` dengan sintaks `extends`.

```bash
public class Genre extends Buku {
    ...
}
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, Construktor pada `Genre` merupakan override dari Construktor pada `Buku` dan method `tampilkanInfoLengkap()` di `Genre` merupakan override dari `tampilkanInfo()` di `Buku`.
```bash
    public Buku(String kodeBuku, String judul, String pengarang, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    @Override
    public Genre(String kodeBuku, String judul, String pengarang, int tahunTerbit, String genre) {
        super(kodeBuku, judul, pengarang, tahunTerbit);
        this.genre = genre;
    }

    public void tampilkanInfo() {
        System.out.println("Kode Buku: " + kodeBuku);
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }

    @Override
    public void tampilkanInfoLengkap() {
        super.tampilkanInfo();
        System.out.println("Genre: " + genre);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `getFakultas` dan seleksi `switch` dalam method `getProdi`.

```bash
            String kodeBuku = "";
            while (true) {
                try {
                    System.out.print("Masukkan Kode Buku (6 karakter): ");
                    kodeBuku = scanner.nextLine();
                    if (!kodeBuku.matches("\\d+")) {
                        throw new NumberFormatException("Kode Buku harus berupa angka.");
                    }
                    if (kodeBuku.length() != 6) {
                        throw new IllegalArgumentException("Kode Buku harus memiliki tepat 6 karakter.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            int tahunTerbit = 0;
            while (true) {
                try {
                    System.out.print("Masukkan Tahun Terbit (4 karakter): ");
                    String tahunTerbitStr = scanner.nextLine();
                    if (tahunTerbitStr.length() != 4) {
                        throw new IllegalArgumentException("Tahun Terbit harus memiliki tepat 4 karakter.");
                    }
                    tahunTerbit = Integer.parseInt(tahunTerbitStr);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Tahun Terbit harus berupa angka.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }

            int pilihan = 0;
            while (true) {
                try {
                    pilihan = Integer.parseInt(scanner.nextLine());
                    if (pilihan < 1 || pilihan > 5) {
                        throw new NumberFormatException("Pilihan tidak valid.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Pilihan harus berupa angka antara 1 dan 5.");
                }
            }

            String genre = "";
            switch (pilihan) {
                case 1:
                    genre = "Fiksi";
                    break;
                case 2:
                    genre = "Non-Fiksi";
                    break;
                case 3:
                    genre = "Sejarah";
                    break;
                case 4:
                    genre = "Sains";
                    break;
                case 5:
                    genre = "Lainnya";
                    break;
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input untuk menampilkan berapa kali kita memasukkan dan menampilkan data.

```bash
for (int i = 0; i < jumlahBuku; i++) {
    ...
    while (true) {
}

for (Genre buku : daftarBuku) {
    buku.tampilkanInfoLengkap();
    System.out.println();
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);

System.out.print("Masukkan jumlah buku yang ingin diinput: ");
int jumlahBuku = Integer.parseInt(scanner.nextLine());

System.out.print("Masukkan Kode Buku (6 karakter): ");
kodeBuku = scanner.nextLine();

System.out.print("Masukkan Judul Buku: ");
String judul = scanner.nextLine();

System.out.print("Masukkan Nama Pengarang: ");
String pengarang = scanner.nextLine();

System.out.print("Masukkan Tahun Terbit (4 karakter): ");
String tahunTerbitStr = scanner.nextLine();

System.out.println("Pilih Genre Buku:");
System.out.println("1. Fiksi");
System.out.println("2. Non-Fiksi");
System.out.println("3. Sejarah");
System.out.println("4. Sains");
System.out.println("5. Lainnya");
...
pilihan = Integer.parseInt(scanner.nextLine());
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, `Genre[] daftarBuku = new Genre[jumlahBuku];` dan `daftarBuku[i] = new Genre(kodeBuku, judul, pengarang, tahunTerbit, genre);` adalah contoh penggunaan array.

```bash
Genre[] daftarBuku = new Genre[jumlahBuku];

daftarBuku[i] = new Genre(kodeBuku, judul, pengarang, tahunTerbit, genre);

```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
                try {
                    System.out.print("Masukkan Kode Buku (6 karakter): ");
                    kodeBuku = scanner.nextLine();
                    if (!kodeBuku.matches("\\d+")) {
                        throw new NumberFormatException("Kode Buku harus berupa angka.");
                    }
                    if (kodeBuku.length() != 6) {
                        throw new IllegalArgumentException("Kode Buku harus memiliki tepat 6 karakter.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                try {
                    System.out.print("Masukkan Tahun Terbit (4 karakter): ");
                    String tahunTerbitStr = scanner.nextLine();
                    if (tahunTerbitStr.length() != 4) {
                        throw new IllegalArgumentException("Tahun Terbit harus memiliki tepat 4 karakter.");
                    }
                    tahunTerbit = Integer.parseInt(tahunTerbitStr);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Tahun Terbit harus berupa angka.");
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }

                try {
                    pilihan = Integer.parseInt(scanner.nextLine());
                    if (pilihan < 1 || pilihan > 5) {
                        throw new NumberFormatException("Pilihan tidak valid.");
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Error: Pilihan harus berupa angka antara 1 dan 5.");
                }
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Irwan Habibie
NPM: 2210010461
