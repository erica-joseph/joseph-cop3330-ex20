import java.util.Scanner;
import java.text.DecimalFormat;
/**
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Erica Joseph
 */
public class App {
    public static void main(String[] args) {
        //initiate scannner
        Scanner sc = new Scanner(System.in);
        DecimalFormat df2 = new DecimalFormat("#.##");
//input
        System.out.println("What is the order amount? ");
        double amount = sc.nextInt();
        System.out.println("What state do you live in? ");
        String state = sc.next().toLowerCase();

        if(state.equals("wisconsin")){
            System.out.println("What county do you live in? ");
            double wiscTax = amount * .05;
            String county = sc.next().toLowerCase();

            if(county.equals("dunn")){
                double dunnTax = amount * .005;
                double dunnTotalTax = dunnTax + wiscTax;
                double dunnTotal = amount + wiscTax +dunnTotalTax;
                System.out.println("The tax is "+dunnTotalTax+"\n"+"The total is "+ dunnTotal);
            }
            else if(county.equals("eau claire")){
                double eauTax = amount * .004;
                double eauTotalTax = eauTax + wiscTax;
                double eauTotal = amount + wiscTax +eauTotalTax;
                System.out.println("The tax is "+eauTotalTax+"\n"+"The total is "+ eauTotal);
            }
            else {
                double wiscTotal = amount + wiscTax;
                System.out.println("The tax is "+wiscTax+"\n"+"The total is "+ wiscTotal);
            }
        }
        else if (state.equals("illinois")){
            double illTax = amount * .08;
            double illTotal = amount + illTax;
            System.out.println("The tax is "+illTax+"\n"+"The total is "+ illTotal);
        }
        else{
            System.out.println("The total is "+ amount);
        }
    }
}
