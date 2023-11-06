 class Adder
 {  
        static int add(int a,int b)
       {
               return (a+b)/2;
       }  
      static int add(int a,int b,int c)
       {
            return (a+b+c)/3;
       }  
}  
class TestOverloading1
{  
    public static void main(String[] args)
    {  
           System.out.println("the average is:- "+Adder.add(10,10));  
           System.out.println("\nthe average is:- "+Adder.add(10,10,10));  
    }
}  
