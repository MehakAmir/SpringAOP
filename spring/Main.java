import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources/beans.xml");
        //throught interface
        Staff st = (Doctor) context.getBean("Doctor");
        st.assist(); 

        Doctor doc = (Doctor) context.getBean("Doctor");
        doc.assist(); 
        doc.displayGreeting();
        //Access properties 
        System.out.println(doc.getQualification()); 
        doc.displayInfo();

        Nurse doc1 = (Nurse) context.getBean("Nurse");
        doc1.assist();

    }
}

