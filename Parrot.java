public class Parrot extends Animal implements Pet, Bird {
    private String superFamily;

    public Parrot(String superFamily) {
        this.superFamily = superFamily;
    }

    public String getSuperFamily() {
        return this.superFamily;
    }

    @Override
    public void playWith() {
        System.out.println(this.getName() + " is playing with rope");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flying");
    }

    @Override
    public String toString() {
        return "Its superfamily is: " + this.getSuperFamily() + "\n"
                + "Its age is: " + this.getAge() + "\n"
                + "Its habitat is: " + this.getHabitat();
    }
}
