package singleton;

public class Moon {
    private static final BlueMoon blueMoon = new BlueMoon();
    private static Moon moon;
    private Moon(){}

    public static Moon getInstance(){
        return (moon == null)?new Moon():moon;
    }
    public BlueMoon getInstanceOfBlueMoon(){
        return blueMoon;
    }
}
