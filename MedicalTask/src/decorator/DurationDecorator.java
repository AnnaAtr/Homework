package decorator;

public class DurationDecorator extends SymptomsDecorator {
    private String duration;

    public DurationDecorator(Symptoms symptoms, String duration) {
        super(symptoms);
        this.duration = duration;
    }

    @Override
    public String describe() {
        return wrappedSymptoms.describe() + ", длится " + duration;
    }
}