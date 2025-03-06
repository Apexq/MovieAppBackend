public class BSTNode<T> {
    String key; // Bu, arama için kullanılan anahtar (film veya oyuncu adı)
    T data; // Film veya Aktör nesnesi tutulacak
    BSTNode<T> left, right;

    public BSTNode(String key, T data) {
        this.key = key.toLowerCase(); // Aramaları küçük harfle kolaylaştırmak için
        this.data = data;
        this.left = null;
        this.right = null;
    }
}