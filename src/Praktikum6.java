public class Praktikum6 {
    public static void main(String[] args) {


        double[] feedExpensesCat = {100.50, 236.0, 510.6, 150.20, 80.0, 172.0, 135.4};
        double[] feedExpensesHamster = {70.50, 146.0, 710.6, 250.20, 83.0, 19.0, 55.4};

        sayHello("Пиксель");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesCat));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesCat));
        sayEnjoyMeal("Пиксель");

        sayHello("Байт");
        System.out.println("Твой самый дорогой корм стоил " + findMaxExpense(feedExpensesHamster));
        System.out.println("Всего на корм было потрачено " + findExpensesSum(feedExpensesHamster));
        sayEnjoyMeal("Байт");

    }
    public static void sayHello(String name){
        System.out.println("Привет, "+name+"!");
    }

    public static void sayEnjoyMeal(String name){
        System.out.printf("Приятного аппетита, "+name+"!");
    }

    public static double findMaxExpense(double[] feedExpenses){
        double maxFeedExpense = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            if (feedExpenses[i] > maxFeedExpense) {
                maxFeedExpense = feedExpenses[i];
            }
        }
        return maxFeedExpense;
    }

    public static double findExpensesSum(double[] feedExpenses){
        double sumFeed = 0;
        for (int i = 0; i < feedExpenses.length; i++) {
            sumFeed = sumFeed + feedExpenses[i];
        }
        return sumFeed;
    }
}
/*
Вывод
Привет, Пиксель!
Привет, Байт!
Твой самый дорогой корм стоил 510.6
Твой самый дорогой корм стоил 710.6
Всего на корм было потрачено 1384.7
Всего на корм было потрачено 1334.7
Приятного аппетита, Пиксель!
Приятного аппетита, Байт!*/