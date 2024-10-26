public class ConcreteObserver implements Observer {
    private int observerState;

    @Override
    public void update(int state) {
        this.observerState = state;
    }

    public int getObserverState() {
        return observerState;
    }
}