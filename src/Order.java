public class Order {
    private String id;
    private int itemCount;
    private double itemCost;
    private double totalPrice;
    private double shippingCost;

    // Constructeur
    public Order(String id) {
        // Implémentation du constructeur
    }

    // Méthode pour ajouter un article
    public void addItem(double price) {
        // Implémentation de la méthode
    }

    // Méthodes pour ajouter et supprimer des observateurs
    public void addObserver(OrderObserver observer) {
        // Implémentation de la méthode
    }

    public void removeObserver(OrderObserver observer) {
        // Implémentation de la méthode
    }

    // Méthode pour notifier les observateurs
    private void notifyObservers() {
        // Implémentation de la méthode
    }

    // Getters et setters
    public String getId() {
        return id;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getItemCost() {
        return itemCost;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }
}
