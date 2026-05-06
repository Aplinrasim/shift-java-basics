package homework18;

public class TaskForParrots {
    public static void main(String[] args) {
        double x = 380; //длина удава в см
        double y=x/38; //длина попугая в сантиметрах
        double z=x/5; //длина мартышки в сантиметрах
        double w=x/2; //длина слона в сантиметрах
        double summ=x+y+z+w; //суммарный рост всех персонажей

        System.out.println("Длина удава " + (x/100) + "метров");
        System.out.println("Длина попугая " + (y/100) + "метров");
        System.out.println("Длина мартышки " + (z/100) + "метров");
        System.out.println("Длина слона " + (w/100) + "метров");
        System.out.println("Суммарная длина персонажей " + (summ/100) + "метров");

    }

}
