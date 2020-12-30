import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import org.apache.log4j.BasicConfigurator;

public class Bot {

    public static void main(String[] args){
        BasicConfigurator.configure();
        PingPong pingPong = new PingPong();

        JDABuilder jdaBuilder = JDABuilder.createDefault("NzkzNTk5MDgwNjMzODYwMDk3.X-umvQ.GvUBa9YyQj8ySbe4cGNW-80m8XM");
        JDA jda;
        jdaBuilder.addEventListeners(pingPong);
        try {
            jda = jdaBuilder.build();
        }
        catch (Exception e) {
            e.printStackTrace();
        }



    }
}