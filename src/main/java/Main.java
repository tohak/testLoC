import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void  main(String [] args){
        ConfigurableApplicationContext ctx= new AnnotationConfigApplicationContext(AppConfig.class);

        Massage massageConsole= (Massage) ctx.getBean("console");
        Massage massageFile= (Massage) ctx.getBean("file");

        System.out.println(massageConsole.getMessege());
        System.out.printf(massageFile.getMessege());

    }

}
