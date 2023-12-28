package task_1;

import java.util.Scanner;

public class Solution {
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
                    2. Просмотреть заказы
                    3. Изменить статус заказа
                    0. Завершить""");
            int command = scanner.nextInt();
            if (command == 0) {
                break;
            } else if (command == 1) {
                showUsers();
                System.out.println("Введите номер пользователя: ");
                int userIndex = scanner.nextInt();

                showProducts();
                System.out.println("Введите номер товара: ");
                int productIndex = scanner.nextInt();

                User user = getUser(userIndex);
                Product product = getProduct(productIndex);

                addOrder(new Order(user, product));
            } else if (command == 2) {
                showOrders(false);
            } else if (command == 3) {
                showOrders(true);

                System.out.println("Введите номер заказа: ");
                int orderIndex = scanner.nextInt();

                Order order = getOrder(orderIndex);

                showStatuses();

                System.out.println("Введите номер статуса: ");
                int statusIndex = scanner.nextInt();
                Status oldStatus = order.getStatus();
                order.setStatus(getStatus(statusIndex));
                System.out.printf("Статус заказа был изменен '%s' -> '%s'\n", oldStatus, order.getStatus());
            }
            System.out.println();

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

    static User getUser(int index) {
        return users[index - 1];
    }

    static Product getProduct(int index) {
        return products[index - 1];
    }

    static Status getStatus(int index) {
        return Status.values()[index - 1];
    }

    static Order getOrder(int index) {
        return orders[index - 1];
    }

    static void showOrders(boolean enumerate) {
        int counter = 0;
        System.out.println("\nЗаказы:");
        for (Order order : orders) {
            if (order == null) continue;

            counter++;
            User user = order.getUser();
            Product product = order.getProduct();

            String fullName = user.getName() + " " + user.getLastname();

            if (enumerate) {
                System.out.print(counter + ". ");
            }else {
                System.out.print(" - ");
            }
            System.out.println("Пользователь: " + fullName);
            System.out.println("   Товар: " + product.getName());
            System.out.println("   Статус: " + order.getStatus());
            System.out.println();
        }
    }

    static void showUsers() {
        for (int i = 0; i < users.length; i++) {
            User user = users[i];
            System.out.println(i + 1 + ". " + user.getName() + " " + user.getLastname());
        }
    }

    static void showProducts() {
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(i + 1 + ". " + product.getName());
        }
    }

    static void showStatuses() {
        for (int i = 0; i < Status.values().length; i++) {
            System.out.println(i + 1 + ". " + Status.values()[i]);
        }
    }
}
