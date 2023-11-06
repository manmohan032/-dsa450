import DSA.LinkedList.* ; 


public class CircularMain
{
    public static void main(String[] args) {
        circularll ob= new circularll();
        ob.insert(2);
        ob.insert(3);
        ob.insert(4);
        
        ob.insert(6);
        ob.insert(5);
        ob.insert(1);
       
        ob.display();
        System.out.println("The size is : "+ob.getSize());
        ob.remove(6);
        ob.remove(2);
        ob.remove(1);
        System.out.println("The size is : "+ob.getSize());
        ob.display();
    }
}