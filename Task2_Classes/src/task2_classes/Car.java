/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2_classes;

/**
 *
 * @author Georgi
 */
public class Car {

    int CurrentYear = 2017;
    String brand;
    String model;
    double HorsePower;
    int year;
    int YearsExisted = CurrentYear - year;

    int InsuranceCategory() {

        if (YearsExisted < 8) {
            return 1;
        }

        if (YearsExisted > 8 && YearsExisted < 15) {
            return 2;
        }
        if (YearsExisted > 15 && YearsExisted < 25) {
            return 3;
        }
        return 4;

    }

    double Debt() {
        int insurance = InsuranceCategory();
        double debt = 0;

        switch (insurance) {
            case 1:
                debt = 150;
                break;

            case 2:
                debt = 200;
                break;
            case 3:
                debt = 300;
                break;
            case 4:
                debt = 500;
                break;
        }
        if (HorsePower < 80) {
debt *= 1.2;
        }
        if(HorsePower >140){
            debt *= 1.45;
        }
        return debt;
    }

}
