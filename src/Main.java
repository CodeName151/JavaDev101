import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
        try{
            String name = sc.nextLine();
            if(name.equals("Shayan")){
                System.out.println("Valid Statement");
            }
            else{
                throw new E("Invalid Statement");
            }




        }
        catch (E m) {
            System.out.println("This is in catch block");
        }

        finally{
            System.out.println("This shit runs anyways....");
        }


    }
}