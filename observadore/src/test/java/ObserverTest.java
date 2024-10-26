import org.junit.Test;
import static org.junit.Assert.*;

public class ObserverTest {

    @Test
    public void testObserver() {
        ConcreteSubject subject = new ConcreteSubject();
        ConcreteObserver observer = new ConcreteObserver();

        subject.registerObserver(observer);
        subject.setState(10);

        assertEquals(10, observer.getObserverState());
    }
}
