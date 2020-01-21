import components.Home
import components.PageOne
import components.PageTwo
import kotlinx.html.ButtonType
import kotlinx.html.InputType
import kotlinx.html.js.onClickFunction
import react.*
import react.dom.*
import react.router.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        hashRouter {
            nav("navbar navbar-expand-lg navbar-dark bg-primary") {
                a(classes = "navbar-brand") {
                    attrs.onClickFunction = {
                        it.preventDefault()
                    }
                    +"Kotlin React"
                }
                button(classes = "navbar-toggler", type = ButtonType.button) {
                    attrs["data-toggle"] = "collapse"
                    attrs["data-target"] = "#navbarNav"
                    attrs["aria-controls"] = "navbarNav"
                    attrs["aria-expanded"] = "false"
                    attrs["aria-label"] = "Toggle navigation"

                    span("navbar-toggler-icon") { }
                }
                div("collapse navbar-collapse") {
                    attrs["id"] = "navbarNav"
                    ul("navbar-nav mr-auto") {
                        li("nav-item active") { routeLink("/", className = "nav-link") { +"Home" } }
                        li("nav-item") { routeLink("/one", className = "nav-link") { +"Page One" } }
                        li("nav-item") { routeLink("/two", className = "nav-link") { +"Page Two" } }
                    }
                    form("form-inline my-2 my-lg-0") {
                        input(type = InputType.text, classes = "form-control mr-sm-2") {
                            attrs["placeholder"] = "Search"
                        }
                    }
                }
            }

            br {  }

            div("container") {
                switch {
                    route("/", Home::class, exact = true)
                    route("/one", PageOne::class, exact = true)
                    route("/two", PageTwo::class, exact = true)
                }
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
