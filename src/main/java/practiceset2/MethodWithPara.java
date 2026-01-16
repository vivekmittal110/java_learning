package practiceset2;

class Nbox{
    double height;
    double width;
    double length;

    void SetDim(double w, double l, double h){
        height = h;
        width = w;
        length = l;
    }

    double Volume(){
        return height*width*length;
    }
}

public class MethodWithPara {
    public static void main(String[] args){
        Nbox mybox1 = new Nbox();
        Nbox mybox2 = new Nbox();
        double vol;
        mybox1.SetDim(10,20,30);
        mybox2.SetDim(40,20,10);
        vol = mybox1.Volume();
        System.out.println(vol);
        vol = mybox2.Volume();
        System.out.println(vol);
    }
}
