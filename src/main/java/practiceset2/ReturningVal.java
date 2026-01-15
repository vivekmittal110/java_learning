package practiceset2;

class Boxr{
    double height;
    double length;
    double width;

    double volume(){
        return height*length*width;
    }
}
public class ReturningVal {
    public static void main(String[] args){
        Boxr mybox1 = new Boxr();
        mybox1.length = 10;
        mybox1.width = 15;
        mybox1.height = 2;
        double vol = mybox1.volume();
        System.out.println(vol);
    }
}
