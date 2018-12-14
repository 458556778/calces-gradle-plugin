/*
 * Copyright 2018, The TangPj
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tangpj.calces.extensions

import org.gradle.api.NamedDomainObjectContainer
import org.gradle.api.Project

/**
 * Created by tang on 2018/6/14.
 * App项目配置ext，用于配置项目的状态与项目的app
 */
class AppConfigExt {

    boolean debugEnable = false
    NamedDomainObjectContainer<AppExt> apps
    NamedDomainObjectContainer<LibraryExt> modules

    AppConfigExt(Project project){
        apps = project.container(AppExt)
        modules = project.container(LibraryExt)
    }

    def debugEnable(boolean debugEnable){
        this.debugEnable = debugEnable
    }

    def apps(Closure closure){
        apps.configure(closure)
    }


    def modules(Closure closure){
        modules.configure(closure)
    }

    @Override
    String toString() {
        return "isDebug: $debugEnable\n" +
                "apps: ${apps.isEmpty()? "is empty" : "$apps"}"+
                "modules: ${modules.isEmpty()? "is empty" : "$modules"}"
    }
}
