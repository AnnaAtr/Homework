package decorator;

public class SeverityDecorator extends SymptomsDecorator {
    private String severity;

    public SeverityDecorator(Symptoms symptoms, String severity) {
        super(symptoms);
        this.severity = severity;
    }

    @Override
    public String describe() {
        return wrappedSymptoms.describe() + ", тяжесть: " + severity;
    }
}