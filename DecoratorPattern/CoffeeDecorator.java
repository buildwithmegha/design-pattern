// CoffeeDecorator.java
public abstract class CoffeeDecorator implements Coffee {
    protected Coffee coffee;  // the wrapped object

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
