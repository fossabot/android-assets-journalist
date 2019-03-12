/*
 *  Copyright (c) 2019-present, Android Asset File Generator Contributors.
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in
 *  compliance with the License. You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is
 *  distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See
 *  the License for the specific language governing permissions and limitations under the License.
 */

package com.github.utilx.aafg.java

open class JavaFileConfig {
    var enabled = false
    var className = "AssetFiles"
    var packageName = "com.github.utilx"
    var constNamePrefix = "asset_"
    //TODO
    //var constNameCharMapping = emptyList<Map<String, String>>()
}