import model.Currency;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class ChatController extends ListenerAdapter {


    @Override
    public void onMessageReceived(MessageReceivedEvent e) {
        PriceController priceController = new PriceController();

        if(e.getMessage().getContentRaw().contains(":c")) {
            Currency currency = new Currency();
            String desiredCryptoSymbol = e.getMessage().getContentRaw().substring(2).trim().toUpperCase();
            currency = priceController.retrieveCryptoPrice(desiredCryptoSymbol);
            if(currency.getName().equals("Invalid crypto symbol. Enter a valid symbol!")) {
                e.getChannel().sendMessage(currency.getName()).queue();
            } else {
                e.getChannel().sendMessage(desiredCryptoSymbol + " to USD is currently: $" + currency.getPrice()
                        + "\n" + "with an all-time high of $" + currency.getHigh() + " on " + currency.getHighTimestamp().substring(0, 10) + "\n"
                        + "Currently, " + currency.getName() + " is ranked #" + currency.getRank() + "\n"
                        + "Over the past day the price of " + currency.getName() + " has " + currency.getOneDayInterval().getTrend() + " $" + currency.getOneDayInterval().getPriceChange())
                        .queue();

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
