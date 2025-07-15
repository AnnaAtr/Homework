import strategy.CardPayment;
import strategy.ClinicBilling;
import strategy.InsurancePayment;

import chain.AppointmentRequest;
import chain.ReferralCheckHandler;
import chain.EmergencyHandler;
import chain.ScheduleHandler;

import builder.PatientCard;

import proxy.MedicalRecord;
import proxy.ProxyMedicalRecord;

import decorator.Symptoms;
import decorator.BasicSymptoms;
import decorator.DurationDecorator;
import decorator.SeverityDecorator;

import adapter.EuropeanSocket;
import adapter.MedicalDevice;
import adapter.MedicalDeviceAdapter;

public class Main {
    public static void main(String[] args) {
        ClinicBilling billing = new ClinicBilling();
        billing.setPaymentStrategy(new CardPayment());
        billing.processPayment(2500);
        billing.setPaymentStrategy(new InsurancePayment());
        billing.processPayment(10000);

        AppointmentRequest request1 = new AppointmentRequest("Маша", true, false);
        AppointmentRequest request2 = new AppointmentRequest("Ваня", false, false);
        AppointmentRequest request3 = new AppointmentRequest("Катя", true, true);

        ReferralCheckHandler referralCheck = new ReferralCheckHandler();
        EmergencyHandler emergency = new EmergencyHandler();
        ScheduleHandler schedule = new ScheduleHandler();

        referralCheck.setNext(emergency);
        emergency.setNext(schedule);

        referralCheck.handle(request1);
        referralCheck.handle(request2);
        referralCheck.handle(request3);

        PatientCard card = new PatientCard.Builder()
                .setName("Иван Иванов")
                .setAge(7)
                .setDiagnosis("ОРВИ")
                .setMedication("Парацетамол, обильное питьё")
                .build();
        System.out.println(card);

        MedicalRecord record = new ProxyMedicalRecord("Петя", false);
        record.viewRecord();
        record = new ProxyMedicalRecord("Петя", true);
        record.viewRecord();

        Symptoms symptoms = new BasicSymptoms("Кашель и насморк");
        symptoms = new DurationDecorator(symptoms, "3 дня");
        symptoms = new SeverityDecorator(symptoms, "средняя");
        System.out.println("Симптомы: " + symptoms.describe());

        EuropeanSocket socket = new EuropeanSocket();
        MedicalDevice device = new MedicalDeviceAdapter(socket);
        device.powerOn();
    }
}