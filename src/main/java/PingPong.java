import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingPong extends ListenerAdapter {



    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if(e.getMessage().getContentRaw().equals("ping")) {
            e.getChannel().sendMessage("pong").queue();
            System.out.println(e.getAuthor());
        }
        if(e.getAuthor().getName().equals("Markinho")) {
             for(Member member : e.getGuild().getMembers()) {
                 String name = member.getUser().getName();
                 System.out.println(name);
                 if(name.equals("Markinho")) {
                     System.out.println("c*&^&*%^&^%$^%$");
                     member.modifyNickname("mark modified name");
                 }
             }
        }
    }

}
