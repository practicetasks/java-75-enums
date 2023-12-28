package task_1;

import java.util.Scanner;

public class OrderSimulator {

    static User[] users = {
            new User("John", "Doe"),
            new User("Will", "Smith"),
            new User("Dylan", "Johns"),
            new User("Matt", "Damon"),
    };

    static Product[] products = {
            new Product("Marshall IV Major", 179),
            new Product("Iphone XR", 269),
            new Product("MacBook Pro", 1219),
            new Product("Nike Air Mag", 199990),
    };

    static Order[] orders = new Order[10];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    1. Совершить заказ
                    2. Вывести все заказы
                    3. Изменить статус заказа
                    0. Завершить""");
            int command = scanner.nextInt();
            if (command == 1) {
                showUsers();
                System.out.println("Введите номер пользователя: ");
                int userIndex = scanner.nextInt();
                User user = users[userIndex - 1];

                System.out.println("Введите номер товара: ");
                int productIndex = scanner.nextInt();
                Product product = products[productIndex - 1];


                Order order = new Order(user, product);
                addOrder(order);

            } else if (command == 2) {
                // Просмотр заказов
                for (Order order : orders) {
                    System.out.println(order.getUser().getName());
                    System.out.println(order.getProduct().getName());
                    System.out.println(order.getStatus());
                    System.out.println();
                }
            } else if (command == 3) {

            } else if (command == 0) {
                break;
            }
        }
    }

    static void addOrder(Order order) {
        for (int i = 0; i < orders.length; i++) {
            if (orders[i] == null) {
                orders[i] = order;
                System.out.println("Заказ принят");
                return;
            }
        }
        System.out.println("Заказ не был совершен");
    }

    static void showUsers() {
        for (int i = 0; i < users.length; i++) {
            System.out.println(i + 1 + ". " + users[i].getName() + " " + users[i].getLastname());
        }
    }

}
