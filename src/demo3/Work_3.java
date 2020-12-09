package demo3;

public class Work_3 {
    public static void main(String[] args) {
        IphoneX iphonex = new IphoneX("iphoneX 15");
        Nokia nokia = new Nokia("nokia 15");
        Panasonic panasonic = new Panasonic("panasonic 15");
        SamsungNote samsungNote = new SamsungNote("samsungNOte 15");
        printSmartphone(iphonex);
        printSmartphone(samsungNote);
        printSimbian(nokia);
        printSimbian(panasonic);

    }

    public static <E extends Smartphone> void printSmartphone(E e) {
        System.out.println(e);
    }

    public static <E extends Simbian> void printSimbian(E e) {
        System.out.println(e);
    }
}
