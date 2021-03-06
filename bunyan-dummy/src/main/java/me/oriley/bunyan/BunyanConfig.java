/*
 * Copyright (C) 2016 Kane O'Riley
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package me.oriley.bunyan;

import java.util.ArrayList;
import java.util.HashMap;

// Dummy class to allow later access without reflection
@SuppressWarnings({"unused", "WeakerAccess"})
public final class BunyanConfig {

    static ArrayList<Class> getAppenderList() {
        return new ArrayList<Class>();
    }

    static HashMap<String, String> getLoggerThresholdMap() {
        return new HashMap<String, String>();
    }

    static HashMap<String, String> getAppenderTagPatternMap() {
        return new HashMap<String, String>();
    }

    static String getGlobalLevel() {
        return "";
    }

    static String getGlobalTagPattern() {
        return "";
    }
}
