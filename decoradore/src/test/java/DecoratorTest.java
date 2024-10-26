import org.junit.Test;
import static org.junit.Assert.*;

public class DecoratorTest {

    @Test
    public void testDecorator() {
        Component component = new ConcreteComponent();
        Component decorated = new ConcreteDecoratorA(component);

        assertEquals("ConcreteDecoratorA(ConcreteComponent)", decorated.operation());
    }
}
