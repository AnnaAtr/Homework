package proxy;

public class ProxyMedicalRecord implements MedicalRecord {
    private RealMedicalRecord realRecord;
    private String patientName;
    private boolean hasAccess;

    public ProxyMedicalRecord(String patientName, boolean hasAccess) {
        this.patientName = patientName;
        this.hasAccess = hasAccess;
    }

    @Override
    public void viewRecord() {
        if (!hasAccess) {
            System.out.println("Доступ к карте пациента " + patientName + " запрещён.");
            return;
        }
        if (realRecord == null) {
            realRecord = new RealMedicalRecord(patientName);
        }
        realRecord.viewRecord();
    }
}