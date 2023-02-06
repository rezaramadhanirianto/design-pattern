package behavioral.visitor;

/**
 * For example, think of a Shopping cart where we can add different type of items (Elements).
 * When we click on checkout button, it calculates the total amount to be paid.
 * **/
public class App {
    public static void main(String[] args) {
        ItemElement[] items = new ItemElement[]{new Book(20, "1234"),new Book(100, "5678"),
                new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")};

        int total = ShoppingCartClient.calculatePrice(items);
        System.out.println("Total Cost = "+total);
    }
}
