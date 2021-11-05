import java.util.Scanner;
public class main {

    public static void main(String[]args){
        Scanner input = new Scanner (System.in);

        while (true) {
            System.out.println("Input Name");
            String name = input.nextLine();
            if(name.toUpperCase().compareTo("GABE") == 0) {
                System.out.println("Hello Father");

            }
            else if (name.toUpperCase().compareTo("TREY") == 0) {
                System.out.println("Hello DND God");

            }
            else if (name.toUpperCase().compareTo("KERRY") == 0) {
                System.out.println("kindly fuck off");

            }
            else {
                System.out.println("Hello " + name);


            }

        }
    }






}
