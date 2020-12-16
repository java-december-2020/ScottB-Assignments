public class PhoneTest {
    public static void main(String[] args) {
        Galaxy s9 = new Galaxy("S9", 99, "Verizon", "Ring, Ring");
        IPhone iPhoneTen = new IPhone("X", 100, "Apple", "Ding, Dong");

        s9.displayInfo();
        System.out.println(s9.unLock());
        System.out.println(s9.ring());

        iPhoneTen.displayInfo();
        System.out.println(iPhoneTen.unLock());
        System.out.println(iPhoneTen.ring());
    }
}