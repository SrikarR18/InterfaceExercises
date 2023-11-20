
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestDog {
    @Test
    public void TestSounds(){
        Animal d = new Dog();
        assertEquals("Bark",d.makeSound());
    }

    @Test
    public void TestMove(){
        Animal d = new Dog();
        assertEquals("I am Running",d.move());
    }

    @Test
    public void TestMisbehave(){
        Animal d = new Dog();
        String s = "HomeWork";
        assertEquals("I chewed up your "+ s,((Dog) d).misbehave(s));

    }


}
