package components

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.div
import react.dom.h3

class PageOne : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("row") {
            div("col-lg-12") {
                h3("text-center") { +"Page One" }
            }
        }

        div("row") {
            div("col-lg-12 center") {
                h3 { +"Page one content goes here." }
            }
        }
    }
}
