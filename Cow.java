public class Cow implements Animal {
    int legs;
    String sound;
    String food;

    public Cow() {
        this.legs = 4;
        this.sound = "Moo";
        this.food = "Hay";
    }

    @Override
    public Animal clone() {
        return new Cow();
    }

    @Override
    public void makeSound() {
        System.out.println("Cow says " + sound);
    }

    @Override
    public String getType() {
        return "Cow";
    }
}
