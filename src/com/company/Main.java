package com.company;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int i = 0;
        while (i < 10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        // Задание 2
        for (int day = 4; day <= 31; day = day + 7) {
            for (i = 1; i <= 31; i++) {
                if (i == day) {
                    System.out.println("Сегодня пятница " + i + "-е число. Необходимо подготовить отчет.");
                }
            }
        }
        System.out.println();

        // Задание 3
        for (int comet = 0; comet <= 2120; comet = comet + 79) {
            for (int year = 1822; year <= 2120; year++) {
                if (year == comet)
                    System.out.println(year);

            }
        }
    }
}
