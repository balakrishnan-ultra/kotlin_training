import java.awt.Dimension
import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.SwingUtilities

class ExpandingFrame : JFrame("Expand Demo") {
    private var isExpanded = false
    private val smallSize = Dimension(300, 200)
    private val largeSize = Dimension(600, 400)

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = FlowLayout()
        size = smallSize
        setLocationRelativeTo(null) // Center on screen

        val expandButton = JButton("Expand Window")
        
        expandButton.addActionListener {
            if (isExpanded) {
                // Shrink back
                size = smallSize
                expandButton.text = "Expand Window"
            } else {
                // Grow
                size = largeSize
                expandButton.text = "Collapse Window"
            }
            
            isExpanded = !isExpanded
            
            // Optional: Re-center the window after resizing
            setLocationRelativeTo(null)
        }

        add(expandButton)
    }
}

fun main() {
    SwingUtilities.invokeLater {
        ExpandingFrame().isVisible = true
    }
}
