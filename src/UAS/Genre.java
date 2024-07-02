
package UAS;

public class Genre extends Buku {
    private String genre;

    public Genre(String kodeBuku, String judul, String pengarang, int tahunTerbit, String genre) {
        super(kodeBuku, judul, pengarang, tahunTerbit);
        this.genre = genre;
    }

    // Getter dan Setter
    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
    
    public void tampilkanInfoLengkap() {
        super.tampilkanInfo();
        System.out.println("Genre: " + genre);
    }
}