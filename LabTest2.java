import java.util.Scanner;

public class LabTest2 {
    public static void main(String[] args) {
       double centimeter;
       Scanner sc = new Scanner(System.in);
       try{
           System.out.print("Please enter feet: ");
           String ifeet = sc.nextLine();
           double feet = Double.parseDouble(ifeet);
           if(feet>=0.00){}
           else
           {
            throw new NumberFormatException();
           }
           System.out.print("Please enter inch: ");
           String iinch = sc.nextLine();
           double inches = Double.parseDouble(iinch);
           if(inches>=0.00){}
           else
           {
            throw new NumberFormatException();
           }

           if(feet >= 0 && inches >=0){
               centimeter = feet * 30.48 + inches * 2.54;
               System.out.println("The total centimeter is " + centimeter);
           }else{
               throw new IllegalArgumentException();
           }
       }
       catch(NumberFormatException ex){
           System.out.println("The input must be digit.");
           System.out.println("Please re-enter input.");
       }
       catch(IllegalArgumentException e){
           System.out.println("The input must be positive number.");
           System.out.println("Please re-enter input.");
       }
    }
}
