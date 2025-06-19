import java.util.Scanner;

public class FinancialForecasting {

    static double forecast(double revenue, double rate, int years) {
        if (years == 0) {
            return revenue;
        }
        return forecast(revenue * (1 + rate), rate, years - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter current revenue: ");
        double revenue = sc.nextDouble();

        System.out.print("Enter annual growth rate (e.g., 0.10 for 10%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter number of years to forecast: ");
        int years = sc.nextInt();

        double result = forecast(revenue, rate, years);

        System.out.printf("Forecasted revenue after %d years: %.2f\n", years, result);

        sc.close();
    }
}
