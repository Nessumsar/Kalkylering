package se.lexicon.LukasRasmussen;
import java.util.Scanner;


public class App 
{
   private static Scanner myScan = new Scanner(System.in);
    public static void main( String[] args )
    {

        boolean sluta = true;
        while (sluta) {

            System.out.println("Skriv ett tal. Skriv Q för att avsluta.");
            String firstnum = myScan.nextLine();
            if (firstnum.equalsIgnoreCase("Q")){
                System.out.println("Avslutar miniräknaren.");
                break;
            }

            System.out.println("Skriv ett tal till. Skriv Q för att avsluta.");
            String secondnum = myScan.nextLine();
            if (secondnum.equalsIgnoreCase("Q")){
                System.out.println("Avslutar miniräknaren.");
                break;
            }

            System.out.println("Välj ett räknesätt. Skriv Q för att avsluta.");
            String operations = myScan.nextLine();
            if (operations.equalsIgnoreCase("Q")){
                System.out.println("Avslutar miniräknaren.");
                break;
            }
            switch(operations) {
                case "+":
                    System.out.println("Resultatet är "+resplus(stringToDouble(firstnum), stringToDouble(secondnum)));
                    System.out.println(" ");
                    break;
                case "-":
                    System.out.println("Resultatet är "+resmin(stringToDouble(firstnum), stringToDouble(secondnum)));
                    System.out.println(" ");
                    break;
                case "*":
                    System.out.println("Resultatet är "+resggr(stringToDouble(firstnum), stringToDouble(secondnum)));
                    System.out.println(" ");
                    break;
                case "/":
                    System.out.println("Resultatet är "+resdiv(stringToDouble(firstnum), stringToDouble(secondnum)));
                    System.out.println(" ");
                    break;
                default:
                    System.out.println(operations + " är inte ett giltigt räknesätt.");
                    System.out.println(" ");
            }
        }
    }

    public static double stringToDouble(String num){
        Double convert = Double.parseDouble(num);
        return convert;
    }
    public static double resplus(double num1, double num2){
        return num1+num2;
    }
    public static double resmin(double num1, double num2){
        return num1-num2;
    }
    public static double resggr(double num1, double num2){
        return num1*num2;
    }
    public static double resdiv(double num1, double num2){
        return num1/num2;
    }

    }
