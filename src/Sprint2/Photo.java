package Sprint2;
/*Начинающий фотограф Алиса решила накопить на новый объектив. Она открыла вклад в банке на три года под 4% годовых.
В качестве стартового платежа Алиса внесла 5000 рублей и планирует каждый месяц пополнять счёт на 1000 рублей.
Помогите вычислить, сколько денег будет на вкладе Алисы к концу срока и хватит ли ей на объектив с учётом того,
 что он стоит 41000 рублей.
Вам нужно правильно расставить типы переменных и дополнить код необходимыми арифметическими операциями.
Начисление процентов по вкладу это регулярная процедура, число повторений которой заранее известно — используйте для вычислений цикл for.
Также учитывайте, что Алиса пополняет вклад после того, как начисляется доход от процентов.*/
public class Photo {
    public static void main(String[] args) {
        double roubles = 5000; // сумма на счету
        double yearRate = 4; // годовая процентная ставка
        int numOfMonth = 36; // количество месяцев, на который открыт вклад
        double monthRefill = 1000; // ежемесячное пополнение

        double monthRate = yearRate/12; // вычислите месячную процентную ставку

        for (int i = 0; i<numOfMonth;i++) { // дополните условие цикла
        double depositInterest = roubles * monthRate / 100; // вычислите доход от процентов
        roubles = roubles+depositInterest; // добавьте доход от процентов
        roubles = roubles+monthRefill; // учтите ежемесячное пополнение
        }

        System.out.println("Через " + numOfMonth + " месяцев накопится " + roubles + " рублей");

        if (roubles>=41000) { // определите, удалось ли достичь цели
            System.out.println("Ура! Можно идти в магазин за новым объективом!");
        } else {
            System.out.println("Нужно ещё немного подкопить.");
        }
    }
}