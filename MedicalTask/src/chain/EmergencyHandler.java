package chain;

public class EmergencyHandler extends AppointmentHandler {
    @Override
    public void handle(AppointmentRequest request) {
        if (request.isEmergency()) {
            System.out.println("Пациент " + request.getPatientName() + ": Приём срочный — приоритет!");
            return;
        }
        if (next != null) next.handle(request);
    }
}