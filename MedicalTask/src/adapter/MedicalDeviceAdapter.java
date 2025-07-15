package adapter;

public class MedicalDeviceAdapter implements MedicalDevice {
    private EuropeanSocket socket;

    public MedicalDeviceAdapter(EuropeanSocket socket) {
        this.socket = socket;
    }

    @Override
    public void powerOn() {
        socket.supplyPower();
    }
}