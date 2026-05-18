package homework18;

public class TaskForParrots {
    public static void main(String[] args) {
        double lengthSnake = 380; //длина удава в см
        double lengthParrots=lengthSnake/38; //длина попугая в сантиметрах
        double lengthMonkey=lengthSnake/5; //длина мартышки в сантиметрах
        double lengthElephant=lengthSnake/2; //длина слона в сантиметрах
        double summ=lengthSnake+lengthParrots+lengthMonkey+lengthElephant; //суммарный рост всех персонажей

        System.out.println("Длина удава " + (lengthSnake/100) + "метров");
        System.out.println("Длина попугая " + (lengthParrots/100) + "метров");
        System.out.println("Длина мартышки " + (lengthMonkey/100) + "метров");
        System.out.println("Длина слона " + (lengthElephant/100) + "метров");
        System.out.println("Суммарная длина персонажей " + (summ/100) + "метров");

    }

}
