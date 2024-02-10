package org.home_work4;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public enum Calculator {
    SUM {
        public String operation(List<? extends Number> list){
            double result = 0;
            for (Number number : list) {
                result += number.doubleValue();
            }
            return result == (long) result?
                    String.valueOf((int) result):
                    String.valueOf(result);
        }
    },
    MULTIPLY {
        public String operation(List<? extends Number> list){
            double result = 1;
            for (Number number : list) {
                result *= number.doubleValue();
            }
            return result == (long) result?
                    String.valueOf((int) result):
                    String.valueOf(result);
        }
    },
    DEVIDE {
        public String operation(List<? extends Number> list){
            double result = list.getFirst().doubleValue();
            if (list.size() == 1) {
                return String.valueOf(result);
            }
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i).equals(0)) {
                    return "среди делимых аргументов коллекции - " + list +
                            "\nесть ноль, возникла неопределенность. " +
                            "Деления не будет. Лопиталь против.";
                }
                result /= list.get(i).doubleValue();
            }
            return result == (long) result?
                    String.valueOf((int) result):
                    String.valueOf(result);
        }
    },
    BIN {
        public String operation(List<? extends Number> list) {
            List<String> stringList = new ArrayList<>();
            for (Number number : list) {
                String stringFullNumber = "";

                if (number.doubleValue() == 0) {
                    stringFullNumber = "0";
                    stringList.add(stringFullNumber);
                    continue;
                }

                if (number.equals(number.intValue())) {
                    stringFullNumber +=
                            convertIntegerToBinary(number.intValue());
                } else {
                    int integerPart = number.intValue();
                    double fractionalPart = getFractionalPartOfNumber(number);

                    String binaryIntegerPart =
                            convertIntegerToBinary(integerPart);
                    String binaryFractionalPart =
                            convertFractionalToBinary(fractionalPart);

                    stringFullNumber = binaryIntegerPart + "." + binaryFractionalPart;
                }
                stringList.add(stringFullNumber);
            }
            return String.valueOf(stringList);
        }

        private double getFractionalPartOfNumber (Number number) {
            String s = number.toString();
            String p = "0." + s.substring(s.indexOf('.') + 1, s.length());
            return Double.parseDouble(p);
        }

        private String convertIntegerToBinary(int decimalNumber) {
            StringBuilder binaryNumber = new StringBuilder();
            while (decimalNumber > 0) {
                binaryNumber.insert(0, decimalNumber % 2);
                decimalNumber /= 2;
            }
            return binaryNumber.toString();
        }

        private String convertFractionalToBinary(double fractionalNumber) {
            StringBuilder binaryNumber = new StringBuilder();
            while (fractionalNumber > 0) {
                fractionalNumber *= 2;
                int bit = (int) fractionalNumber;
                binaryNumber.append(bit);
                fractionalNumber -= bit;
            }
            return binaryNumber.toString();
        }

    };
    public abstract String operation(List<? extends Number> list);
}
