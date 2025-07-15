package decorator;

public abstract class SymptomsDecorator implements Symptoms {
    protected Symptoms wrappedSymptoms;

    public SymptomsDecorator(Symptoms symptoms) {
        this.wrappedSymptoms = symptoms;
    }
}