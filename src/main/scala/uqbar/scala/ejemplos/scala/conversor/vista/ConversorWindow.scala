package uqbar.scala.ejemplos.scala.conversor.vista

import java.awt.Color

import org.uqbar.arena.Application
import org.uqbar.arena.layout.VerticalLayout
import org.uqbar.arena.widgets.Button
import org.uqbar.arena.widgets.Label
import org.uqbar.arena.widgets.Panel
import org.uqbar.arena.widgets.TextBox
import org.uqbar.arena.windows.SimpleWindow
import org.uqbar.arena.windows.Window
import org.uqbar.arena.windows.WindowOwner

import uqbar.scala.ejemplos.scala.conversor.modelo.Conversor
import org.uqbar.lacar.ui.model.Action
import org.uqbar.arena.widgets.NumericField
import org.uqbar.arena.scala.ArenaScalaImplicits.closureToAction

/**
 * 
 * @author uqbar
 */
class ConversorSimpleWindow(owner:WindowOwner) extends SimpleWindow[Conversor](owner, new Conversor()) {

	override def addActions(actionsPanel:Panel): Unit = { 
		new Button(actionsPanel) //
			.setCaption("Convertir a kilómetros")
			.onClick  { () => getModelObject.convertir }
	}

	override def createFormPanel(mainPanel:Panel ) {
		this.setTitle("Conversor de millas a kilómetros")
		mainPanel.setLayout(new VerticalLayout())

		new Label(mainPanel).setText("Ingrese la longitud en millas")

		new NumericField(mainPanel).bindValueToProperty("millas")

		new Label(mainPanel) //
			.setBackground(Color.ORANGE)
			.bindValueToProperty("kilometros")

		new Label(mainPanel).setText(" kilómetros")
	}
}

object ConversorRunner extends Application with App {
	def createMainWindow():Window[_] = new ConversorSimpleWindow(this)
	start()
}