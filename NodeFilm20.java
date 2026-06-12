public class NodeFilm20 {
    //menyimpan data film pada node
    Film20 data;
    //pointer ke child kiri dan kanan
    NodeFilm20 left;
    NodeFilm20 right;

    public NodeFilm20(Film20 data) {
        this.data = data;
        left = null;
        right = null;
    }
}
