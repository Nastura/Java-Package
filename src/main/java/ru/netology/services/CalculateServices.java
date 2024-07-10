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




