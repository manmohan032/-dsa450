import DSA.LinkedList.*; 


public class DoublyMain
{
    public static void main(String[] args) {
        doublyll ob= new doublyll();
        ob.insertFirst(2);
        ob.insertLast(3);
        ob.insertLast(4);
        
        ob.insertAtIndex(6,3);
        ob.insertAtIndex(5,3);
        ob.insertFirst(1);
       
        ob.display();
        System.out.println("The size is : "+ob.getSize());
        System.out.println("removed from index 2 : "+ob.removeAtIndex(2));
        System.out.println("removed from first position : "+ob.removeFirst());
        System.out.println("removed from last position : "+ob.removeLast());
        System.out.println("The size is : "+ob.getSize());
        ob.display();
    }
}