package Sprint4.TransactionValidator;

public class TransactionValidator {
    // объявите константы
    private static final double MIN_AMOUNT = 1.0;
    private static final double MAX_AMOUNT = 5000.0;

    // объявите метод isValidAmount()
    // внутри метода добавьте проверки на минимальную и максимальную сумму перевода
    public static boolean isValidAmount(double amount) {
        boolean isValid = false;
        if (amount < MIN_AMOUNT) {
            System.out.println("Минимальная сумма перевода: " + MIN_AMOUNT + " р. Попробуйте ещё раз!");

        } else if (amount > MAX_AMOUNT) {
            System.out.println("Максимальная сумма перевода: " + MAX_AMOUNT + " р. Попробуйте ещё раз!");

        } else {
            isValid = true;
        }

        return isValid;
    }
}