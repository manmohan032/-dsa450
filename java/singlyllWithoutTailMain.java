import DSA.LinkedList.*;

public class singlyllWithoutTailMain
{
    public static void main(String args[])
    {
        singlyllwithoutTail ob =new singlyllwithoutTail();
        ob.insertFirst(2);
        ob.insertLast(4);
        ob.insertLast(4);
        ob.insertLast(4);
        ob.insertFirst(1);
        ob.insertFirst(1);
        ob.insertFirst(1);
        ob.insertFirst(1);
        ob.insertFirst(1);
        ob.insertFirst(1);
        //ob.insertRec(3,2);
        ob.display();
        ob.removeDuplicate();
        ob.display();
        singlyllwithoutTail ob1 =new singlyllwithoutTail();
        ob1.insertFirst(2);
        ob1.insertLast(3);
        ob1.insertLast(4);
        ob1.insertLast(5);
        ob1.insertLast(6);
        ob1.insertLast(7);
        ob1.display();
        
        singlyllwithoutTail ob3 =singlyllwithoutTail.mergell(ob,ob1);
        ob3.display();
    }
}