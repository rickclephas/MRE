plugins {
    kotlin("multiplatform") version "1.9.0"
}

group = "com.rickclephas"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    jvm()
    iosArm64()
    macosArm64()
    
    sourceSets {
        sourceSets {
            all {
                languageSettings.languageVersion = "2.0"
            }
        }
        val commonMain by getting
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }
        val jvmMain by getting
        val jvmTest by getting
        val libraryMain by creating {
            dependsOn(commonMain)
        }
        val libraryTest by creating {
            dependsOn(commonTest)
        }
        val appleMain by creating {
            dependsOn(libraryMain)
        }
        val appleTest by creating {
            dependsOn(libraryTest)
        }
        val iosArm64Main by getting {
            dependsOn(appleMain)
        }
        val iosArm64Test by getting {
            dependsOn(appleTest)
        }
        val macosArm64Main by getting {
            dependsOn(appleMain)
        }
        val macosArm64Test by getting {
            dependsOn(appleTest)
        }
    }
}
