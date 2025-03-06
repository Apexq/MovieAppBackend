public class Recommendation {
    private HashTable<String, List<Film>> genreTable;

    public Recommendation() {
        genreTable = new HashTable<>(10); // 10 kapasite ile başlatıyoruz
    }

    public void addFilm(Film film) {
        List<Film> filmList = genreTable.get(film.getGenre());
        if (filmList == null) {
            filmList = new List<>();
            genreTable.put(film.getGenre(), filmList);
        }
        filmList.add(film);
        System.out.println("Film eklendi: " + film.getName() + " (" + film.getGenre() + ")");
    }

    public void recommendByGenre(String genre) {
        List<Film> filmList = genreTable.get(genre);
        if (filmList == null) {
            System.out.println("Bu türde bir film bulunamadı: " + genre);
            return;
        }

        System.out.println("Tür: " + genre + " için önerilen filmler:");
        Node<Film> current = filmList.head;
        while (current != null) {
            System.out.println("- " + current.data.getName());
            current = current.next;
        }
    }
}

