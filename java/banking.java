import java.util.Scanner ;
import java.lang.String ;
class Bank
{
    private long acntno=10000;
    private long phn;
    private String name,password;
    private double amt;
    protected Bank(String n, String p,double a,long phn)
    {
        acntno++;
        this.password=p;
        this.name=n;
        this.amt=a;
        this.phn=phn;
    }
    protected void dedit()
    {

        if(checkPass())
        {
            Scanner sc= new Scanner(System.in);
            double amnt;
            System.out.println("enter amount you want to debit");
            amnt=sc.nextDouble();
            if(amnt<=amt)
            {
                this.amt-=amnt;
                System.out.println("Account has been debited by amount : "+amnt+"\n new Account Ballance : "+amt);
            }
            else
                System.out.println("Insufficient amount : "+amnt);
        }
        else
            System.out.println("Wrong password ");

    }
    protected void credit()
    {
        Scanner sc= new Scanner(System.in);
        double amnt;
        System.out.println("enter amount you want to credit");
        amnt=sc.nextDouble();
        this.amt+=amnt;
        System.out.println("Account has been credited by amount : "+amnt);
            
    }
    private boolean checkPass()
    {
        Scanner sc= new Scanner(System.in);
        String pass;
        System.out.println("enter your password");
        pass=sc.next();
        if(pass.equals(password))
        {
            return true;
        }
        return false;
    }
    protected void changePass()
    {
        if(checkPass())
        {
            Scanner sc= new Scanner(System.in);
        String pass;
        System.out.println("enter your new password");
        pass=sc.next();
            password=pass;
        System.out.println("password has been updated");
        }
        else
        {
            System.out.println("Wrong password");
        }
    }
    protected void showAmt()
    {
        if(checkPass())
        {
        System.out.println("Amount :"+amt);
         }
        else
        {
            System.out.println("Wrong password");
        }
    } 
    protected void details()
    {
        if(checkPass())
        {
        System.out.println("Acount no. :"+acntno);
        System.out.println("Name of the Account holder : "+name);
        System.out.println("Phone no. of the Account holder : "+phn);
        System.out.println("Amount :"+amt);
        }
        else
        {
            System.out.println(" Wrong password ");
        }
    } 
};
class sbi extends Bank
{
    private String passCheck="";
    public sbi(String name,String p,double a,long phn)
    {
        super(name,p,a,phn);
    }
    void showAmount()
    {
            super.showAmt();
        
    } 
    void showDetails( )
    {
        System.out.println(" ******Welcome to SBI***** ");
        super.details();
        
    }
    void changePassword()
    {
        changePass();
    }
    void amtCredit()
    {
        credit();
    }
    void amtDebit()
    {
        dedit();
    }

}


public class banking
{
public static void main(String args[])
{
    int c2;
    String name;
    //String pass;
    long phone;
    double amt;
    sbi ac;
    char c1;
    Scanner ob=new Scanner (System.in);
    do{
        System.out.println(" Hey,if you want to create an Account enter '1' and if you already have an Account press '2'");
        System.out.println("or enter 'q' to quit this menu");
        c1=ob.next().charAt(0);
        switch(c1){
        case '1':
            System.out.println("Welcome to SBI ,lets create your new account ");
            System.out.println("enter you name ,phone no. ");
            name=ob.nextLine();
            phone=ob.nextLong();
            System.out.println("enter you password  ");
            String pass=ob.next();
            
            System.out.println("enter ,amount(greater than or equals to zero'0') to start you Acount with ");
            amt=ob.nextDouble();
            ac=new sbi(name,pass,amt,phone);
            System.out.println("Congrat's new account has been created ");
        break;
        case '2':
        do
        {
            //System.out.print("\033[H\033[2J");  
            //System.out.flush();
            System.out.println(" *********Welcome to SBI********* ");
            System.out.println(" ********* Account menu ********* ");
            System.out.println(" **** enter 1 to show amount **** ");
            System.out.println(" ****enter 2 to show details***** ");
            System.out.println(" ***enter 3 to change password*** ");
            //System.out.println(" *enter 4 to go to previous menu* ");
            System.out.println(" ****enter 4 to credit amount**** ");
            System.out.println(" ****enter 5 to dedit amount **** ");
            System.out.println(" *******  enter 6 to exit ******* ");
            c2=ob.nextInt();
            switch(c2)
            {
                case 1:
                    ac.showAmount();
                break;
                case 2:
                    ac.showDetails();
                break;
                case 3:
                    ac.changePassword();
                break;
                case 4:
                    ac.amtCredit();
                break;
                case 5:
                    ac.amtDebit();
                break;
                case 6:
                break;

                default:
                    System.out.println("Wrong Choice");
            }
        }while(c2!=6);
        break;          
    	case 'q' :
    	break;
    }
    
}while(c1!='q');   	    
		
	
}
}