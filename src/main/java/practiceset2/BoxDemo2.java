package practiceset2;

class Boxs{
    double width;
    double length;
    double height;

    void volume(){
        System.out.print("Volume is : ");
        System.out.println(width*height*length);
    }
}
public class BoxDemo2 {
    public static void main(String[] args){
        Boxs mybox1 = new Boxs();
        mybox1.width = 20;
        mybox1.length = 10;
        mybox1.height = 10;

        Boxs mybox2 = new Boxs();
        mybox2.length = 30;
        mybox2.width = 10;
        mybox2.height = 10;

        mybox1.volume();
        mybox2.volume();
    }
}
