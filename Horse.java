public class Horse implements Animal {
    int legs;
    String sound;
    String food;
    String color;

    public Horse() {
        this.legs = 4;
        this.sound = "Neigh";
        this.food = "Barley";
        this.color = "White";
    }

    @Override
    public Animal clone() {
        return new Horse();
    }

    @Override
    public void makeSound() {
        System.out.println("Horse says " + sound);
    }

    @Override
    public String getType() {
        return "Horse";
    }
}
