package chain;

public class ReferralCheckHandler extends AppointmentHandler {
    @Override
    public void handle(AppointmentRequest request) {
        if (!request.hasReferral()) {
            System.out.println("Пациент " + request.getPatientName() + ": Нет направления — приём запрещён.");
            return;
        }
        if (next != null) next.handle(request);
    }
}
