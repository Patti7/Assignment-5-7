public class TuitionCalculator {
    public static void main(String[] args) {
        double initialTuition = 10000;
        double annualIncreaseRate = 0.05;
        double tuitionInTenYears = initialTuition;

        for (int year = 1; year <= 10; year++) {
            tuitionInTenYears *= (1 + annualIncreaseRate);

        }

        System.out.printf("Tuition in ten years: $%.2f%n", tuitionInTenYears);

        double totalCostForFourYears = 0;
        for (int year = 1; year <= 4; year++) {
            totalCostForFourYears += tuitionInTenYears;
            tuitionInTenYears *= (1 + annualIncreaseRate);
        }

        System.out.printf("Total cost for four years after the tenth year: $%.2f%n", totalCostForFourYears);
    }
}

       

  

      

