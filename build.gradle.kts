import org.gradle.api.JavaVersion.VERSION_1_8
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {
    extra["kotlinVersion"] = "1.3.61"
    extra["assertjVersion"] = "3.14.0"
    extra["junitVersion"] = "5.5.2"
    extra["mockitoVersion"] = "3.0.0"

    val kotlinVersion: String by extra

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

plugins {
    kotlin("jvm") version "1.3.61"
}

group = "de.roamingthings"
version = "1.0.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val kotlinVersion: String by extra
val junitVersion: String by extra
val mockitoVersion: String by extra
val assertjVersion: String by extra
dependencies {
    compile(kotlin("stdlib-jdk8"))

    testImplementation("org.junit.jupiter:junit-jupiter:$junitVersion")

    testCompile("org.assertj:assertj-core:$assertjVersion")
    testCompile("org.mockito:mockito-core:$mockitoVersion")
    testCompile("org.mockito:mockito-junit-jupiter:$mockitoVersion")
}

configure<JavaPluginConvention> {
    sourceCompatibility = VERSION_1_8
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.test {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
