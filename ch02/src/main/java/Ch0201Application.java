/**
 * Created by sangminlee on 2017. 7. 17..
 */
public class Ch0201Application {

    public static void main(String [] args) {
        Calculator calculator = new Calculator();
        calculator.setFirstNum(1);
        calculator.setSecondNum(2);

        calculator.add();
        calculator.sub();
        calculator.mul();
        calculator.div();
    }
}
