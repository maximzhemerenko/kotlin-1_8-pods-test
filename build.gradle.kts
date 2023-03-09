plugins {
    kotlin("multiplatform") version "1.8.10"
    kotlin("native.cocoapods") version "1.8.10"
}

group = "me.maksimzhemerenko"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    ios {
        binaries {
            framework {
                baseName = "MyFramework"
            }
        }
    }

    cocoapods {
        framework {
            baseName = "MyFramework"
        }

        ios.deploymentTarget = "13"

        pod("AFNetworking") {
            version = "~> 4.0.1"
        }
    }

    jvm()

    ios()

    sourceSets {
        val commonMain by getting
        val jvmMain by getting
        val iosMain by getting
    }
}
