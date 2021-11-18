package com.tw;
import java.util.Scanner;
public class CalculateSalary {
    public static void main(String[] a){

        Scanner scan = new Scanner(System.in);

        int[] workHours = new int[7];
        int totalHoursWorked = 0;
        int extraHoursWorked = 0;

        for (int i = 0; i < 7; i++) {
            workHours[i] = scan.nextInt();

            if (i != 0 && i != 6) {
                totalHoursWorked += workHours[i];
                if (workHours[i] > 8)
                    extraHoursWorked = workHours[i] - 8;
            }
        }

        int salary = ( workHours[6] * 100 * 5) / 4 + (workHours[0] * 100 * 3) / 2 + (totalHoursWorked * 100) + (extraHoursWorked * 15);
        if (totalHoursWorked > 40)
            salary += (totalHoursWorked - 40) * 25;

        System.out.println(salary);

    }
}
