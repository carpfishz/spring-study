import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by sangminlee on 2017. 7. 31..
 */
public class MainClass {

    public static void main(String[] args) {

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

        ctx.load("classpath:applicationCTX.xml");
        ctx.refresh();
        ctx.close();

    }

}