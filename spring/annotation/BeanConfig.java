package annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="annotation")
public class BeanConfig {
    //defining bean myself in the configuration
    // @Bean
    // public Doctor1 doctor1(){
    //     return new Doctor1();
    //     }


}