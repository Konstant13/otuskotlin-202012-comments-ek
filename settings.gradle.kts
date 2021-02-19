rootProject.name = "otuskotlin-marketplace"

pluginManagement {
    plugins {
        val kotlinVersion: String by settings

        kotlin("jvm") version kotlinVersion apply false
        kotlin("js") version kotlinVersion apply false
        kotlin("multiplatform") version kotlinVersion apply false
        kotlin("plugin.serialization") version kotlinVersion apply false
    }
}

include("ok-comments-common-mp")
//include("ok-comments-common-be")
//include("ok-comments-frontend")
//include("ok-comments-transport-mp")
//include("ok-comments-mappers-mp")