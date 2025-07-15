package proxy;

public class RealMedicalRecord implements MedicalRecord {
    private String patientName;

    public RealMedicalRecord(String patientName) {
        this.patientName = patientName;
        loadRecord();
    }

    private void loadRecord() {
        System.out.println("Загрузка медицинской карты пациента " + patientName);
    }

    @Override
    public void viewRecord() {
        System.out.println("Просмотр медицинской карты пациента " + patientName);
    }
}