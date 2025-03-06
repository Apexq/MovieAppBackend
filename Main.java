import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Film oluşturma
        Film film1 = new Film("Inception", 1, "Sci-Fi", 2010, 800000000l);
        Film film2 = new Film("Interstellar", 2, "Sci-Fi", 2014, 700000000l);
        Film film3 = new Film("The Dark Knight", 3, "Action", 2008, 1000000000l);
        Film film4 = new Film("Memento", 4, "Thriller", 2000, 400000000l);
        Film film5 = new Film("Avatar", 5, "Sci-Fi", 2009, 18000000000l);
        Film film6 = new Film("Titanic", 6, "Romance", 1997, 12000000000l);
        Film film7 = new Film("The Godfather", 7, "Crime", 1972, 1340000000l);
        Film film8 = new Film("The Shawshank Redemption", 8, "Drama", 1994, 580000000l);
        Film film9 = new Film("Pulp Fiction", 9, "Crime", 1994, 2130000000l);
        Film film10 = new Film("The Matrix", 10, "Sci-Fi", 1999, 4670000000l);
        Film film11 = new Film("Gladiator", 11, "Action", 2000, 4570000000l);
        Film film12 = new Film("The Avengers", 12, "Action", 2012, 15190000000l);
        Film film13 = new Film("Frozen", 13, "Animation", 2013, 12900000000l);
        Film film14 = new Film("Toy Story 3", 14, "Animation", 2010, 10670000000l);
        Film film15 = new Film("Joker", 15, "Crime", 2019, 10740000000l);
        Film film16 = new Film("Parasite", 16, "Drama", 2019, 2630000000l);
        Film film17 = new Film("Avengers: Endgame", 17, "Action", 2019, 1798000000l);
        Film film18 = new Film("The Lion King", 18, "Animation", 1994, 968000000l);
        Film film19 = new Film("Harry Potter and the Sorcerer's Stone", 19, "Fantasy", 2001, 975000000l);
        Film film20 = new Film("Star Wars: A New Hope", 20, "Sci-Fi", 1977, 775000000l);
        
        film1.addActor("Leonardo DiCaprio");
        film1.addActor("Joseph Gordon-Levitt");
        
        film2.addActor("Matthew McConaughey");
        film2.addActor("Anne Hathaway");
        
        film3.addActor("Christian Bale");
        film3.addActor("Heath Ledger");
        
        film4.addActor("Guy Pearce");
        film4.addActor("Carrie-Anne Moss");
        
        film5.addActor("Sam Worthington");
        film5.addActor("Zoe Saldana");
        
        film6.addActor("Leonardo DiCaprio");
        film6.addActor("Kate Winslet");
        
        film7.addActor("Marlon Brando");
        film7.addActor("Al Pacino");
        
        film8.addActor("Tim Robbins");
        film8.addActor("Morgan Freeman");
        
        film9.addActor("John Travolta");
        film9.addActor("Uma Thurman");
        
        film10.addActor("Keanu Reeves");
        film10.addActor("Laurence Fishburne");
        
        film11.addActor("Russell Crowe");
        film11.addActor("Joaquin Phoenix");
        
        film12.addActor("Robert Downey Jr.");
        film12.addActor("Chris Evans");
        
        film13.addActor("Idina Menzel");
        film13.addActor("Kristen Bell");
        
        film14.addActor("Tom Hanks");
        film14.addActor("Tim Allen");
        
        film15.addActor("Joaquin Phoenix");
        film15.addActor("Robert De Niro");
        
        film16.addActor("Song Kang-ho");
        film16.addActor("Choi Woo-shik");
        
        film17.addActor("Chris Hemsworth");
        film17.addActor("Scarlett Johansson");
        
        film18.addActor("Matthew Broderick");
        film18.addActor("James Earl Jones");
        
        film19.addActor("Daniel Radcliffe");
        film19.addActor("Emma Watson");
        
        film20.addActor("Mark Hamill");
        film20.addActor("Harrison Ford");
        
        // Oyuncu oluşturma
        Actor actor1 = new Actor("Leonardo DiCaprio", 101);
        actor1.addFilm("Inception");
        actor1.addFilm("Titanic");

        Actor actor2 = new Actor("Joseph Gordon-Levitt", 102);
        actor2.addFilm("Inception");
        actor2.addFilm("Looper");

        Actor actor3 = new Actor("Matthew McConaughey", 103);
        actor3.addFilm("Interstellar");
        actor3.addFilm("Dallas Buyers Club");

        Actor actor4 = new Actor("Anne Hathaway", 104);
        actor4.addFilm("Interstellar");
        actor4.addFilm("Les Misérables");

        Actor actor5 = new Actor("Christian Bale", 105);
        actor5.addFilm("The Dark Knight");
        actor5.addFilm("American Psycho");

        Actor actor6 = new Actor("Heath Ledger", 106);
        actor6.addFilm("The Dark Knight");
        actor6.addFilm("Brokeback Mountain");

        Actor actor7 = new Actor("Guy Pearce", 107);
        actor7.addFilm("Memento");
        actor7.addFilm("The Hurt Locker");

        Actor actor8 = new Actor("Carrie-Anne Moss", 108);
        actor8.addFilm("Memento");
        actor8.addFilm("The Matrix");

        Actor actor9 = new Actor("Sam Worthington", 109);
        actor9.addFilm("Avatar");
        actor9.addFilm("Clash of the Titans");

        Actor actor10 = new Actor("Zoe Saldana", 110);
        actor10.addFilm("Avatar");
        actor10.addFilm("Guardians of the Galaxy");

        Actor actor11 = new Actor("Marlon Brando", 111);
        actor11.addFilm("The Godfather");
        actor11.addFilm("Apocalypse Now");

        Actor actor12 = new Actor("Al Pacino", 112);
        actor12.addFilm("The Godfather");
        actor12.addFilm("Scarface");

        Actor actor13 = new Actor("Tim Robbins", 113);
        actor13.addFilm("The Shawshank Redemption");
        actor13.addFilm("Mystic River");

        Actor actor14 = new Actor("Morgan Freeman", 114);
        actor14.addFilm("The Shawshank Redemption");
        actor14.addFilm("Se7en");

        Actor actor15 = new Actor("John Travolta", 115);
        actor15.addFilm("Pulp Fiction");
        actor15.addFilm("Grease");

        Actor actor16 = new Actor("Uma Thurman", 116);
        actor16.addFilm("Pulp Fiction");
        actor16.addFilm("Kill Bill");

        Actor actor17 = new Actor("Keanu Reeves", 117);
        actor17.addFilm("The Matrix");
        actor17.addFilm("John Wick");

        Actor actor18 = new Actor("Laurence Fishburne", 118);
        actor18.addFilm("The Matrix");
        actor18.addFilm("Apocalypse Now");

        Actor actor19 = new Actor("Russell Crowe", 119);
        actor19.addFilm("Gladiator");
        actor19.addFilm("A Beautiful Mind");

        Actor actor20 = new Actor("Joaquin Phoenix", 120);
        actor20.addFilm("Gladiator");
        actor20.addFilm("Joker");

        film1.addFeedback("Alice", 5, "Amazing movie!");
        film1.addFeedback("Bob", 4, "Great visuals but confusing.");
        film1.addFeedback("Charlie", 3, "Good but overrated.");
        
        film2.addFeedback("Sarah", 5, "An emotional rollercoaster, loved it!");
        film2.addFeedback("John", 4, "Incredible story, but some scenes felt slow.");
        film2.addFeedback("Mike", 5, "The best sci-fi film I've ever seen!");
        
        film3.addFeedback("David", 5, "A true masterpiece, unforgettable performances.");
        film3.addFeedback("Emma", 4, "Great action but the pacing could be better.");
        film3.addFeedback("Sophia", 4, "Fantastic villain, but too dark for my taste.");
        
        film4.addFeedback("Chris", 3, "Interesting concept but it was hard to follow.");
        film4.addFeedback("Linda", 4, "Clever story, love the twists.");
        film4.addFeedback("Gary", 2, "Too confusing for me.");
        
        film5.addFeedback("James", 5, "Visually stunning, a must-see!");
        film5.addFeedback("Anna", 4, "The visual effects are groundbreaking.");
        film5.addFeedback("Tom", 4, "Great performances, but the plot was thin.");
        
        film6.addFeedback("Laura", 5, "Epic love story, unforgettable!");
        film6.addFeedback("George", 4, "A bit too long, but still a classic.");
        film6.addFeedback("Rachel", 5, "A true cinematic masterpiece!");
        
        film7.addFeedback("Peter", 5, "One of the greatest films ever made.");
        film7.addFeedback("Jack", 4, "Iconic, but a little dated in some parts.");
        film7.addFeedback("Lily", 4, "Great performances, but the pacing was slow.");
        
        film8.addFeedback("Oliver", 5, "A film that transcends time, perfect storytelling.");
        film8.addFeedback("Sophia", 4, "Great performances, but the film could be a bit faster.");
        film8.addFeedback("Emily", 5, "Truly inspiring, an all-time classic.");
        
        film9.addFeedback("Paul", 5, "Brilliant writing and incredible performances.");
        film9.addFeedback("Kate", 4, "A bit too much violence, but overall great.");
        film9.addFeedback("Leo", 5, "A gripping film that stays with you long after it's over.");
        
        film10.addFeedback("Max", 5, "An unforgettable film with great action.");
        film10.addFeedback("Daniel", 4, "Amazing fight scenes, but the plot could be deeper.");
        film10.addFeedback("Zoe", 4, "Loved the action, but felt the ending was rushed.");
        
        film11.addFeedback("Sarah", 5, "The ultimate gladiator story.");
        film11.addFeedback("Ethan", 4, "A bit predictable, but still a great film.");
        film11.addFeedback("Nicole", 5, "Epic, powerful performances from everyone.");
        
        film12.addFeedback("Rebecca", 5, "Absolutely loved the characters and story.");
        film12.addFeedback("Jacob", 4, "A bit too long, but the payoff was worth it.");
        film12.addFeedback("Megan", 5, "The best superhero film, hands down!");
        
        film13.addFeedback("Eva", 5, "Perfect mix of humor and emotion.");
        film13.addFeedback("Ben", 4, "A great family film with beautiful songs.");
        film13.addFeedback("Sophia", 5, "A timeless classic, I watch it every year.");
        
        film14.addFeedback("John", 5, "So much fun and heartwarming.");
        film14.addFeedback("Liam", 4, "Great animation, but I prefer the first one.");
        film14.addFeedback("Chloe", 4, "The characters are lovable, but the plot was predictable.");
        
        film15.addFeedback("Nathan", 5, "A dark, brilliant film about mental illness.");
        film15.addFeedback("Isabella", 4, "Joaquin Phoenix's performance was outstanding.");
        film15.addFeedback("Luke", 3, "Not for everyone, but a thought-provoking film.");
        
        film16.addFeedback("Jenna", 5, "Incredible storytelling and powerful performances.");
        film16.addFeedback("Mark", 4, "A great social commentary, but it felt slow at times.");
        film16.addFeedback("Diana", 5, "I can't stop thinking about it, truly unique.");
        
        film17.addFeedback("Carlos", 5, "A fantastic conclusion to a perfect saga.");
        film17.addFeedback("Olivia", 4, "Epic battle scenes, but it was too long.");
        film17.addFeedback("Henry", 5, "The best Avengers film, hands down.");
        
        film18.addFeedback("Linda", 5, "A beautiful, heartfelt movie with amazing animation.");
        film18.addFeedback("Steve", 4, "Visually stunning, but a bit too sad.");
        film18.addFeedback("Mia", 5, "A classic that still holds up after all these years.");
        
        film19.addFeedback("Daniel", 5, "A magical, heartwarming adventure.");
        film19.addFeedback("Hannah", 4, "Great movie, but a bit long.");
        film19.addFeedback("Jack", 5, "A perfect introduction to the magical world of Harry Potter.");
        
        film20.addFeedback("Luke", 5, "A groundbreaking film that changed cinema forever.");
        film20.addFeedback("Olivia", 4, "A bit slow in the beginning, but the payoff was huge.");
        film20.addFeedback("James", 5, "A legendary film that defined an entire generation.");
        
        //update film
        film12.updateFilm(null, null, null, 1234000000l);
        //update actor
        actor12.updateActor("Matt Daemon");
        // Geri bildirimleri görüntüleme
        film1.displayFeedbacks();

        // Ortalama puanı görüntüleme
        System.out.println("Average Rating: " + film1.getAverageRating());

//

MaxHeap maxHeap = new MaxHeap(20);

 // Filmleri heap'e ekle
 maxHeap.insert(film1);
 maxHeap.insert(film2);
 maxHeap.insert(film3);
 maxHeap.insert(film4);
 maxHeap.insert(film5);
 maxHeap.insert(film6);
 maxHeap.insert(film7);
 maxHeap.insert(film8);
 maxHeap.insert(film9);
 maxHeap.insert(film10);
 maxHeap.insert(film11);
 maxHeap.insert(film12);
 maxHeap.insert(film13);
 maxHeap.insert(film14);
 maxHeap.insert(film15);
 maxHeap.insert(film16);
 maxHeap.insert(film17);
 maxHeap.insert(film18);
 maxHeap.insert(film19);
 maxHeap.insert(film20);

// Filmleri popülerlik sırasına göre çıkar ve yazdır

System.out.println("\nFilms sorted by popularity:");
while (!maxHeap.isEmpty()) {
    Film film = maxHeap.extractMax();
    System.out.println(film + ", Popularity Score: " + film.getPopularityScore());
}
System.out.println();
        film1.addScreening("10:00 AM");
        film1.addScreening("2:00 PM");
        film1.addScreening("6:00 PM");
        film2.addScreening("12:00 PM");
        film2.addScreening("15:00 PM");
        film1.simulateRevenue(150, 15l); // 150 izleyici, bilet fiyatı 15.0
        film1.simulateRevenue(200, 15l); // 200 izleyici, bilet fiyatı 15.0
        film1.simulateRevenue(180, 15l); // 200 izleyici, bilet fiyatı 15.0
        film2.simulateRevenue(180, 10l); // 180 izleyici, bilet fiyatı 10.0
        film2.simulateRevenue(200, 10l); // 200 izleyici, bilet fiyatı 10.0

        film1.viewRevenueHistory();
        System.out.println();
        film2.viewRevenueHistory();

        film1.showNextScreening(); // İlk gösterim
        film1.showNextScreening(); // İkinci gösterim
        film1.showNextScreening(); // Üçüncü gösterim
        film1.showNextScreening(); // Daha fazla gösterim yok

        System.out.println();
        film2.showNextScreening(); // İlk gösterim
        film2.showNextScreening(); // ikinci gösterim


        BinarySearchTree<Film> filmBST = new BinarySearchTree<>();
        BinarySearchTree<Actor> actorBST = new BinarySearchTree<>();

        filmBST.insert(film1.getName(), film1);
        filmBST.insert(film2.getName(), film2);
        filmBST.insert(film3.getName(), film3);
        filmBST.insert(film4.getName(), film4);
        filmBST.insert(film5.getName(), film5);
        filmBST.insert(film6.getName(), film6);
        filmBST.insert(film7.getName(), film7);
        filmBST.insert(film8.getName(), film8);
        filmBST.insert(film9.getName(), film9);
        filmBST.insert(film10.getName(), film10);
        filmBST.insert(film11.getName(), film11);
        filmBST.insert(film12.getName(), film12);
        filmBST.insert(film13.getName(), film13);
        filmBST.insert(film14.getName(), film14);
        filmBST.insert(film15.getName(), film15);
        filmBST.insert(film16.getName(), film16);
        filmBST.insert(film17.getName(), film17);
        filmBST.insert(film18.getName(), film18);
        filmBST.insert(film19.getName(), film19);
        filmBST.insert(film20.getName(), film20);

        actorBST.insert(actor1.getName(), actor1);
        actorBST.insert(actor2.getName(), actor2);
        actorBST.insert(actor3.getName(), actor3);
        actorBST.insert(actor4.getName(), actor4);
        actorBST.insert(actor5.getName(), actor5);
        actorBST.insert(actor6.getName(), actor6);
        actorBST.insert(actor7.getName(), actor7);
        actorBST.insert(actor8.getName(), actor8);
        actorBST.insert(actor9.getName(), actor9);
        actorBST.insert(actor10.getName(), actor10);
        actorBST.insert(actor11.getName(), actor11);
        actorBST.insert(actor12.getName(), actor12);
        actorBST.insert(actor13.getName(), actor13);
        actorBST.insert(actor14.getName(), actor14);
        actorBST.insert(actor15.getName(), actor15);
        actorBST.insert(actor16.getName(), actor16);
        actorBST.insert(actor17.getName(), actor17);
        actorBST.insert(actor18.getName(), actor18);
        actorBST.insert(actor19.getName(), actor19);
        actorBST.insert(actor20.getName(), actor20);

        Scanner input=new Scanner(System.in);

        System.out.println("\nFilm Arama:");
        System.out.println("aramak istediğiniz filmi yaziniz");
        String filmadi=input.nextLine();
        Film foundFilm = filmBST.search(filmadi);
        if (foundFilm != null) {
            System.out.println("Bulunan Film: " + foundFilm);
        } else {
            System.out.println(filmadi + " bulunamadi.");
        }

         // Aktörleri arama
         System.out.println("\nAktör Arama:");
         System.out.println("aramak istediğiniz aktorunadini yaziniz");
         String actoradi=input.nextLine();
         Actor foundActor = actorBST.search(actoradi);
         if (foundActor != null) {
             System.out.println("Bulunan Aktör: " + foundActor);
         } else {
             System.out.println(actoradi + " bulunamadi.");
         }

         // Filmleri sıralama
        System.out.println("\nFilmleri Siralama (Inorder Traversal):");
        filmBST.inorderTraversal();

        // Aktörleri sıralama
        System.out.println("\nAktörleri Siralama (Inorder Traversal):");
        actorBST.inorderTraversal();
System.out.println();
        Recommendation recommender = new Recommendation();

        // Filmleri ekle
        recommender.addFilm(film1);
        recommender.addFilm(film2);
        recommender.addFilm(film3);
        recommender.addFilm(film4);
        recommender.addFilm(film5);
        recommender.addFilm(film6);
        recommender.addFilm(film7);
        recommender.addFilm(film8);
        recommender.addFilm(film9);
        recommender.addFilm(film10);
        recommender.addFilm(film11);
        recommender.addFilm(film12);
        recommender.addFilm(film13);
        recommender.addFilm(film14);
        recommender.addFilm(film15);
        recommender.addFilm(film16);
        recommender.addFilm(film17);
        recommender.addFilm(film18);
        recommender.addFilm(film19);
        recommender.addFilm(film20);

        // Tür bazlı öneriler
        System.out.println("\nTürüne Göre Öneriler:");
        recommender.recommendByGenre("Sci-Fi");
        recommender.recommendByGenre("Romance");
        recommender.recommendByGenre("Action"); 
        recommender.recommendByGenre("Thriller"); 
        recommender.recommendByGenre("Crime"); 
        recommender.recommendByGenre("Animation"); 
        recommender.recommendByGenre("Drama"); 
        recommender.recommendByGenre("Fantasy"); 

        RevenueManager manager = new RevenueManager();

        // Son gelir hesaplamalarını yazdır
        manager.printLastNRevenues(film1, 3); // Inception için son 3 gelir
        manager.printLastNRevenues(film2, 2); // Titanic için son 2 gelir
        input.close();
    }
}