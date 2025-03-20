package bus;
import java.util.Scanner;
import javax.swing.JFrame;
import java.awt.Color;
public class Bus {
    
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Customer customer = new Customer("heng",  10, 'M', "12345", "heng", "pp","12345");
        
            System.out.println("1. sign up");
            System.out.println("2.Log in");
            System.out.println("3.exit");
            System.out.print("enter your choice:");
            int choice;
            try{
                choice = input.nextInt();
                input.nextLine();
            }
            catch(Exception e)
            {
                System.out.println("invalid input");
                input.nextLine();
                return;
            }
            
            switch(choice)
            {
                case 1: 
                customer.signUp();
                
                System.out.println("1. Booking");
                System.out.println("Cancel Booking");
                System.out.println("View Booking History");
                int option = input.nextInt();
                switch (option) {
                    case 1:
                                            
                        break;
                
                    default:
                        break;
                }
                
            
                break;
                case 2:
                System.out.println("Enter username: ");
                    String username = input.nextLine();
                    System.out.println("Enter password: ");
                    String password = input.nextLine();

                    // Call the login method
                    customer.login(username, password);
                break;
                case 3:
                System.out.println("exiting now");
                input.close();
                return;
                
            }
            
        


        
        
        
        
    }
}