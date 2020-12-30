import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingPong extends ListenerAdapter {

    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        if(e.getMessage().getContentRaw().equals("ping")) {
            e.getChannel().sendMessage("pong").queue();
        }
        if(e.getAuthor().equals("Markinho ")) {
             e.getChannel().sendMessage("hey mark").queue();
        }
    }

}
