package chain;

public class AppointmentRequest {
    private String patientName;
    private boolean hasReferral;
    private boolean isEmergency;

    public AppointmentRequest(String patientName, boolean hasReferral, boolean isEmergency) {
        this.patientName = patientName;
        this.hasReferral = hasReferral;
        this.isEmergency = isEmergency;
    }

    public String getPatientName() {
        return patientName;
    }

    public boolean hasReferral() {
        return hasReferral;
    }

    public boolean isEmergency() {
        return isEmergency;
    }
}