plugins {
	java
	id("org.springframework.boot") version "2.7.10"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
	id("org.springdoc.openapi-gradle-plugin") version "1.6.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springdoc:springdoc-openapi-ui:1.7.0")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
