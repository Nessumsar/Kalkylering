package se.lexicon.LukasRasmussen;

import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        boolean nej = true;
        Scanner myScan = new Scanner(System.in);
        //while?
        while(nej){
            String avslut = "Q";
            Double res;

            System.out.println("Skriv ett tal. Skriv Q för att avsluta.");
            String firstnum = myScan.nextLine();
            if (firstnum.equalsIgnoreCase("Q")){
                System.exit(0);
            }

            System.out.println("Skriv ett tal till. Skriv Q för att avsluta.");
            String secondnum = myScan.nextLine();
            if (secondnum.equalsIgnoreCase("Q")){
                System.exit(0);
            }

            System.out.println("Välj ett räknesätt. Skriv Q för att avsluta.");
            String operations = myScan.nextLine();
            if (operations.equalsIgnoreCase("Q")){
                System.exit(0);
            }

            //if inkommande line int -> fortsätt, else string -> avslut?
           // if (firstnum.equalsIgnoreCase(avslut) || secondnum.equalsIgnoreCase(avslut) || operations.equals(avslut)) {
             //   System.exit(0);
           // }
            switch(firstnum){
                case "Q":
                case "q":
                    System.out.println("Avslutar miniräknaren.");
                    nej = false;
                    break;
                default:

            }

            //while loop? ej loop i loop dock
            switch(operations) {
                case "+":
                    Double convert1 = Double.parseDouble(firstnum);
                    Double convert2 = Double.parseDouble(secondnum);
                    res = convert1 + convert2;
                    System.out.println(convert1+" plus "+convert2+" är "+res);
                    break;
                case "-":
                    convert1 = Double.parseDouble(firstnum);
                    convert2 = Double.parseDouble(secondnum);
                    res = convert1 - convert2;
                    System.out.println(convert1+" minus "+convert2+" är "+res);
                    break;
                case "*":
                    convert1 = Double.parseDouble(firstnum);
                    convert2 = Double.parseDouble(secondnum);
                    res = convert1 * convert2;
                    System.out.println(convert1+" gånger "+convert2+" är "+res);
                    break;
                case "/":
                    convert1 = Double.parseDouble(firstnum);
                    convert2 = Double.parseDouble(secondnum);
                    res = convert1 / convert2;
                    System.out.println(convert1+" delat med  "+convert2+" är "+res);
                    break;
                case "Q":
                        System.out.println("");
                default:
                    System.out.println(operations + " är inte ett giltigt räknesätt.");
                    System.out.println(" ");
            }
        }


    }
}