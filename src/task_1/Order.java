package task_1;

public class Order {
    private User user;
    private Product product;
    private Status status;

    public Order(User user, Product product) {
        this.user = user;
        this.product = product;
        this.status = Status.NEW;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
