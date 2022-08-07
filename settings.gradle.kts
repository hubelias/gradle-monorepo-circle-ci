rootProject.name = "gradle-monorepo-circle-ci"
include(
    "src:client",
    "src:server",
    "src:server-api"
)

plugins {
    `gradle-enterprise`
}

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}
