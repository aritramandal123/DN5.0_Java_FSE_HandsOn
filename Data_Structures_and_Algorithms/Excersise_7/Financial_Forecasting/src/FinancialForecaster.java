
public class FinancialForecaster {

    public static double predictFutureValue(double presentValue, double growthRate, int years) {
        // Base Case: The stopping condition
        if (years <= 0) {
            return presentValue;
        }

        // Recursive Case: Reduce the problem size (years - 1) and build upon the result
        return predictFutureValue(presentValue, growthRate, years - 1) * (1 + growthRate);
    }

    public static void main(String[] args) {
        double initialInvestment = 10000.0; // $10,000
        double annualGrowth = 0.07;         // 7% growth
        int forecastPeriod = 10;            // 10 years

        System.out.println("--- Financial Forecasting Tool ---");
        System.out.printf("Initial Value: $%,.2f%n", initialInvestment);
        System.out.printf("Growth Rate: %.1f%%%n", annualGrowth * 100);
        System.out.printf("Forecast Horizon: %d years%n%n", forecastPeriod);

        // Execute the recursive algorithm
        double forecastResult = predictFutureValue(initialInvestment, annualGrowth, forecastPeriod);

        System.out.printf("Forecasted Value after %d years: $%,.2f%n", forecastPeriod, forecastResult);
    }
}
