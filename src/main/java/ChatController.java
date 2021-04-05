import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChatController extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        PriceController priceController = new PriceController();

        if(e.getMessage().getContentRaw().contains(":c")) {
            String desiredCryptoSymbol = e.getMessage().getContentRaw().substring(2).trim().toUpperCase();
            String cryptoPrice = priceController.retrieveCryptoPrice(desiredCryptoSymbol);
            if(cryptoPrice.equals("enter a valid cryptocurrency symbol")) {
                e.getChannel().sendMessage(cryptoPrice).queue();
            } else {
                e.getChannel().sendMessage(desiredCryptoSymbol + " to USD is currently: $" + cryptoPrice).queue();

            }


        }
        if(e.getMessage().getContentRaw().contains(":e")) {
            String desiredCurrencySymbol = e.getMessage().getContentRaw().substring(2).trim().toUpperCase();
            String exchangeRate = priceController.getExchangeRate(desiredCurrencySymbol);
            if(exchangeRate.equals("enter a valid currency symbol") || exchangeRate.equals("something went wrong retrieving currencies!")) {
                e.getChannel().sendMessage(exchangeRate).queue();
            }
            else {
                e.getChannel().sendMessage(desiredCurrencySymbol + " to USD is currently: $" + exchangeRate).queue();

            }
        }



    }

}
