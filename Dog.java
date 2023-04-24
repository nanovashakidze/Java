public class Dog extends Animal implements Pet {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    public void playWith() {
        System.out.println(this.getName() + "  plays with hell fire");
    }

    @Override
    public String toString() {
        return "Its breed originates from: " + this.getBreed() + "\n"
                + "Its age is: " + this.getAge() + "\n"
                + "Its habitat is: " + this.getHabitat();
    }
}
