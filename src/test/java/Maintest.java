
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.*;

public class Maintest {
    @Test
    @DisplayName("Should check test")
    public void sumatest(){
        int a=555;
        int b=222;
        assertEquals (777,Main.suma(a,b));
        System.out.println("el test funciona");
    }

}
