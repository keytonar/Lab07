import java.util.Random;

public class WhileLoop
{
    public static void main(String[] args)
    {
        Random rnd = new Random();

        int die1, die2, dieRoll;

        die1 = rnd.nextInt(6) + 1; // 1 - 6
        die2 = rnd.nextInt(6) + 1;

        dieRoll = die1 + die2;

        System.out.println("Initial Roll is " + dieRoll);

        die1 = 0;
        die2 = 1;
        while(die1 != die2)
        {
            die1 = rnd.nextInt(6) + 1; // 1 - 6
            die2 = rnd.nextInt(6) + 1;

            dieRoll = die1 + die2;

            System.out.printf("Roll is %3d\t%3d\t%3d\n",dieRoll, die1, die2);
        }
    }
}
