package uqbar.scala.ejemplos.scala.conversor.vista

import org.uqbar.arena.windows.MainWindow
import org.uqbar.arena.widgets.Panel
import uqbar.scala.ejemplos.scala.conversor.modelo.Conversor
import uqbar.scala.ejemplos.scala.conversor.modelo.Conversor
import org.uqbar.arena.widgets.TextBox

class ConversorWindow extends MainWindow[Conversor](new Conversor()) {

  def createContents(parent: Panel): Unit = {
    parent.addChild(new TextBox(parent));
  }
}

object ConversorRunner extends App {
  new ConversorWindow().open();
}