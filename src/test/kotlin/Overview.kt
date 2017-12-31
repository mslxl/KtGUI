import io.github.mslxl.ktswing.*

import io.github.mslxl.ktswing.event.actionListener
import javax.swing.JFrame
import javax.swing.SwingConstants.CENTER

lateinit var frame:JFrame
fun main(args: Array<String>) {
    frame = frame("Notepad") {
        exitOnClose
        resizable
        size {
            width = 500
            height = 400
        }
        menubar {
            menu("File"){
                menuItem("Open")
                separator
                menuItem("Save")
                separator
                menuItem("Exit")
            }
            menu("Settings"){
                menuItem("Font")
            }
        }
        borderpanel {
            north {
                label("File not open"){
                    horizontalAlignment = CENTER
                }
            }
            centre {
                scrollPane {
                    textarea {
                        name = "textarea"
                        text = "Editor"
                    }
                }
            }
            south {
                flowpanel {
                    name = "flow"
                    button("Ok"){
                        actionListener {
                            frame.dispose()
                        }
                    }
                }
            }
        }
    }
}