package practiceset2;

class Box{
    double width;
    double height;
    double lenght;
}
public class BoxDemo {
    public static void main(String[] args){
        Box mybox = new Box();
        mybox.width = 20;
        mybox.lenght = 10;
        mybox.height = 10;
        double vol;
        vol = mybox.height* mybox.lenght* mybox.width;
        System.out.println("volume is "+vol);
    }
}
