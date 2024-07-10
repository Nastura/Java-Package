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
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                count++; // отдыхаем
            } else {   // активно работаем
                System.out.println("Месяц: " + count + " Денег: " + money + " Придётся работать. Заработал: +" + income + " потратил: " + expenses);
                money = money + income - expenses;
            }
        }
        return count;
    }
}

// /*******************************/
//                 money -= expenses;
//                money /= 3;
//                x - y - ((x - y) * 2 / 3); == x - y - x*2/3 + y*2/3 = 1/3*a -1/3*b = 1/3(a-b)
//                int spending = ((money - expenses) * 2 / 3); //
//                System.out.println("Месяц: " + count + " Денег: " + money  + " Буду отдыхать. Потратил: " + expenses + " затем еще " + spending);
//                money = (money - expenses) - spending;
///*******************************




