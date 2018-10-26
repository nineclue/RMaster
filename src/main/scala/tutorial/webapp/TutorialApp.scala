package tutorial.webapp

import org.scalajs.dom
import dom.document
import scala.scalajs.js.annotation.JSExportTopLevel

object TutorialApp {
  val msg = "안녕하세요, 여러분!"
  val msgBtn = "버튼을 누르셨군요!"
  def main(args: Array[String]): Unit = {
    appendPar(document.body, msg)
  }

  def appendPar(targetNode: dom.Node, text: String) = {
    val parNode = document.createElement("p")
    val textNode = document.createTextNode(text)
    parNode.appendChild(textNode)
    targetNode.appendChild(parNode)
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage() = {
    appendPar(document.body, msgBtn)
  }
}
