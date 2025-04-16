public class Sheep implements Animal {
    int legs;
    String sound;
    String food;
    String name;

    public Sheep() {
        this.legs = 4;
        this.sound = "Baa";
        this.food = "Grass";
    }

    public Sheep(String name) {
        this();
        this.name = name;
    }

    @Override
    public Animal clone() {
        return new Sheep(this.name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " says " + sound);
    }

    @Override
    public String getType() {
        return "Sheep";
    }
}
