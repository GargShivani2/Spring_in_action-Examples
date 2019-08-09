import com.springinaction.springidol.PerformanceException;
import com.springinaction.springidol.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("Application.xml");
        Performer performer =  (Performer) appContext.getBean("poeticDuke");
        performer.perform();
        System.out.println("The Performance is over");
    }
}
