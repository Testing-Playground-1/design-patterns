package factory;

public class Demo {
    public static void main(String[] args) {
        ShapesFactory.getInstance().getShape("rectangle").draw();
    }
}
