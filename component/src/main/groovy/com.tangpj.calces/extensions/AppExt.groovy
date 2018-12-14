/*
 * Copyright (C) 2018 Tang
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

/**
 * Created by tang on 2018/6/29.
 * App配置，配置App的基础信息
 */
class AppExt extends ModulesExt{
    String dependMethod = "implementation"
    List<String> modules = new ArrayList<>()

    AppExt(String name) {
        super(name)
    }

    def name(String name){
        this.name = name
    }

    def applicationId(String applicationId){
        this.applicationId = applicationId
    }

    def applicationName(String applicationName){
        this.applicationName = applicationName
    }

    def dependMethod(String dependMethod){
        this.dependMethod = dependMethod
    }

    def mainActivity(String mainActivity){
        this.mainActivity = mainActivity
    }

    def modules(String... modules){
        this.modules.addAll(modules)
    }

    @Override
    String toString() {
        return "app = $name, applicationId = $applicationId, " +
                "${applicationName.isEmpty()? "" : "application = $applicationName,"}" +
                " dependMethod = $dependMethod\n" +
                "modules: ${modules.isEmpty()? "is empty" : "$modules"}"
    }
}
