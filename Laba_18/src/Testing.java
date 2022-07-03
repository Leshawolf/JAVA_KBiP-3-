import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.Executor;

/**
 * Класс для тестов.
 * @author Алексей Волчек
 * @version 1.0
 */

public class Testing {
    @Test
    public void TestOnNull()
    {
        int[][] a = new int[0][0];
        var actualMatr = Main.func(a,0,0);
        Assert.assertNotEquals(10,actualMatr);
    }
    @Test
    public void TestValues()
    {
        int[][] a = {{11,4,2,15},{17,8,8,3},{8,9,20,3},{1,11,9,4}};
        var actualMatr = Main.createMatrix(4,4);
        Assert.assertNotEquals(100.456,actualMatr);
    }
    @Test
    public void TestValuesString()
    {
        int[][] a = new int[0][0];
        var actualMatr = Main.func(a,0,0);
        Assert.assertNotEquals("23123",actualMatr);
    }
    @Test
    public void TestNotNullCreate()
    {
        var actualMatr = Main.createMatrix(0,0);
        Assert.assertNull(actualMatr);
    }
    @Test
    public void TestOnNullCreate()
    {
        var actualMatr = Main.createMatrix(0,0);
        Assert.assertNull(actualMatr);
    }

}
