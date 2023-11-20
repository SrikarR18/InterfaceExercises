public class AnimalDriver {
    public static void main(String[] args) {
        Animal Dog1 = new Dog();
        Animal Bird1 = new Bird();

        System.out.println(Dog1.makeSound());
        System.out.println(Bird1.makeSound());

        System.out.println(Dog1.move());
        System.out.println(Bird1.move());

        String s = "Homework";
        System.out.println(((Dog) Dog1).misbehave(s));
    }
}
