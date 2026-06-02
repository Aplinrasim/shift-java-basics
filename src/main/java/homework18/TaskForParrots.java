package homework18;

public class TaskForParrots {
    public static void main(String[] args) {
        double lengthSnakeCm = 380;
        double lengthParrotsCm =lengthSnakeCm/38;
        double lengthMonkeyCm=lengthSnakeCm/5;
        double lengthElephantCm=lengthSnakeCm/2;
        double summCm=lengthSnakeCm+lengthParrotsCm+lengthMonkeyCm+lengthElephantCm;

        System.out.println("Длина удава " + (lengthSnakeCm/100) + "метров");
        System.out.println("Длина попугая " + (lengthParrotsCm/100) + "метров");
        System.out.println("Длина мартышки " + (lengthMonkeyCm/100) + "метров");
        System.out.println("Длина слона " + (lengthElephantCm/100) + "метров");
        System.out.println("Суммарная длина персонажей " + (summCm/100) + "метров");

    }

}
