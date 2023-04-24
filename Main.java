public class Main {
    public static void main(String[] args) {
        Dog cerberus = new Dog("mastiff");
        cerberus.setName("cerberus");
        cerberus.setAge(300);
        cerberus.setHabitat("the third circle");
        cerberus.setType(AnimalType.MAMMAL);
        cerberus.playWith();
        System.out.println(cerberus);

        System.out.println("\n");

        Parrot iago = new Parrot("Cacatuoidea");
        iago.setName("iago");
        iago.setAge(20);
        iago.setHabitat("palace of Agrabah");
        iago.setType(AnimalType.BIRD);
        iago.playWith();
        iago.fly();
        System.out.println(iago);
    }
}