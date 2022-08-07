repositories {
    mavenCentral()
}

plugins {
    id("myproject.java-conventions")
    id("org.springframework.boot")
    application
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
