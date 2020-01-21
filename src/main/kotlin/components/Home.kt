package components

import kotlinx.html.ButtonType
import kotlinx.html.InputType
import kotlinx.html.js.onClickFunction
import org.w3c.dom.HTMLInputElement
import react.*
import react.dom.*
import kotlin.browser.document

interface HomeState : RState {
    var name: String
}

class Home : RComponent<RProps, HomeState>() {

    override fun HomeState.init() {
        name = "User"
    }

    override fun RBuilder.render() {
        div("row") {
            div("col-lg-12") {
                h3("text-center") { +"Welcome Home :)" }
                h4("text-center text-danger") { +state.name }
            }
        }

        div("row") {
            div("col-lg-4") {}
            div("col-lg-4") {
                form {
                    div("form-group") {
                        label {
                            attrs["for"] = "name"
                            +"Name"
                        }
                        input(type = InputType.text, classes = "form-control") {
                            attrs["id"] = "name"
                            attrs["placeholder"] = "Enter your name here."
                        }
                        br {  }
                        div("text-center") {
                            button(type = ButtonType.button, classes = "btn btn-success align-center") {
                                attrs.onClickFunction = {
                                    val username = document.getElementById("name") as HTMLInputElement
                                    setState {
                                        name = username.value
                                    }
                                }
                                + "Click Me"
                            }
                        }
                    }
                }
            }
            div("col-lg-4") {}
        }
    }
}
