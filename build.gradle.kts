plugins {
    kotlin("jvm") version "1.7.10"
}

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    testImplementation(kotlin("test"))
}

sourceSets {
    main {
        java.srcDir("src/main")
    }
    
    test {
        java.srcDir("src/test")
    }
}

tasks.test {
    useJUnitPlatform()
}
