package homework18;

public class LogicalOperationTable {
    public static void main(String[] arge) {
        boolean p, q;
        boolean pTrue = true, pFalse = false;
        boolean qTrue = true, qFalse = false;

        System.out.println("P\t\tQ\t\tP AND Q\t\tP OR Q\tP XOR Q\t\tNOT P");
        p = pFalse;
        q = qFalse;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t\t" + (p | q) + "\t" + (p ^ q) + "\t\t" + (!p));

        p = pTrue;
        q = qFalse;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t\t" + (p | q) + "\t" + (p ^ q) + "\t\t" + (!p));

        p = pFalse;
        q = qTrue;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t\t" + (p | q) + "\t" + (p ^ q) + "\t\t" + (!p));

        p = pTrue;
        q = qTrue;
        System.out.println(p + "\t" + q + "\t" + (p & q) + "\t\t" + (p | q) + "\t" + (p ^ q) + "\t\t" + (!p));
    }
}