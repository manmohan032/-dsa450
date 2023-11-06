import java.util.Scanner;
 /**  *  * @author Ajeet Kumar  */
 class Account {
     public static  int min=500;
     String name;    int Account_num;    
     public float o_Price;    
     Scanner sc=new Scanner(System.in);    
     public void get_info()    
     {        
         System.out.println("Enter Name:");        
         name=sc.nextLine();        
         System.out.println("Enter Account Number:");
         Account_num=sc.nextInt();
         System.out.println("Enter opening Ammount must>500:");
         o_Price=sc.nextFloat();        if(o_Price <500)        {            System.out.println("Enter opening Ammount must>500:");        }    }    public void show()    {        System.out.println("Name:"+name);        System.out.println("Account_number:"+Account_num);        System.out.println("Ammount:"+o_Price);    } } class  Current  extends Account {   float deposit,withdraw,penality;   public void deposit()   {      System.out.println("Eneter Ammount to deposit") ;      deposit =sc.nextFloat();      show();      o_Price=o_Price+deposit;      System.out.println("Total Ammount is :"+o_Price) ;         }   public void check_Bal()   {       if(o_Price500");           o_Price=o_Price-150;           System.out.println("You have debited ammount 150 from your acccount Account balance is:"+o_Price);       }          }   public void withdraw_Bal()   {       System.out.println("Enter Ammount to withdraw");       withdraw=sc.nextFloat();       show();       /*if(o_Price<500)       {           System.out.println("For withdrawl Balance must >500 Rupee");       }*/       if(withdraw