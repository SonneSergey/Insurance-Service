package ru.netology;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        InsuranceService service = new InsuranceService();

        int age = 25;
        int experience = 3;
        double carCost = 1_000_000;

        double calculatePremium = service.calculate(age, experience, carCost);
    }
}