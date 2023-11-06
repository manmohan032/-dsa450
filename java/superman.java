class superman
{  
        public void display()
        {
        System.out.println("My hero is superman") ;
       }  
};
class batman extends superman
{  
        public void display()
        {
        System.out.println("My hero is Batman") ;
       }  
};

class main
{  
 public static void main(String args[])
     {  
       batman obj = new batman();  
       obj.display();  
    }  }
