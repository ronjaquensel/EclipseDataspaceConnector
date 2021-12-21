/*
 *  Copyright (c) 2021 Microsoft Corporation
 *
 *  This program and the accompanying materials are made available under the
 *  terms of the Apache License, Version 2.0 which is available at
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 *  SPDX-License-Identifier: Apache-2.0
 *
 *  Contributors:
 *       Microsoft Corporation - initial API and implementation
 *
 */

val jacksonVersion: String by project
val okHttpVersion: String by project
val jodahFailsafeVersion: String by project


plugins {
    `java-library`
    `maven-publish`
}

dependencies {
    api("com.fasterxml.jackson.core:jackson-core:${jacksonVersion}")
    api("com.fasterxml.jackson.core:jackson-annotations:${jacksonVersion}")
    api("com.fasterxml.jackson.core:jackson-databind:${jacksonVersion}")
    api("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:${jacksonVersion}")
    api("com.squareup.okhttp3:okhttp:${okHttpVersion}")

    api("net.jodah:failsafe:${jodahFailsafeVersion}")

    api(project(":core:policy:policy-evaluator"))

    testImplementation(testFixtures(project(":common:util")))
}

publishing {
    publications {
        create<MavenPublication>("spi") {
            artifactId = "spi"
            from(components["java"])
        }
    }
}
