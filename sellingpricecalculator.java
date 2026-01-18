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
            while(true)
            {
                System.out.println("Hello");
                System.out.println("Welcome to Selling price Calculator");
                System.out.println("Entre Discounted Selling price");
                d=read.nextDouble();
                if (d>0)
                {
                    System.out.println("Entre Discount %");
                    a=read.nextDouble();
                    if(a>0)
                    {
                        b=d/(1-(a/100));
                        c=b-d;
                        System.out.println("Discount IS");
                        System.out.println(c);
                        System.out.println("Original Selling price is");
                        System.out.println(b);
                        System.out.println("Thank you");
                        System.out.println("Bye");
                        System.out.println(".");
                    }
                    else if(a<0)
                    {
                        System.out.println("Discount % can't be negative");
                        System.out.println("Try again");
                        System.out.println(".");
                    }
                    else if(a==0)
                    {
                        System.out.println("Discount % can't be zero");
                        System.out.println("Try again");
                        System.out.println(".");
                    }
                }
                else if (d<0)
                {
                    System.out.println("Discounted Selling price can't be negative");
                    System.out.println("Try again");
                    System.out.println(".");
                }
                else if (d==0)
                {
                    System.out.println("Discounted Selling price can't be zero");
                    System.out.println("Try again");
                    System.out.println(".");
                }
            }
        }
    }

}

