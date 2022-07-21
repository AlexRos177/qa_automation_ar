import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {
    @BeforeMethod(alwaysRun = true)
    public void startTest() {
        System.out.println("Tests started!");
    }

    @AfterTest(alwaysRun = true)
    public void testFinish() {
        System.out.println("Tests are finished!");
    }
    @Test
    public void testAddMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.add(17, 10), 27.00);
    }
    @Test
    public void testSubstractMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.substract(27, 10), 17.00);
    }
    @Test
    public void testDivideMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.divide(70, 10),  7.00);
    }
    @Test
    public void testMultiplyMethod() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.multiply(7, 10), 70.00);
    }

}


