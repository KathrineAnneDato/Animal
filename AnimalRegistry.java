public class AnimalRegistry {
    public Sheep sheepPrototype = new Sheep("DefaultSheep");
    public Cow cowPrototype = new Cow();
    public Horse horsePrototype = new Horse();

    public Animal createSheep(String name) {
        Sheep clonedSheep = (Sheep) sheepPrototype.clone();
        clonedSheep.name = name;
        return clonedSheep;
    }

    public Animal createCow() {
        return cowPrototype.clone();
    }

    public Animal createHorse() {
        return horsePrototype.clone();
    }
}
