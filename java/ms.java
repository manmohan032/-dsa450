import java.util.*;
class ms
{
    void operate(Collection<?> ob)
    {
        ob.add("first");
        ob.add("second");
    }
}
class ds
{
    public static void main (String[] args) {
      List <String> ob1= new ArrayList<String>();
      ms ob= new ms();
      ob.operate(ob1);
    }
}