import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.requests.GatewayIntent;
import net.dv8tion.jda.api.utils.ChunkingFilter;
import net.dv8tion.jda.api.utils.MemberCachePolicy;
import org.apache.log4j.BasicConfigurator;

public class Bot {

    public static void main(String[] args){
        BasicConfigurator.configure();
        ChatController chatController = new ChatController();

        JDABuilder jdaBuilder = JDABuilder.createDefault("ODI5MzM3NzE0MjU2MTE3ODAx.YG2q7w.N9e0Vxo1Xvm-pzdhhDL_dBI-2o4")
                .setChunkingFilter(ChunkingFilter.ALL)
                .setMemberCachePolicy(MemberCachePolicy.ALL)
                .enableIntents(GatewayIntent.GUILD_MEMBERS, GatewayIntent.GUILD_PRESENCES);
        JDA jda;
        jdaBuilder.addEventListeners(chatController);
        try {
            jda = jdaBuilder.build();
        }
        catch (Exception e) {
            e.printStackTrace();
        }



    }
}