public class Feedback {
    public String userName;
    public int rating; // 1-5 arasında puan
    public String review;

    public Feedback(String userName, int rating, String review) {
        this.userName = userName;
        this.rating = rating;
        this.review = review;
    }

    public int getRating() {
        return rating;
    }

    public String getReview(){
        return review;
    }

    public String toString() {
        return "User: " + userName + ", Rating: " + rating + ", Review: " + review;
    }
} 
    
