public class RevenueManager {
    public void printLastNRevenues(Film film, int n) {
        MyStack<Long> revenueHistory = film.getRevenueHistory();
        MyStack<Long> tempStack = new MyStack<>();

        System.out.println("\nFilm: " + film.getName() + " için son " + n + " gelir hesaplaması:");

        int count = 0;
        while (!revenueHistory.isEmpty() && count < n) {
            Long revenue = revenueHistory.pop();
            System.out.println("- " + revenue);
            tempStack.push(revenue); // Yığını korumak için geçici stack'e aktar
            count++;
        }

        // Gelir geçmişini geri yükle
        while (!tempStack.isEmpty()) {
            revenueHistory.push(tempStack.pop());
        }
    }
}
