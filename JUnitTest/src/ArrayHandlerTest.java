import org.junit.BeforeClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.Assert.assertTrue;

public class ArrayHandlerTest {
    private ArrayHandler ah;
    String[] testarr;

    @BeforeClass
    public void init(){
        ah = new ArrayHandler();
        testarr = ah.getArray();
    }

    @Test
    public void testMain(){
       ArrayHandler ah = new ArrayHandler();
       ah.setArray(new String[1]);
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            String testStr = ah.getArray()[2];
        });
    }

    @ParameterizedTest
    @ValueSource(ints = {0,1}) // six numbers
    void shouldCast(int number) {
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()-> {
            String[] testStr = new String[number];
           String t = testStr[2];
        });
    }

}