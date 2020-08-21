import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayHandlerTest {

    @Test
    public void testMain(){
       ArrayHandler ah = new ArrayHandler();
       ah.setArray(new String[1]);
       String[] testarr = ah.getArray();

        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            String testStr = testarr[2];
        });
    }

}