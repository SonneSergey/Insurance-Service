package ru.netology;

public class InsuranceService {

    public double calculate(int age, int experience, double carCost) {

        if (age < 25 && experience < 3) {
            return carCost / 100 * 15;
        } else if (age < 25 && experience >= 3) {
            return carCost / 100 * 10;

        } else if (age >= 25 && experience <= 3) {
            return carCost / 100 * 8;
        } else {
            return carCost / 100 * 5;
        }
    }
}
