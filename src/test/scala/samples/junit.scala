package samples

import org.junit._
import Assert._
import uqbar.scala.ejemplos.scala.conversor.modelo.Conversor

@Test
class AppTest {

    @Test
    def testOK() = assertTrue(true)

    @Test
    def convertirDeMillasAKilometros() = {
      var conversor = new Conversor();
      conversor.millas = 1;
      conversor.convertir;
      assertEquals(1 * conversor.factor_conversion_millas_kilometros, conversor.kilometros, 10);
    }
    
}


