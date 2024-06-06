
import static org.junit.Assert.*;

import com.example.School;
import org.junit.Test;

public class SchoolTest {


    @Test
    public void test() {
        School school = new School();
        assertEquals("Sing song", school.singSong());
    }

}
