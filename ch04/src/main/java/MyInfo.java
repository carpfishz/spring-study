import java.util.ArrayList;

/**
 * Created by sangminlee on 2017. 7. 17..
 */
public class MyInfo {
    private String name;
    private double height;
    private double weight;
    private ArrayList<String> hobbys;
    private BMICalculator bmiCalculator;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public ArrayList<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(ArrayList<String> hobbys) {
        this.hobbys = hobbys;
    }

    public BMICalculator getBmiCalculator() {
        return bmiCalculator;
    }

    public void setBmiCalculator(BMICalculator bmiCalculator) {
        this.bmiCalculator = bmiCalculator;
    }

    public void bmiCalculator() {
        bmiCalculator.bmiconculation(weight, height);
    }

    public void getInfo() {
        System.out.println("name : " + name);
        System.out.println("height : " + height);
        System.out.println("weight : " + weight);
        System.out.println("hobbys : " + hobbys);
    }
}