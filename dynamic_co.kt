import javax.swing.*
import java.awt.FlowLayout

fun main() {
    val frame = JFrame("Dynamic UI Example")
    frame.layout = FlowLayout()
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.setSize(500, 300)

    val mainButton = JButton("Add Components")

    mainButton.addActionListener {
        // 1. Create the new components
        val newButton = JButton("New Button")
        val checkBox = JCheckBox("I agree")
        val radioButton = JRadioButton("Option A")

        // 2. Add them to the frame
        frame.add(newButton)
        frame.add(checkBox)
        frame.add(radioButton)

        // 3. CRITICAL: Refresh the UI
        frame.revalidate() 
        frame.repaint()
        
        // Optional: Disable the button so you don't spam the UI
        // mainButton.isEnabled = false 
    }

    frame.add(mainButton)
    frame.isVisible = true
}
