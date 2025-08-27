plugins {
	java
	id("org.springframework.boot") version "3.5.4"
	id("io.spring.dependency-management") version "1.1.7"
}

group = "pbe"
version = "0.0.1-SNAPSHOT"
description = "Demo project for Spring Boot"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    implementation ("org.hibernate.orm:hibernate-community-dialects")
    implementation ("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation ("org.postgresql:postgresql")
    implementation ("org.springframework.boot:spring-boot-starter-web")

    // Lombok: para facilitar geração de código repetitivo
    implementation ("org.projectlombok:lombok")
    annotationProcessor ("org.projectlombok:lombok")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
