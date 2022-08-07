plugins {
    id("myproject.spring-boot-conventions")
}

application {
    mainClass.set("dev.hubelias.myproject.Main")
}

dependencies {
    implementation(project(":src:server-api"))
}
