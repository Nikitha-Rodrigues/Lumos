pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        maven { url =uri( "https://maven.google.com" )}  // Google's Maven repository
        maven {
            url = uri("https://storage.googleapis.com/tensorflow")
        }
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url =uri( "https://maven.google.com" )}
        maven {
            url = uri("https://storage.googleapis.com/tensorflow")
        }
        maven {
            name ="ossrh-snapshot"
            url =uri("https://oss.sonatype.org/content/repositories/snapshots")
        }
    }
}

rootProject.name = "Lumos"
include(":app")
