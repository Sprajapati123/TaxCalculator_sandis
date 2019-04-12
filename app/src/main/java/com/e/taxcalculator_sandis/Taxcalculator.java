package com.e.taxcalculator_sandis;

public class Taxcalculator {


    private double salary;

    public Taxcalculator(double salary) {

        this.salary = salary;
    }


    public double calculate() {

        if (salary > 1 && salary < 200000) {
            return (salary * 1) / 100;

        } else if (salary > 200000 && salary < 350000) {
            return (200000 * 1 / 100) + (salary - 200000) * 15 / 100;

        } else if (salary > 350000) {
            return (200000 * 1 / 100) + (150000 * 15) / 100 + (salary - 350000) * 25 / 100;

        }
        return 0;
    }
}