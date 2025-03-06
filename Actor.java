public class Actor {
    public String name;
    public int actorId;
    private List<String> films;

    public Actor(String name, int actorId) {
        this.name = name;
        this.actorId = actorId;
        this.films = new List<>();
    }

    // Film ekleme
    public void addFilm(String filmName) {
        films.add(filmName);
    }

    public String getName() {
        return name;
    }

    public int getActorId() {
        return actorId;
    }

    // Oyuncu güncelleme
    public void updateActor(String name) {
        if (name != null) this.name = name;
    }

    // Filmleri listeleme
    public void displayFilms() {
        System.out.print("Films participated in: ");
        films.display();
    }
    public String toString() {
        return "Actor: " + name + ", ID: " + actorId;
    }
}
