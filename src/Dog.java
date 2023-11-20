public class Dog implements Animal, Devilish{
    @Override
    public String makeSound() {
        return "Bark";
    }

    @Override
    public String move() {
        return "I am Running";
    }

    @Override
    public String misbehave(String s) {
        return "I chewed up your "+ s;

    }
}
