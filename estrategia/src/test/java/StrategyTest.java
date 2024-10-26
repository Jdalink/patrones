import org.junit.Test;
import static org.junit.Assert.*;

public class StrategyTest {

    @Test
    public void testStrategy() {
        Context context = new Context();

        context.setStrategy(new ConcreteStrategyAdd());
        assertEquals(5, context.executeStrategy(2, 3));

        context.setStrategy(new ConcreteStrategyMultiply());
        assertEquals(6, context.executeStrategy(2, 3));
    }
}
