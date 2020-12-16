public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unLock() {
        return this.getVersionNumber() + " phone is unlocked";
    }
    @Override
    public void displayInfo() {
        System.out.println(this.getVersionNumber());
        System.out.println(this.getbatteryPercentage());
        System.out.println(this.getCarrier());
        System.out.println(this.getRingTone());
    }
}

