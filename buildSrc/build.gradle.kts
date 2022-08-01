repositories {
    gradlePluginPortal()
}

plugins {
    `kotlin-dsl`
}

dependencies {
    implementation("org.springframework.boot:spring-boot-gradle-plugin:2.7.2")
    implementation("io.spring.gradle:dependency-management-plugin:1.0.12.RELEASE")
}
