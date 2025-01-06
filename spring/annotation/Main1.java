package annotation;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main1 {
    public static void main(String[] args) {
        // ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfig.class);
        Doctor1 doc = context.getBean(Doctor1.class);
        doc.assist();
        doc.setQualification("MBBS");
        System.out.println(doc);

//Rturn the same object again 
        Doctor1 doc1 = context.getBean(Doctor1.class);
        System.out.println(doc1);
 
    }
}

