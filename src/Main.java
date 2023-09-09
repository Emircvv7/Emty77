public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.0, 2.0, -2.0, -4.0, 2.0, 3.0, 6.0, -7.0, 1.0, 2.0, 3.0, -1.0, -2.0, -3.0, -4.0};

        boolean foundNegative = false;

        double sumPositive = 0.0;

        int countPositive = 0;

        for (double number : numbers) {
            if (!foundNegative && number < 0) {
                foundNegative = true;
            } else if (foundNegative && number > 0) {
                sumPositive += number;
                countPositive++;
            }
        }

        double averagePositive = sumPositive / countPositive;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + averagePositive);
    }
}

