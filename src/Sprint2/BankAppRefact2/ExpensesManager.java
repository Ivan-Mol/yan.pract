package Sprint2.BankAppRefact2;

import java.util.ArrayList;
import java.util.HashMap;

public class ExpensesManager {
    // Замените на таблицу с именем expensesByCategories
    HashMap<String, ArrayList<Double>> expensesByCategories;

    ExpensesManager() {
        expensesByCategories = new HashMap<>(); // Создайте таблицу
    }

    // Добавьте в метод ещё один параметр — category
    double saveExpense(String category, double moneyBeforeSalary, double expense) {
        moneyBeforeSalary = moneyBeforeSalary - expense;
        System.out.println("Значение сохранено! Ваш текущий баланс в рублях: " + moneyBeforeSalary);
        if (expensesByCategories.containsKey(category)) {
            // Получите список трат в этой категории
            ArrayList<Double> list = expensesByCategories.get(category);
            list.add(expense);
        } else {
            ArrayList<Double> newCategoryList = new ArrayList<>(); // Создайте новый список трат и добавьте в него сумму
            newCategoryList.add(expense);
            expensesByCategories.put(category, newCategoryList); // Сохраните категорию и новый список трат в хеш-таблицу
        }
        if (moneyBeforeSalary < 1000) {
            System.out.println("На вашем счету осталось совсем немного. Стоит начать экономить!");
        }
        return moneyBeforeSalary;
    }

    void printAllExpensesByCategories() {
        // Замените логику для работы с таблицами
        for (String key : expensesByCategories.keySet()) {
            System.out.println(key);
            ArrayList<Double> categoryList = expensesByCategories.get(key);
            for (int i = 0; i < categoryList.size(); i++) {
                System.out.println(categoryList.get(i));
            }
        }
    }

    // Метод должен принимать название категории и называться findMaxExpenseInCategory
    double findMaxExpenseInCategory(String category) {
        double maxExpense = 0;
        /* Замените логику для работы с таблицами
        Если категория есть, то ищем максмальную трату.
        Иначе печатаем "Такой категории пока нет." */
        if (expensesByCategories.containsKey(category)) {
            ArrayList<Double> categoryList = expensesByCategories.get(category);
            for (int i = 0; i < categoryList.size(); i++) {
                if (categoryList.get(i) > maxExpense) {
                    maxExpense = categoryList.get(i);
                }
            }
        } else {
            System.out.println("Такой категории пока нет.");
        }
        return maxExpense;
    }

    void removeAllExpenses() {
        expensesByCategories.clear(); // Таблица называется иначе
        System.out.println("Траты удалены.");
    }
}