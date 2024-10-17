plugins {
	kotlin("jvm") version "1.9.23"
	id("org.jlleitschuh.gradle.ktlint") version "11.3.2" // 코드 스타일을 맞춰주는 것
	application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
	useJUnitPlatform()
}
kotlin {
	jvmToolchain(17)
}
