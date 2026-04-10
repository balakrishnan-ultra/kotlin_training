import javax.swing.*
import java.awt.*
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
fun JTextField.addHoverEffect(hoverColor: Color, defaultColor: Color = Color.WHITE) {
    this.addMouseListener(object : MouseAdapter() {
        override fun mouseEntered(e: MouseEvent?) { background = hoverColor }
        override fun mouseExited(e: MouseEvent?) { background = defaultColor }
    })
}

// Usage:
// myTextField.addHoverEffect(Color.YELLOW)
fun main() {
    val frame = JFrame("Hover Effect Demo")
    val textField = JTextField("Hover over me!", 20)

    // Define your colors
    val defaultColor = Color.WHITE
    val hoverColor = Color(230, 245, 255) // Light blue tint

    textField.background = defaultColor

    // Add the mouse listener
    textField.addMouseListener(object : MouseAdapter() {
        override fun mouseEntered(e: MouseEvent?) {
            textField.background = hoverColor
        }

        override fun mouseExited(e: MouseEvent?) {
            textField.background = defaultColor
        }
    })

    // Standard Layout Setup
    frame.layout = FlowLayout()
    frame.add(textField)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(300, 200)
    frame.isVisible = true
}
