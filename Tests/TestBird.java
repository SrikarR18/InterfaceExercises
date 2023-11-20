
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class TestBird {
    @Test
    public void TestSounds(){
        Animal b = new Bird();
        assertEquals("Chirp",b.makeSound());
    }

    @Test
    public void TestMove(){
        Animal b = new Bird();
        assertEquals("I am Flying",b.move());
    }



}
