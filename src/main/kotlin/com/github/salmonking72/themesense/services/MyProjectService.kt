package com.github.salmonking72.themesense.services

import com.intellij.openapi.project.Project
import com.github.salmonking72.themesense.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
