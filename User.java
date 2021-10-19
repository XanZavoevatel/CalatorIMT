
package calculator;

public class User {

    private String name;
    private int age;
    private double height;
    private double weight;

    //счетчик созданых объектов
    private static int num = 0;

    public User() {
        num++;
    }

    public static int counter() {
        return num;
    }


    public void setName(String userName) {
        this.name = userName;
    }

    public void setAge(int userAge) {
        this.age = userAge;
    }

    public void setHeight(double userHeight) {
        this.height = userHeight;
    }

    public void setWeight(double userWeight) {
        this.weight = userWeight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
