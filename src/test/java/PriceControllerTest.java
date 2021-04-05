
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
        Assert.assertNotEquals("enter a valid cryptocurrency symbol", priceController.retrieveCryptoPrice("BTC"));
        try{
            Thread.sleep(1000);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
        Assert.assertEquals("enter a valid cryptocurrency symbol", priceController.retrieveCryptoPrice("skjhdf"));
    }

}
