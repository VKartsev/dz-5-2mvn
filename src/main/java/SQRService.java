package ru.netology.sqr;

public class SQRService {

    public int calculate(int min, int max) {
        int i;
        int x = 0;
        for (i = 10; i < 100; i++) {
            if (i * i >= min && i * i <= max) {
                x++;
            }
        }
        return x;
    }
}