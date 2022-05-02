import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void addIntTest() {
        assertEquals(3, SkillDemo.addInt(1, 1));
    }
}
