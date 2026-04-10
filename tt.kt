import javax.swing.*
import java.awt.FlowLayout

fun main() {
    val frame = JFrame("Tooltip Example")
    frame.layout = FlowLayout()
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    val button = JButton("Hover Over Me")
    
    // This is the magic line
    button.toolTipText = "This is a helpful hint!"
    
    
    
    
    
    
    
    
    //custom design code
    button.addMouseListener(object : java.awt.event.MouseAdapter() {
    override fun mouseEntered(e: java.awt.event.MouseEvent?) {
        button.background = java.awt.Color.YELLOW
    }

    override fun mouseExited(e: java.awt.event.MouseEvent?) {
        button.background = UIManager.getColor("Button.background")
    }})
    val manager = ToolTipManager.sharedInstance()
    manager.initialDelay = 100 // Appears in 100ms
    manager.dismissDelay = 5000 // Disappears after 5 seconds
    
    
    
    
    
    

    frame.add(button)
    frame.setSize(300, 200)
    frame.isVisible = true
}
