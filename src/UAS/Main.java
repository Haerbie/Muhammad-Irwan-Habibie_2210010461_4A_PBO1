package UAS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah buku yang ingin diinput: ");
        int jumlahBuku = Integer.parseInt(scanner.nextLine());

        Genre[] daftarBuku = new Genre[jumlahBuku];

        for (int i = 0; i < jumlahBuku; i++) {
            System.out.println("Input data buku ke-" + (i + 1) + ":");

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

            System.out.print("Masukkan Judul Buku: ");
            String judul = scanner.nextLine();

            System.out.print("Masukkan Nama Pengarang: ");
            String pengarang = scanner.nextLine();

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

            System.out.println("Pilih Genre Buku:");
            System.out.println("1. Fiksi");
            System.out.println("2. Non-Fiksi");
            System.out.println("3. Sejarah");
            System.out.println("4. Sains");
            System.out.println("5. Lainnya");

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

            daftarBuku[i] = new Genre(kodeBuku, judul, pengarang, tahunTerbit, genre);
        }

        System.out.println("\nDaftar Buku di Perpustakaan:");
        for (Genre buku : daftarBuku) {
            buku.tampilkanInfoLengkap();
            System.out.println();
        }
    }
}