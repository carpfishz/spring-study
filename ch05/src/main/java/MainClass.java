import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Created by sangminlee on 2017. 7. 31..
 */


public class MainClass {

    public static void main(String[] args) {

        String configLocatioin = "classpath:applicationCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocatioin);
        StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
        studentInfo.getStudentInfo();

        Student student2 = ctx.getBean("student2", Student.class);
        studentInfo.setStudent(student2);
        studentInfo.getStudentInfo();

        ctx.close();
    }
}