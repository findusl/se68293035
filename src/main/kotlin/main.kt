@JsExport
class SomePlugin: Plugin() {
    override fun onload() {
        Notice("This is a notice!")
    }
}

@JsModule("obsidian")
@JsNonModule // required by the umd moduletype
external open class Component {
    open fun onload()
}

@JsModule("obsidian")
@JsNonModule
external open class Plugin : Component {
}

@JsModule("obsidian")
@JsNonModule
external open class Notice(message: String, timeout: Number = definedExternally) {
    open fun hide()
}
