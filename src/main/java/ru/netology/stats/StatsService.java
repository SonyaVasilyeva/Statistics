package ru.netology.stats;

public class StatsService {
    public int yearSalesAmountService(int[] monthSale) {
        int sum = 0;
        for (int i = 0; i < monthSale.length; i++) {
            sum = sum + monthSale[i];
        }
        return sum;
    }

    public int yarSalesAmountService(int[] monthSale) {
        int sum = 0;
        for (int j : monthSale) {
            sum = sum + j;
        }
        return sum;
    }

   /* public int yearSalesAmountService(int[] monthSale) {
        int sum = 0;
        for (int j : monthSale) {
            sum = sum + j;
        }
        return sum;
    } */

   /* public int averageAmountService(int[] monthSale) {
        int sum = 0;
        for (int i = 0; i < monthSale.length; i++) {
            sum = sum + monthSale[i];
        }
        int average = sum / monthSale.length;
        return average;
    } */

    public int averageAmountService(int[] monthSale) {
        int sum = yearSalesAmountService(monthSale);
        int average = sum / monthSale.length;
        return average;
    }

    public int maxSalesMonthService(int[] monthSale) {
        int maxMonth = 0;
        for (int i = 0; i < monthSale.length; i++) {
            if (monthSale[i] >= monthSale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSalesMonthService(int[] monthSale) {
        int minMonth = 0;
        for (int i = 0; i < monthSale.length; i++) {
            if (monthSale[i] <= monthSale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    public int getAmountOfMonthsWithLessAverageSalesService(int[] monthSale) {
        int average = averageAmountService(monthSale);
        int monthAmount = 0;
        for (int i = 0; i < monthSale.length; i++) {
            if (monthSale[i] < average) {
                monthAmount++;
            }
        }
        return monthAmount;
    }

    public int getAmountOfMonthsWithMoreAverageSalesService(int[] monthSale) {
        int average = averageAmountService(monthSale);
        int monthAmount = 0;
        for (int j : monthSale) {
            if (j > average) {
                monthAmount++;
            }
        }
        return monthAmount;
    }

}


