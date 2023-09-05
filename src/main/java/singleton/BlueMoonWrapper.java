package singleton;

public class BlueMoonWrapper {
    private static final BlueMoonWrapper instance = new BlueMoonWrapper() ;
    private static final BlueMoon blueMoon= new BlueMoon();

    private BlueMoonWrapper() {
    }
    public static BlueMoonWrapper getInstance(){
       // return (instance == null)?new BlueMoonWrapper():instance;
        return instance;
    }
    public BlueMoon getBlueMoon(){
        return blueMoon;
    }

}
