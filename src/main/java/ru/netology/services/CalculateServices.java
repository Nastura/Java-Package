package ru.netology.services;

public class CalculateServices {
    // initialBalance = изначальный баланс
    // income - 10000 доход от работы
    // expense - 3000 обязательные месячные траты;
    // threshold - 20000 минимальный порог денег на счету для выбора отдых или работа;
    // spending -траты
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        int countDel = 0; // счётчик месяцев отдыха
//        int threshold = 20000; //threshold - порог
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++; // отдыхаем
                money = money - expenses - ((money - expenses) * 2 / 3);
                countDel++; // отдельный счетчик для подсчета месяцев отдыха
            } else {   // активно работаем
                count++;
                System.out.println("Месяц: " + count + " Денег: " + money + " Придётся работать. Заработал: +" + income + " потратил: " + expenses);
                money = money + income - expenses;


            }
        }
        return countDel;
    }
}

// /*******************************/
//                int spending = ((money - expenses) * 2 / 3); //
//                System.out.println("Месяц: " + count + " Денег: " + money  + " Буду отдыхать. Потратил: " + expenses + " затем еще " + spending);
//                money = (money - expenses) - spending;
//
// деньги уменьшаются на expense,
// а затем остаток накоплений ещё уменьшается в три раза — траты на отдых;
//                int spending = expenses + ((money - expenses)/3*2);
//                int spending = ((money - expenses)/3*2);
//                // (money * 2 / 3)
//                // int money = (money - expenses) - ((money - expenses) * 2 / 3);
//
///*******************************




