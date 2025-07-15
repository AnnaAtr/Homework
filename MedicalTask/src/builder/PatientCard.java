package builder;

public class PatientCard {
    private String name;
    private int age;
    private String diagnosis;
    private String medication;

    private PatientCard(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.diagnosis = builder.diagnosis;
        this.medication = builder.medication;
    }

    public static class Builder {
        private String name;
        private int age;
        private String diagnosis;
        private String medication;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setDiagnosis(String diagnosis) {
            this.diagnosis = diagnosis;
            return this;
        }

        public Builder setMedication(String medication) {
            this.medication = medication;
            return this;
        }

        public PatientCard build() {
            return new PatientCard(this);
        }
    }

    @Override
    public String toString() {
        return "Пациент: " + name + ", возраст: " + age + ", диагноз: " + diagnosis + ", лечение: " + medication;
    }
}