public class BinarySearchTreeFilm20 {
    //root adalah node pertama BST
    NodeFilm20 root;

    public BinarySearchTreeFilm20() {
        root = null;
    }

    //mengecek apakah tree kosong
    boolean isEmpty() {
        return root == null;
    }

    //menambahkan data film ke BST sesuai kode film
    void add(Film20 data) {
        NodeFilm20 newNode = new NodeFilm20(data);
        if (isEmpty()) {
            root = newNode;
        } else {
            NodeFilm20 current = root;
            while (true) {
                //jika kode lebih kecil, masuk ke bagian kiri
                if (data.kodeFilm.compareTo(current.data.kodeFilm) < 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    //jika kode lebih besar, masuk ke bagian kanan
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }
            }
        }
    }

    //mencari data film sesuai kode film
    boolean find(String kodeFilm) {
        NodeFilm20 current = root;
        while (current != null) {
            int hasil = kodeFilm.compareTo(current.data.kodeFilm);

            if (hasil == 0) {
                return true;
            } else if (hasil < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traverseInOrder(NodeFilm20 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    void traversePreOrder(NodeFilm20 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    //menghitung jumlah semua node dalam tree
    int hitungJumlahFilm(NodeFilm20 node) {
        if (node == null) {
            return 0;
        }
        return 1 + hitungJumlahFilm(node.left)
                 + hitungJumlahFilm(node.right);
    }

    //mencari film dengan rating tertinggi pada BST
    Film20 cariRatingTertinggi(NodeFilm20 node) {
        if (node == null) {
            return null;
        }
        Film20 tertinggi = node.data;
        Film20 kiri = cariRatingTertinggi(node.left);
        Film20 kanan = cariRatingTertinggi(node.right);
        if (kiri != null && kiri.rating > tertinggi.rating) {
            tertinggi = kiri;
        }
        if (kanan != null && kanan.rating > tertinggi.rating) {
            tertinggi = kanan;
        }
        return tertinggi;
    }
}