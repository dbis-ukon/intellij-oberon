package com.github.zaskar9.oberonideplugin.services

import com.intellij.openapi.project.Project
import com.github.zaskar9.oberonideplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
