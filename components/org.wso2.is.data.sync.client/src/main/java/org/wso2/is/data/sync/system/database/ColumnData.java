/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.is.data.sync.system.database;

public class ColumnData {

    private String name;
    private String type;
    private int size;

    public ColumnData(String name, String type, int size) {

        this.name = name;
        this.type = type;
        this.size = size;
    }

    public String getName() {

        return name;
    }

    public String getType() {

        return type;
    }

    public int getSize() {

        return size;
    }
}