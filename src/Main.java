public class Main {
    public static void main(String[] args) {

        var basePizza=new Pizza(true);
        basePizza.addExtraToppings();
        basePizza.addExtraCheese();
        basePizza.takeAway();
        basePizza.getBill();

    }
}