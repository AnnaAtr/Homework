package decorator;

public class BasicSymptoms implements Symptoms {
    private String symptoms;

    public BasicSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    @Override
    public String describe() {
        return symptoms;
    }
}
