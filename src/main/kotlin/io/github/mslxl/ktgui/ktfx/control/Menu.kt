@file:JvmName("Control")
@file:JvmMultifileClass

package io.github.mslxl.ktgui.ktfx.control

import io.github.mslxl.ktgui.ktfx.FxPanelNode
import io.github.mslxl.ktgui.ktfx._createFxPanelNode
import io.github.mslxl.ktgui.ktfx._ktfx
import io.github.mslxl.ktgui.ktfx._ktfxInit
import javafx.scene.control.*

inline fun FxPanelNode.menuBar(init: MenuBar.()->Unit={}) = _ktfx(MenuBar(),init)

inline fun MenuBar.menu(text:String="",init:Menu.()->Unit={}) = Menu(text).apply { _ktfxInit(this) }.apply(init).apply { menus.add(this) }

inline fun Menu.menu(text:String="",init:Menu.()->Unit={}) = Menu(text).apply { _ktfxInit(this) }.apply(init).let{ items.add(it);it }

inline fun Menu.menuItem(text:String="",init:MenuItem.()->Unit={}) = MenuItem(text).apply { _ktfxInit(this) }.apply(init).apply { items.add(this) }

inline fun Menu.checkMenuItem(text:String="",init: CheckMenuItem.()->Unit={}) = CheckMenuItem(text).apply { _ktfxInit(this) }.apply(init).apply { items.add(this) }

inline fun Menu.radioMenuItem(text:String="",init: RadioMenuItem.()->Unit={}) = RadioMenuItem(text).apply { _ktfxInit(this) }.apply(init).apply { items.add(this) }

fun Menu.customMenuItem(init: FxPanelNode.()->Unit={}) = CustomMenuItem().apply { _ktfxInit(this) }.apply{
    _createFxPanelNode {
        content = it
    }.apply(init)
}.apply { items.add(this) }

inline fun Menu.separatorMenuItem(init: SeparatorMenuItem.()->Unit={}) = SeparatorMenuItem().apply { _ktfxInit(this) }.apply(init).apply { items.add(this) }

inline val Menu.separator get() = separatorMenuItem()

inline fun ContextMenu.menu(text:String="",init:Menu.()->Unit={}) = Menu(text).apply { _ktfxInit(this) }.apply(init).let { items.add(it);it }

inline fun ContextMenu.menuItem(text:String="",init:MenuItem.()->Unit={}) = MenuItem(text).apply { _ktfxInit(this) }.apply(init).apply { items.add(this) }

inline fun ContextMenu.checkMenuItem(text:String="",init: CheckMenuItem.()->Unit={}) = CheckMenuItem(text).apply { _ktfxInit(this) }.apply(init).apply { items.add(this) }

inline fun ContextMenu.radioMenuItem(text:String="",init: RadioMenuItem.()->Unit={}) = RadioMenuItem(text).apply { _ktfxInit(this) }.apply(init).apply { items.add(this) }

fun ContextMenu.customMenuItem(init: FxPanelNode.()->Unit={}) = CustomMenuItem().apply { _ktfxInit(this) }.apply{
    _createFxPanelNode {
        content = it
    }.apply(init)
}.apply { items.add(this) }

inline fun ContextMenu.separatorMenuItem(init: SeparatorMenuItem.()->Unit={}) = SeparatorMenuItem().apply { _ktfxInit(this) }.apply(init).apply { items.add(this) }

inline val ContextMenu.separator get() = separatorMenuItem()

inline fun ContextMenu(init:ContextMenu.()->Unit={}) = javafx.scene.control.ContextMenu().apply { _ktfxInit(this) }.apply(init)
