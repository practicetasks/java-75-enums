package example_without_enum;

public class Main {
    static final Season winter = new Season("Зима");
    static final Season spring = new Season("Весна");
    static final Season summer = new Season("Лето");
    static final Season fall = new Season("Осень");

    static final Season[] seasons = {winter, spring, summer, fall};

    public static void main(String[] args) {
        for (Season season : seasons) {
            System.out.println(season.getName());
        }
    }

//    public static void main(String[] args) {
//
//        Event event1 = new Event(spring);
//        Event event2 = new Event(spring);
//
//
//        System.out.println(event1.getSeason().equals(event2.getSeason()));
//    }

//    public static void main(String[] args) {
//
//        Event event1 = new Event(new Season("Зима"));
//        Event event2 = new Event(new Season("Зима"));
//
//        System.out.println(event1.getSeason().equals(event2.getSeason()));
//    }
//    public static void main(String[] args) {
//        Season winter = new Season("Зима");
//        Season spring = new Season("Весна");
//        Season summer = new Season("Лето");
//        Season fall = new Season("Осень");
//
//        Season[] seasons = {winter, spring, summer, fall};
//
//        for (Season season : seasons) {
//            System.out.println(season.getName());
//        }
//    }
}
