package chain;

public abstract class AppointmentHandler {
    protected AppointmentHandler next;

    public void setNext(AppointmentHandler next) {
        this.next = next;
    }

    public abstract void handle(AppointmentRequest request);
}
