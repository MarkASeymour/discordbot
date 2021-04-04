import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.User;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class PingPong extends ListenerAdapter {




    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        PriceController priceController = new PriceController();

        if(e.getMessage().getContentRaw().contains("BTC")) {
            String btcPrice = priceController.retrieveBitcoinPrice("BTC");

            e.getChannel().sendMessage("Bitcoin to USD is currently: $" + btcPrice).queue();

        }


    }

}
