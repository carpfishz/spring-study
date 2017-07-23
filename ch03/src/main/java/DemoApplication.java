import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by sangminlee on 2017. 7. 17..
 */
public class DemoApplication {

    public static void main(String [] args) {
        String configLoc = "classpath:applicationCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLoc);
        MyCalculator myCalculator = ctx.getBean("myCalculator",MyCalculator.class);

        myCalculator.add();
        myCalculator.sub();
        myCalculator.mul();
        myCalculator.div();
        ctx.close();
    }
}
