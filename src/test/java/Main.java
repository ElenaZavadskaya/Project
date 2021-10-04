import aquality.selenium.core.logging.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Main {
    @Test
    public void test(){
        Logger.getInstance().info("Executing test 1");
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        String actual = "str";
        String expected = "str";
        Assert.assertEquals(actual, expected, "Messages are not equal");
    }

    @Test
    public void test2(){
        Logger.getInstance().info("Executing test 2");
        boolean actual = true;
        boolean expected = true;
        Assert.assertEquals(actual, expected, "Values are not equal");
    }
}
