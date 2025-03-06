public class MaxHeap {
    private Film[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new Film[capacity];
    }

    // Sol ve sağ çocuk indeksleri
    private int leftChild(int index) { return 2 * index + 1; }
    private int rightChild(int index) { return 2 * index + 2; }
    private int parent(int index) { return (index - 1) / 2; }

    // İki elemanı yer değiştir
    private void swap(int i, int j) {
        Film temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Yeni bir film ekle
    public void insert(Film film) {
        if (size == capacity) {
            System.out.println("Heap is full!");
            return;
        }
        heap[size] = film;
        int current = size;
        size++;

        // Yukarı doğru heapify
        while (current > 0 && heap[current].getPopularityScore() > heap[parent(current)].getPopularityScore()) {
            swap(current, parent(current));
            current = parent(current);
        }
    }

    // Maksimum elemanı çıkar ve döndür
    public Film extractMax() {
        if (size == 0) {
            System.out.println("Heap is empty!");
            return null;
        }
        Film max = heap[0];
        heap[0] = heap[size - 1];
        size--;

        // Aşağı doğru heapify
        heapify(0);
        return max;
    }

    // Heapify işlemi (aşağı doğru)
    private void heapify(int index) {
        int largest = index;
        int left = leftChild(index);
        int right = rightChild(index);

        if (left < size && heap[left].getPopularityScore() > heap[largest].getPopularityScore()) {
            largest = left;
        }
        if (right < size && heap[right].getPopularityScore() > heap[largest].getPopularityScore()) {
            largest = right;
        }
        if (largest != index) {
            swap(index, largest);
            heapify(largest);
        }
    }

    // Heap boş mu?
    public boolean isEmpty() {
        return size == 0;
    }
}
