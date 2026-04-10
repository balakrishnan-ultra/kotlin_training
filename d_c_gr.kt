import java.awt.*
import javax.swing.*

class GradientPanel : JPanel() {
    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val g2d = g as Graphics2D
        
        // Enable anti-aliasing for smoother rendering
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)

        val width = width
        val height = height

        // Define colors: Starting color and Ending color
        val color1 = Color(66, 135, 245) // Bright Blue
        val color2 = Color(102, 51, 153) // Deep Purple

        // Create the gradient: 
        // (0, 0) is top-left, (0, height) is bottom-left (Vertical Gradient)
        val gp = GradientPaint(0f, 0f, color1, 0f, height.toFloat(), color2)

        g2d.paint = gp
        g2d.fillRect(0, 0, width, height)
    }
}

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Kotlin Swing Gradient")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(400, 400)
        
        val panel = GradientPanel()
        panel.layout = GridBagLayout()
        
        val label = JLabel("Double Color Gradient").apply {
            foreground = Color.WHITE
            font = Font("SansSerif", Font.BOLD, 20)
        }
        
        panel.add(label)
        frame.add(panel)
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
    }
}
