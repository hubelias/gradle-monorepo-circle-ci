import io.spring.gradle.dependencymanagement.dsl.DependencyManagementExtension

repositories {
    mavenCentral()
}

plugins {
    id("java")
    id("io.spring.dependency-management")
}

the<DependencyManagementExtension>().apply {
    imports {
        mavenBom(org.springframework.boot.gradle.plugin.SpringBootPlugin.BOM_COORDINATES)
    }
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    testImplementation("org.assertj:assertj-core")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}
