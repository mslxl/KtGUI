@file:JvmName("Container")
@file:JvmMultifileClass

package io.github.mslxl.ktgui.ktfx.container

import io.github.mslxl.ktgui.ktfx.FxPanelNode
import io.github.mslxl.ktgui.ktfx.FxPanelNodePanel
import io.github.mslxl.ktgui.ktfx._ktfx
import javafx.scene.Node
import javafx.scene.layout.FlowPane

class _FlowPane:FlowPane(),FxPanelNode {
    override fun _onAddToContent(comp: Node) {
        children.add(comp)
    }
}

inline fun FxPanelNodePanel.flowPane(block:_FlowPane.()->Unit)= _ktfx(_FlowPane(),block)