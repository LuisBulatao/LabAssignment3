public class Order {
    private String item;
    private Integer quantity;
    private Double unitPrice;
    private Double totalAmount;
    private  PaymentMode newMode;




    public Order(String item, Integer quantity, Double unitPrice, PaymentMode newMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalAmount = (quantity * unitPrice - (newMode.determineDiscountRate()));
        this.newMode = newMode;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        Double amount = quantity * unitPrice;
        totalAmount = amount - (newMode.determineDiscountRate() * amount);

    }

    public PaymentMode getNewMode() {
        return newMode;
    }

    public void setNewMode(PaymentMode newMode) {
        this.newMode = newMode;
    }
}