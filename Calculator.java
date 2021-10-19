package calculator;

public class Calculator {
    
    
    public static String calculation(double weight, double height) {

        double result = weight / Math.pow(height, 2);

        if (result <= 16) {
            return "У вас Выраженный дефицит массы";
        } else if (result > 16 & result <= 18.5) {
            return "У вас недостаточная масса тела";
        } else if (result > 18.5 & result <= 25) {
            return "У вас норма";
        } else if (result > 25 & result <= 30) {
            return "У вас избыточная масса тела";
        } else if (result > 30 & result <= 35) {
            return "У вас ожирение первой степени";
        } else if (result > 35 & result <= 40) {
            return "У вас ожирение второй степени";
        } else {
            return "У вас ожирение третей степени";
        }
    }
}
