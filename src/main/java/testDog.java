import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class testDog {
    Dog dog = new Dog();
    @Test
    public void testScream() {
        dog.setScream("Woof!");
        assertEquals("Woof!",dog.getScream());

    }
}