package org.home_work4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List list1 = new ArrayList<>(Arrays.asList(1, 56, 899, 2));
        List list2 = new ArrayList<>(Arrays.asList(1.375, 56.125, 0, 2.1));
        List list3 = new ArrayList<>(Arrays.asList(24.2, 2, 2.625));

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("list3: " + list3);

        System.out.println("Сумма элементов list1: " + Calculator.SUM.operation(list1));
        System.out.println("Сумма элементов list2: " + Calculator.SUM.operation(list2));
        System.out.println("Сумма элементов list3: " + Calculator.SUM.operation(list3));

        System.out.println("Произведение элементов list1: " +
                Calculator.MULTIPLY.operation(list1));
        System.out.println("Произведение элементов list2: " +
                Calculator.MULTIPLY.operation(list2));
        System.out.println("Произведение элементов list3: " +
                Calculator.MULTIPLY.operation(list3));

        System.out.println("Результат деления 1го элемента list1 на остальные: " +
                Calculator.DEVIDE.operation(list1));
        System.out.println("Результат деления 1го элемента list2 на остальные: " +
                Calculator.DEVIDE.operation(list2));
        System.out.println("Результат деления 1го элемента list3 на остальные: " +
                Calculator.DEVIDE.operation(list3));

        System.out.println("Результат бинарного перевода list1: " +
                Calculator.BIN.operation(list1));
        System.out.println("Результат бинарного перевода list2: " +
                Calculator.BIN.operation(list2));
        System.out.println("Результат бинарного перевода list3: " +
                Calculator.BIN.operation(list3));

    }

}
