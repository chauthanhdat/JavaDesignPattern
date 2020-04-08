package Main;

public class Main {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cloneShape = (Shape)ShapeCache.getShape("3");
        System.out.println("Shape : " + cloneShape.getType());
    }
}
