public class Film {
        public String name;
        public int filmId;
        private List<String> actorList;
        private List<Feedback> feedbackList;
        public String genre;
        public int releaseYear;
        public Long totalRevenue;
        private MyQueue<String> showQueue; // Queue for managing film screenings
        private MyStack<Long> revenueHistory; // Stack for storing historical revenue data
    
        public Film(String name, int filmId, String genre, int releaseYear, Long totalRevenue) {
            this.name = name;
            this.filmId = filmId;
            this.actorList = new List<>();
            this.genre = genre;
            this.releaseYear = releaseYear;
            this.totalRevenue = totalRevenue;
            this.feedbackList = new List<>();

            this.showQueue = new MyQueue<>();
            this.revenueHistory = new MyStack<>();
            this.revenueHistory.push(totalRevenue); // Başlangıç geliri kaydedilir
        
        }
  // Method to add a film screening to the queue
  public void addScreening(String screeningTime) {
    showQueue.enqueue(screeningTime);
}
 // Method to simulate revenue from a screening
 public void simulateRevenue(int viewerCount, Long ticketPrice) {
    Long revenue = viewerCount * ticketPrice;
    this.totalRevenue += revenue;

    revenueHistory.push(revenue);

    System.out.println("Revenue for this screening: " + revenue);
    System.out.println("Total Revenue for " + this.name + ": " + this.totalRevenue);
}
public MyStack<Long> getRevenueHistory() {
    return revenueHistory;
}

// Method to show the next screening in the queue
public void showNextScreening() {
    if (!showQueue.isEmpty()) {
        String nextScreening = showQueue.dequeue();
        System.out.println("Next screening for " + this.name + ": " + nextScreening);
    } else {
        System.out.println("No more screenings scheduled for " + this.name);
    }
}

// Method to view historical revenue data (stack)
public void viewRevenueHistory() {
    System.out.println("Revenue history for " + this.name + ":");
    MyStack<Long> tempStack = new MyStack<>();
    while (!revenueHistory.isEmpty()) {
        Long revenue = revenueHistory.pop();
        System.out.println("TL" + revenue);
        tempStack.push(revenue);
    }
    while (!tempStack.isEmpty()) {
        revenueHistory.push(tempStack.pop());
    }
}

        public String getName() {
    return name;
}
public double getTotalRevenue() {
    return totalRevenue;
}
        //populerlik skoru
        public double getPopularityScore(){
            return formatToOneDecimal(this.totalRevenue/100000 + getAverageRating()*10);
        }

        // Kullanıcı geri bildirimi ekleme
        public void addFeedback(String userName, int rating, String review) {
            if (rating < 1 || rating > 5) {
                System.out.println("Rating must be between 1 and 5.");
                return;
        }
            Feedback feedback = new Feedback(userName, rating, review);
            feedbackList.add(feedback);
    }

    public String toString() {
         return "Film: " + name + ", Average Rating: " + getAverageRating();
    }
    public double getAverageRating() {
        if (feedbackList.isEmpty()) return 0.0;

        int totalRating = 0;
        int count = 0;
        Node<Feedback> current = feedbackList.getHead();

        while (current != null) {
            totalRating += current.data.getRating();
            count++;
            current = current.next;
        }

        return formatToOneDecimal((double) totalRating / count);
    }

    // Geri bildirimleri görüntüleme
    public void displayFeedbacks() {
        if (feedbackList.isEmpty()) {
            System.out.println("No feedback available for this film.");
            return;
        }

        System.out.println("Feedbacks for " + name + ":");
        Node<Feedback> current = feedbackList.getHead();

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

        // Aktör ekleme
        public void addActor(String actorName) {
            actorList.add(actorName);
        }
    
        // Aktör silme
        public boolean deleteActor(String actorName) {
            return actorList.delete(actorName);
        }
    
        // Film güncelleme
        public void updateFilm(String name, String genre, Integer releaseYear, Long totalRevenue) {
            if (name != null) this.name = name;
            if (genre != null) this.genre = genre;
            if (releaseYear != null) this.releaseYear = releaseYear;
            if (totalRevenue != null) this.totalRevenue = totalRevenue;
        }
    
        // Aktör listesini yazdırma
        public void displayActors() {
            System.out.print("Actors in the film: ");
            actorList.display();
        }
        public String getGenre() {
            return genre;
        }
        //virgülden sonra sadece 1 rakam gösterir
        public static double formatToOneDecimal(double number) {
            return Math.round(number * 10) / 10.0;
        }        
    }
