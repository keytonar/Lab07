public class TempatureChart
{
    public static void main(String[] args)
    {
        System.out.printf("%-10s %-10s%n", "Celsius", "Farenheit");
        System.out.println("------------------------");


        for (double celsius = 0.0; celsius <= 100.0; celsius++)
        {
            double farenheit = (celsius * 9/5) + 32;
            System.out.printf("%-10.1f %-10.1f%n", celsius, farenheit);
        }

    }
}
