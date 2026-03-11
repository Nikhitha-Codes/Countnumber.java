import java.util.*;

class Countnumber
{
    void num(int n)
    {
        int evencount = 0;
        int oddcount = 0;

        while(n > 0)
        {
            int digit = n % 10;

            if(digit % 2 == 0)
            {
                evencount++;
            }
            else
            {
                oddcount++;
            }

            n = n / 10;
        }

        System.out.println("Even digits count: " + evencount);
        System.out.println("Odd digits count: " + oddcount);
    }
}

class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int n = sc.nextInt();

        Countnumber c = new Countnumber();
        c.num(n);
    }
}
