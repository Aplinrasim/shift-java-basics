package homework18;

public class LogicalOperationTable {
    public static void main(String[] arge) {
        boolean P, Q;
        boolean PT = true, PF = false;
        boolean QT = true, QF = false;

        System.out.println("P\t\tQ\t\tP AND Q\t\tP OR Q\tP XOR Q\t\tNOT P");
        P = PF;
        Q = QF;
        System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t\t" + (P | Q) + "\t" + (P ^ Q) + "\t\t" + (!P));

        P = PT;
        Q = QF;
        System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t\t" + (P | Q) + "\t" + (P ^ Q) + "\t\t" + (!P));

        P = PF;
        Q = QT;
        System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t\t" + (P | Q) + "\t" + (P ^ Q) + "\t\t" + (!P));

        P = PT;
        Q = QT;
        System.out.println(P + "\t" + Q + "\t" + (P & Q) + "\t\t" + (P | Q) + "\t" + (P ^ Q) + "\t\t" + (!P));
    }
}