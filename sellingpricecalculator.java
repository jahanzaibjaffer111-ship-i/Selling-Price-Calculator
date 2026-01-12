import java.util.Scanner;
public class sellingpricecalculator
{
    public static void main(String[] args)
    {
        /*a= discount %
        b= Selling price
        c= discount
        d= discounted selling price*/
        double a,b,c,d;
        try (Scanner read = new Scanner(System.in)) {
            while(1>0)
            {
                System.out.println("HELLO");
                System.out.println("WELCOME TO SELLING PRICE CALCULATOR");
                System.out.println("ENTRE DISCOUNTED SELLING PRICE");
                d=read.nextDouble();
                if (d>0)
                {
                    System.out.println("ENTRE DISCOUNT PERCENTAGE");
                    a=read.nextDouble();
                    if(a>0)
                    {
                        b=d/(1-(a/100));
                        c=b-d;
                        System.out.println("Discount IS");
                        System.out.println(c);
                        System.out.println("ORIGINAL SELLING PRICE IS");
                        System.out.println(b);
                        System.out.println("THANKS");
                        System.out.println("Bye");
                        System.out.println(".");
                    }
                    if(a<0)
                    {
                        System.out.println("DISCOUNT PERCENTAGE CANT BE NEGATIVE");
                        System.out.println("TRY AGAIN");
                        System.out.println(".");
                    }
                }
                if (d<0)
                {
                    System.out.println("DISCOUNTED SELLING PRICE CANT BE NEGATIVE");
                    System.out.println("TRY AGAIN");
                    System.out.println(".");
                }
            }
        }
    }
}