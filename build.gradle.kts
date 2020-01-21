plugins {
    id("org.jetbrains.kotlin.js") version "1.3.61"
}

group = "com.ojaynico"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    jcenter()
    maven { url = uri("http://dl.bintray.com/kotlin/kotlin-js-wrappers") }
    maven { url = uri("https://dl.bintray.com/kotlin/kotlinx") }
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.6.12")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.3.3")
    implementation("org.jetbrains:kotlin-react:16.9.0-pre.89-kotlin-1.3.60")
    implementation("org.jetbrains:kotlin-react-dom:16.9.0-pre.89-kotlin-1.3.60")
    implementation("org.jetbrains:kotlin-react-router-dom:4.3.1-pre.89-kotlin-1.3.60")
    testImplementation(kotlin("test-js"))
}

kotlin {
    sourceSets["main"].dependencies {
        implementation(kotlin("stdlib-js"))
        implementation("org.jetbrains.kotlinx:kotlinx-html-js:0.6.12")
        implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core-js:1.3.3")
        implementation(npm("@jetbrains/kotlin-react", "16.9.0-pre.89"))
        implementation(npm("@jetbrains/kotlin-react-dom", "16.9.0-pre.89"))
        implementation(npm("@jetbrains/kotlin-react-router-dom", "4.3.1-pre.89"))
        implementation(npm("@jetbrains/kotlin-extensions", "1.0.1-pre.89"))
        implementation(npm("react", "16.12.0"))
        implementation(npm("react-dom", "16.12.0"))
        implementation(npm("react-router-dom", "5.1.2"))
    }

}

kotlin.target.browser { }
