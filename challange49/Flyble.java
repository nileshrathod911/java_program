package challange49;

public interface Flyble {
    public void fly();
}
abstract class Bird implements Flyble{
}
class Eagle extends Bird{
    @Override
    public void fly() {
        System.out.println("Flying...");
    }
    public static void main(String[] args) {
        Eagle eagle=new Eagle();
        eagle.fly();
    }
}

