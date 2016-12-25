package gojava.gojava5.module7;

public class Order implements Comparable<Order> {
    private long id;
    private int price;
    private Currency currency;
    private String itemName;
    private String shopIdentificator;
    private User user;

    public Order(long id, int price, Currency currency, String itemName, String shopIdentificator, User user) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.itemName = itemName;
        this.shopIdentificator = shopIdentificator;
        this.user = user;
    }

    @Override
    public int compareTo(Order order) {
        if (this.getPrice() - order.getPrice() < 0) {
            return -1;
        } else if (this.getPrice() - order.getPrice() == 0) {
            return 0;
        }
        return 1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Order{");
        sb.append("id = ").append(id + ",\t");
        sb.append("price = ").append(price + ",\t");
        sb.append("currency = ").append(currency + ",\t");
        sb.append("itemName = ").append(itemName + ",\t");
        sb.append("shopIdentificator = ").append(shopIdentificator + ",\t");
        sb.append("user city = ").append(user.getCity() + "}" + "\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Order)) {
            return false;
        }

        Order order = (Order) obj;

        if (getId() != order.getId()) {
            return false;
        }
        if (getPrice() != order.getPrice()) {
            return false;
        }
        if (getCurrency() != order.getCurrency()) {
            return false;
        }
        if (!getItemName().equals(order.getItemName())) {
            return false;
        }
        if (!getShopIdentificator().equals(order.getShopIdentificator())) {
            return false;
        }
        return getUser().equals(order.getUser());
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getPrice();
        result = 31 * result + getCurrency().hashCode();
        result = 31 * result + getItemName().hashCode();
        result = 31 * result + getShopIdentificator().hashCode();
        result = 31 * result + getUser().hashCode();
        return result;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getShopIdentificator() {
        return shopIdentificator;
    }

    public void setShopIdentificator(String shopIdentificator) {
        this.shopIdentificator = shopIdentificator;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}