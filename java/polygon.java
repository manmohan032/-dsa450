import java.util.*;
interface polygon{
    void getarea(int length,int breadth);
}

class rectangle implements polygon{
    public void getarea(int length,int breadth){
        System.out.println("the area of the rectangle"+(length*breadth));
    }
}

class shape{
    public static void main(String[] args){
        rectangle r1=new rectangle();
        r1.getarea(14,20);
    }
}
