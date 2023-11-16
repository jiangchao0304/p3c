/*
 * This file was generated by the Gradle 'init' task.
 */

plugins {
    `java-library`
    `maven-publish`
    signing
}

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    api("net.sourceforge.pmd:pmd-java:${property("pmd.version")}")
    api("net.sourceforge.pmd:pmd-vm:${property("pmd.version")}")
    api("javax.annotation:javax.annotation-api:1.3.2")
    testImplementation("net.sourceforge.pmd:pmd-test:${property("pmd.version")}")
    testImplementation("commons-io:commons-io:2.11.0")
}

group = "io.github.godfather1103.p3c"
version = "${property("p3c_pmd_version")}"
description = "p3c-pmd"

java {
    withJavadocJar()
    withSourcesJar()
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

publishing {
    repositories {
        maven {
            val releasesRepoUrl = uri("https://s01.oss.sonatype.org/service/local/staging/deploy/maven2/")
            val snapshotsRepoUrl = uri("https://s01.oss.sonatype.org/content/repositories/snapshots/")
            url = if (version.toString().toUpperCase().contains("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            credentials {
                username = "${property("ossrhUsername")}"
                password = "${property("ossrhPassword")}"
            }
        }
    }
    publications.create<MavenPublication>("mavenJava") {
        from(components["java"])
        pom {
            url.set("https://github.com/godfather1103/p3c")
            name.set(project.description)
            description.set("p3c pmd rule")
            scm {
                url.set("https://github.com/godfather1103/p3c")
                connection.set("scm:git:https://github.com/godfather1103/p3c.git")
                developerConnection.set("scm:git:https://github.com/godfather1103/p3c.git")
            }

            licenses {
                license {
                    name.set("The Apache Software License, Version 2.0")
                    url.set("https://www.apache.org/licenses/LICENSE-2.0.txt")
                    distribution.set("repo")
                }
            }

            developers {
                developer {
                    id.set("godfather1103")
                    name.set("Jack Chu")
                    email.set("chuchuanbao@gmail.com")
                }
                developer {
                    id.set("junlie")
                    name.set("Junlie")
                    email.set("sean.caikang@gmail.com")
                }
                developer {
                    id.set("ZengHou")
                    name.set("ZengHou")
                    email.set("fengwei1983@gmail.com")
                }
            }
        }

    }
}

signing {
    sign(publishing.publications["mavenJava"])
}

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

tasks.withType<Javadoc> {
    options.encoding = "UTF-8"
    (options as StandardJavadocDocletOptions).tags = listOf("date")
}
