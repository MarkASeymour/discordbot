import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingPong extends ListenerAdapter {
    private boolean isStockGet = false;



    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

        if(e.getMessage().getContentRaw().contains("bitcoin")) {


//            e.getChannel().sendMessage("pong").queue();
//            System.out.println(e.getAuthor());
        }
//            if(!e.getAuthor().getName().equals("Bot Sagdiyev")) {
//                for (Member member : e.getGuild().getMembers()) {
//                    System.out.println("for loop hit");
//                    String name = member.getUser().getName();
//                    String nickName = member.getNickname();
//
//                    if (name.equals("emerryy")) {
//                        System.out.println(name);
//                        member.modifyNickname("Tariq - test").queue();
//                        System.out.println("Name modified");
//                        e.getChannel().sendMessage("Hey Tariq! I noticed that you weren't using your REAL NAME in this server, so I took the liberty of fixing that for you!").queue();
//                    }
//
//
//                }
//            }

    }

}
