package uqbar.scala.ejemplos.scala.conversor.modelo

import org.uqbar.commons.model.annotations.Observable

/**
 * Esta clase realiza la conversion de millas a kilometros
 */

@Observable
class Conversor {
	var millas = 0.0
	var kilometros = 0.0
	val Factor_conversion_millas_kilometros = 1.609344
	
	def convertir() = {
	  kilometros = millas * Factor_conversion_millas_kilometros 
	}
	
}