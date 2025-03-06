public class BinarySearchTree<T> {
    private BSTNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Düğüm ekleme
    public void insert(String key, T data) {
        root = insertRec(root, key.toLowerCase(), data);
    }

    private BSTNode<T> insertRec(BSTNode<T> root, String key, T data) {
        if (root == null) {
            root = new BSTNode<>(key, data);
            return root;
        }
        if (key.compareTo(root.key) < 0) {
            root.left = insertRec(root.left, key, data);
        } else if (key.compareTo(root.key) > 0) {
            root.right = insertRec(root.right, key, data);
        }
        return root;
    }

    // Arama
    public T search(String key) {
        return searchRec(root, key.toLowerCase());
    }

    private T searchRec(BSTNode<T> root, String key) {
        if (root == null) {
            return null; // Bulunamadı
        }
        if (key.equals(root.key)) {
            return root.data; // Bulundu
        }
        if (key.compareTo(root.key) < 0) {
            return searchRec(root.left, key);
        }
        return searchRec(root.right, key);
    }

    // Düğüm sıralı gezintisi
    public void inorderTraversal() {
        inorderRec(root);
    }

    private void inorderRec(BSTNode<T> root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.println(root.key);
            inorderRec(root.right);
        }
    }
}
