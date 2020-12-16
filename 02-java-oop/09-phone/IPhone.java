public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unLock() {
        return this.getCarrier() + " phone unlocked";
    }

    @Override
    public void displayInfo() {
        System.out.println(this.getVersionNumber());
        System.out.println(this.getbatteryPercentage());
        System.out.println(this.getCarrier());
        System.out.println(this.getRingTone());
    }
}

