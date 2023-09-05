package singleton;

public class Demo {
    public static void main(String[] args) {
       BlueMoon blueMoon1 = Moon.getInstance().getInstanceOfBlueMoon();
       BlueMoon blueMoon2 = Moon.getInstance().getInstanceOfBlueMoon();
       System.out.println(blueMoon1.equals(blueMoon2));

       BlueMoonWrapper.getInstance().getBlueMoon();
       BlueMoonWrapper.getInstance().getBlueMoon();
       BlueMoonWrapper.getInstance().getBlueMoon();
    }
}
