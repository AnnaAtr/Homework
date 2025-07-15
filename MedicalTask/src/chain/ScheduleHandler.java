package chain;

public class ScheduleHandler extends AppointmentHandler {
    @Override
    public void handle(AppointmentRequest request) {
        System.out.println("Пациент " + request.getPatientName() + ": Записан на приём.");
    }
}
