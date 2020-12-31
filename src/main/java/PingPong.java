import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingPong extends ListenerAdapter {



    @Override
    public void onMessageReceived(MessageReceivedEvent e) {

//        if(e.getMessage().getContentRaw().equalsIgnoreCase("ping")) {
//            e.getChannel().sendMessage("pong").queue();
//            System.out.println(e.getAuthor());
//        }
            if(true) {
                for (Member member : e.getGuild().getMembers()) {
                    System.out.println("for loop hit");
                    String name = member.getUser().getName();
                    String nickName = member.getNickname();

                    if (name.equals("bluedream_5gr")) {
                        System.out.println(name);
                        member.modifyNickname("cody - test").queue();
                        System.out.println("Name modified");
                    }


                }
            }

    }

}
