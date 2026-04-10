import java.awt.*
//import javax.swing.Icon
//import javax.swing.Component
import javax.swing.*
//import java.awt.Color
//import java.awt.FlowLayout

class GradientIcon(
    private val color1: Color,
    private val color2: Color,
    private val size: Int = 18,
    private val isCircle: Boolean = false // Circle for Radio, Rect for Checkbox
) : Icon {

    override fun paintIcon(c: Component?, g: Graphics, x: Int, y: Int) {
        val g2d = g.create() as Graphics2D
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)

        val gp = GradientPaint(x.toFloat(), y.toFloat(), color1, x.toFloat(), (y + size).toFloat(), color2)
        g2d.paint = gp

        if (isCircle) {
            g2d.fillOval(x, y, size, size)
            // Add a small inner dot if selected (optional logic here)
        } else {
            g2d.fillRoundRect(x, y, size, size, 5, 5)
        }

        g2d.dispose()
    }

    override fun getIconWidth(): Int = size
    override fun getIconHeight(): Int = size
}




fun main() {
    val frame = JFrame("Gradient Controls")
    frame.layout = FlowLayout(FlowLayout.CENTER, 20, 20)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    // --- GRADIENT CHECKBOX ---
    val checkBox = JCheckBox("Accept Terms")
    // Icon for unselected state (Gray gradient)
    checkBox.icon = GradientIcon(Color.LIGHT_GRAY, Color.GRAY)
    // Icon for selected state (Blue/Cyan gradient)
    checkBox.selectedIcon = GradientIcon(Color(0x00d2ff), Color(0x3a7bd5))

    // --- GRADIENT RADIO BUTTON ---
    val radioButton = JRadioButton("Select Option")
    // Icon for unselected state
    radioButton.icon = GradientIcon(Color.LIGHT_GRAY, Color.GRAY, isCircle = true)
    // Icon for selected state (Purple/Pink gradient)
    radioButton.selectedIcon = GradientIcon(Color(0x833ab4), Color(0xfd1d1d), isCircle = true)

    frame.add(checkBox)
    frame.add(radioButton)
    
    frame.setSize(300, 200)
    frame.isVisible = true
}
