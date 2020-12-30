import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static void main(String[] args){

        JDABuilder jdaBuilder = JDABuilder.createDefault("NzkzNTk5MDgwNjMzODYwMDk3.X-umvQ.GvUBa9YyQj8ySbe4cGNW-80m8XM");
        JDA jda;
        try {
            jda = jdaBuilder.build();
        }
        catch (Exception e) {
            e.printStackTrace();
        }



    }
}