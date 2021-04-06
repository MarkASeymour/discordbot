
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PriceControllerTest {
    private PriceController priceController;

    @Before
    public void setUp() {
        priceController = new PriceController();
    }



    @Test
    public void retrieveCryptoPriceTest() {
        Assert.assertNotEquals("Invalid crypto symbol. Enter a valid symbol!", priceController.retrieveCryptoPrice("BTC").getName());
        try{
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        Assert.assertEquals("Invalid crypto symbol. Enter a valid symbol!", priceController.retrieveCryptoPrice("skjhdf").getName());
    }

}
