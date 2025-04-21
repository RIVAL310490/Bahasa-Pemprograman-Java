import java.awt.*;

public class aksesShapeSuperKeyword {
    public static void main(String[] args) {

        var shape = new shapeSuperKeyword(); // ingat setelah kata new harus sesuai dengan nama class yang mau dipanggil
        System.out.println(shape.getCorner());

        var rectangle = new Rectangle();
        System.out.println(rectangle.getCorner());
        System.out.println(rectangle.getParentCorner());
    }
}
