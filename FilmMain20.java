public class FilmMain20 {
    public static void main(String[] args) {
        BinarySearchTreeFilm20 bst = new BinarySearchTreeFilm20();

        //menambahkan data film ke BST
        bst.add(new Film20("FL105", "DInterstellar", "Sci-Fi", 8.6));
        bst.add(new Film20("FL102", "Coco", "Animation", 8.4));
        bst.add(new Film20("FL108", "Inception", "Sci-Fi", 8.8));
        bst.add(new Film20("FL101", "Up", "Animation", 8.3));
        bst.add(new Film20("FL104", "Parasite", "Thriller", 8.5));
        bst.add(new Film20("FL107", "Spirited Away", "Fantasy", 8.6));

        //menampilkan data film secara in order
        System.out.println("Data film in-order:");
        bst.traverseInOrder(bst.root);
        //menampilkan data film secara pre order
        System.out.println("Data film pre-order:");
        bst.traversePreOrder(bst.root);
        //pencarian berdasarkan kode film
        System.out.println("Pencarian FL104 : " + (bst.find("FL104") ? "Ditemukan" : "Tidak Ditemukan"));
        System.out.println("Pencarian FL110 : " + (bst.find("FL110") ? "Ditemukan" : "Tidak Ditemukan"));
        //menampilkan jumlah semua film dalam tree
        System.out.println("Jumlah Film : " + bst.hitungJumlahFilm(bst.root));
        System.out.println("Film dengan rating tertinggi:");
        Film20 terbaik = bst.cariRatingTertinggi(bst.root);
        terbaik.tampilInformasi();
    }
}