import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean(name = "console")
    public Massage getConsoleMessege() {
        return new ConsoleMessage();
    }

    @Bean(name = "file")
    public Massage getFileMessege(){
        return new FileMassage();
    }
}
