package example_with_enum;

public class Main {
    public static void main(String[] args) {
        Event event = new Event(Season.WINTER);
        Event event1 = new Event(Season.SPRING);
        System.out.println(event.getSeason() == event1.getSeason());
//        for (Season season : Season.values()) {
//            System.out.println(season);
//        }
    }
}

// User (name, lastname)
// Product (name, price)
// Status (NEW, IN_PROGRESS, DONE)

// Order (Status, User, Product)
// OrderSimulator main

