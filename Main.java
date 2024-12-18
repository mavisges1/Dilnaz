public class Main {
    public static void main(String[] args) {
        class MenuItem {
            private final String name;
            private final double price;

            public MenuItem(String name, double price) {
                this.name = name;
                this.price = price;
            }

            public String getMenuItem() {
                return "Menu Item: " + name + ", Price: ₸" + price;
            }
        }

        class Order {
            private final String items;
            private final double total;

            public Order(String items, double total) {
                this.items = items;
                this.total = total;
            }

            public String getOrder() {
                return "Order: " + items + ", Total: ₸" + total;
            }
        }

        class Restaurant {
            private final String name;
            private final String location;

            public Restaurant(String name, String location) {
                this.name = name;
                this.location = location;
            }

            public String getRestaurant() {
                return "Restaurant: " + name + ", Location: " + location;
            }
        }

        MenuItem menuItem = new MenuItem("KHINKALI WITH BEEF", 3800);
        Order order = new Order("KHINKALI WITH BEEF, FRENCH FRIES", 5500);
        Restaurant restaurant = new Restaurant("Daredzhani", "Mega SilkWay");

        System.out.println(menuItem.getMenuItem());
        System.out.println(order.getOrder());
        System.out.println(restaurant.getRestaurant());
    }
}
