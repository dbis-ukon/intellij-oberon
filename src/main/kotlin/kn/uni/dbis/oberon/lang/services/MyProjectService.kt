package kn.uni.dbis.oberon.lang.services

import com.intellij.openapi.project.Project
import kn.uni.dbis.oberon.lang.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
