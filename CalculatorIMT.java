package calculator;

import javax.swing.*;

public class CalculatorIMT {

    public static void main(String[] args) {


        User user = new User();

        //задаем имя объёкта
        String name =
                JOptionPane.showInputDialog(null, "Введите имя ",
                        "Калькулятор индекса массы тела", JOptionPane.INFORMATION_MESSAGE);

        user.setName(name);

        //задаем возраст

        String ageStr;

        ageStr =
                JOptionPane.showInputDialog(null, "Введите возраст ",
                        "Калькулятор индекса массы тела", JOptionPane.INFORMATION_MESSAGE);

        //проверка соответствия ввода данных

        try {
            int ageInt = Integer.parseInt(ageStr);
            user.setAge(ageInt);


        } catch (NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Введите цифры, например, 32", "Ошибка", JOptionPane.ERROR_MESSAGE);

            ageStr =
                    JOptionPane.showInputDialog(null, "Введите возраст ",
                            "Калькулятор индекса массы тела", JOptionPane.INFORMATION_MESSAGE);


        }

        //задаем рост
        String heightStr =
                JOptionPane.showInputDialog(null, "Введите рост (например, 1.72): ",
                        "Калькулятор индекса массы тела", JOptionPane.INFORMATION_MESSAGE);

        //проверка соответствия ввода данных


        try {
            double heightDouble = Double.parseDouble(heightStr);

            user.setHeight(heightDouble);

        } catch (NumberFormatException n) {

            JOptionPane.showMessageDialog(null, "Введите вещественные цифры, например, 1.72", "Ошибка", JOptionPane.ERROR_MESSAGE);

            heightStr =
                    JOptionPane.showInputDialog(null, "Введите рост (например, 1.72): ",
                            "Калькулятор индекса массы тела", JOptionPane.INFORMATION_MESSAGE);


        }

        //задаем вес
        String weightStr =
                JOptionPane.showInputDialog(null, "Введите вес (например, 65.5): ",
                        "Калькулятор индекса массы тела", JOptionPane.INFORMATION_MESSAGE);

        //проверка соответствия ввода данных

        try {
            double weightDouble = Double.parseDouble(weightStr);

            user.setWeight(weightDouble);

        } catch (NumberFormatException n) {

            JOptionPane.showMessageDialog(null, "Введите вещественные цифры, например, 65.7", "Ошибка", JOptionPane.ERROR_MESSAGE);

            weightStr =
                    JOptionPane.showInputDialog(null, "Введите вес (например, 65.5): ",
                            "Калькулятор индекса массы тела", JOptionPane.INFORMATION_MESSAGE);

        }

        // выводим итог и введенные данные
        String result = "Имя: " + user.getName() +
                "\nВозраст: " + user.getAge() +
                "\nРост: " + user.getHeight() +
                "\nВозраст: " + user.getWeight() +
                "\n" + Calculator.calculation(user.getWeight(), user.getHeight());

        JOptionPane.showInternalMessageDialog(null, result,
                "Калькулятор индекса массы тела", JOptionPane.INFORMATION_MESSAGE);

        // счетчик пациентов выводися консоль
        System.out.print("Количество пациентов: " + User.counter());

        System.exit(0);

    }

}
