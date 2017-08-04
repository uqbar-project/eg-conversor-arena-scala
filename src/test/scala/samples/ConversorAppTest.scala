package samples

import org.junit._
import Assert._
import uqbar.scala.ejemplos.scala.conversor.modelo.Conversor

@Test
class ConversorAppTest {

    @Test
    def convertirDeMillasAKilometros() = {
      val conversor = new Conversor()
      conversor.millas = 1
      conversor.convertir
      assertEquals(1 * conversor.Factor_conversion_millas_kilometros, conversor.kilometros, 10)
    }
    
}


