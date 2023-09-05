package factory;

public class ShapesFactory {
    private static ShapesFactory shapesFactory;
    private ShapesFactory() { }
    public static ShapesFactory getInstance(){
        return (shapesFactory == null)?new ShapesFactory():shapesFactory;
    }
    public Shapes getShape(String shapeType){
        if (shapeType == null){
            return null;
        } else if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
