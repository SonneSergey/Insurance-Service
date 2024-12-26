package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InsuranceServiceTest {

    @Test
    public void calculatePremium() {
        InsuranceService service = new InsuranceService();
        int age = 24;
        int experience = 2;
        double carCost = 1_000_000;
        int expected = 150_000;
        double actual = service.calculate(age, experience, carCost);
        assertEquals(expected, actual); // Возраст меньше 25 лет и опыт вождения меньше 3 лет
    }

    @Test
    public void calculatePremium1() {
        InsuranceService service = new InsuranceService();
        int age = 24;
        int experience = 3;
        double carCost = 1_000_000;
        int expected = 100_000;
        double actual = service.calculate(age, experience, carCost);
        assertEquals(expected, actual); // Возраст меньше 25 лет, но опыт вождения 3 года и боле
    }

    @Test
    public void calculatePremium2() {
        InsuranceService service = new InsuranceService();
        int age = 25;
        int experience = 2;
        double carCost = 1_000_000;
        int expected = 80_000;
        double actual = service.calculate(age, experience, carCost);
        assertEquals(expected, actual); // Возраст меньше 25 лет, но опыт вождения 3 года и боле
    }

    @Test
    public void calculatePremium3() {
        InsuranceService service = new InsuranceService();
        int age = 25;
        int experience = 4;
        double carCost = 1_000_000;
        int expected = 50_000;
        double actual = service.calculate(age, experience, carCost);
        assertEquals(expected, actual); // Возраст меньше 25 лет, но опыт вождения 3 года и боле
    }

}