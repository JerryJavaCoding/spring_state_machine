import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;

@SpringBootApplication
public class Application implements CommandLineRunner {  
    public static void main(String[] args) {  
        SpringApplication.run(Application.class, args);  
    }  
    @Autowired
    private StateMachine<States, Events> stateMachine;
    @Override  
    public void run(String... args) throws Exception {  
        stateMachine.start();  
        stateMachine.sendEvent(Events.PAY);  
        stateMachine.sendEvent(Events.RECEIVE);  
    }  
}  