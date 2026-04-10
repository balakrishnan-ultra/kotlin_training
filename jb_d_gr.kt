import java.awt.*
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.SwingConstants

class GradientButton(
    text: String,
    private val color1: Color = Color.CYAN,
    private val color2: Color = Color.BLUE
) : JButton(text) {

    init {
        // Make the button transparent so the background gradient shows
        isContentAreaFilled = false
        isFocusPainted = false
    }

    override fun paintComponent(g: Graphics) {
        val g2d = g.create() as Graphics2D
        
        // Enable Anti-aliasing for smoother edges
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)

        // Create the gradient from top to bottom
        val gp = GradientPaint(0f, 0f, color1, 0f, height.toFloat(), color2)
        
        g2d.paint = gp
        // Draw a rounded rectangle or standard rect
        g2d.fillRoundRect(0, 0, width, height, 15, 15)

        g2d.dispose()

        // Call super to paint the text/icon on top of our gradient
        super.paintComponent(g)
    }
}

fun main() {
    val frame = JFrame("Kotlin Swing Gradient")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()
    frame.size = Dimension(300, 200)

    val myButton = GradientButton("Click Me", Color(0x00b4db), Color(0x0083b0))
    myButton.preferredSize = Dimension(150, 50)
    myButton.foreground = Color.WHITE
    myButton.font = Font("SansSerif", Font.BOLD, 14)

    frame.add(myButton)
    frame.isVisible = true
}
