
package basic.anisulvideo;
import java.util.Scanner;
public class Assignment9 {
    public static void main (String[] args)
    {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("Enter an option: ");
        n=input.nextInt();
        switch(n)
        {
            case 1:
                 System.out.println("Bengali");
                break;
            case 2:
                System.out.println("Hindi");
                break;
            case 3:
                System.out.println("Urdu");
                break;
            case 4:
                System.out.println("English");
                break;
            default:
                System.out.println("Sorry! Invalid option. Try again.");   
        }
    }
}
