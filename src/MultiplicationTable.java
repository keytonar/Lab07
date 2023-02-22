public class MultiplicationTable {
    public static void main(String[] args)
    {
        // Print table header
        System.out.printf("%5s", "");
        for (int i = 1; i <= 12; i++)
        {
            System.out.printf("%5d", i);
        }
        System.out.println();

        for (int i = 1; i <= 12; i++)
        {
            System.out.printf("%5d", i);

            for (int j = 1; j <= 12; j++)
            {
                System.out.printf("%5d", i*j);
            }

            System.out.println();
        }
    }
}
