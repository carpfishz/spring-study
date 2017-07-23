import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by sangminlee on 2017. 7. 17..
 */
public class Ch0401Application {
    public static void main(String [] args) {
        String configuration = "classpath:applicationCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configuration);
        MyInfo myInfo = ctx.getBean("myInfo", MyInfo.class);
        myInfo.getInfo();
        ctx.close();
    }
}