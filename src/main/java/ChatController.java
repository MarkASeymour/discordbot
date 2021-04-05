import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChatController extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        PriceController priceController = new PriceController();

        if(e.getMessage().getContentRaw().contains(":c")) {
            String desiredCryptoSymbol = e.getMessage().getContentRaw().substring(3, 6).toUpperCase();
            String cryptoPrice = priceController.retrieveBitcoinPrice(desiredCryptoSymbol);

            e.getChannel().sendMessage(desiredCryptoSymbol + " to USD is currently: $" + cryptoPrice).queue();

        }



    }

}
