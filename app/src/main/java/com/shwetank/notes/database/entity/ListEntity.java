package com.shwetank.notes.database.entity;
/*
 * Copyright 2020  Shwetank Bhardwaj,
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @author Shwetank Bhardwaj, shwetank.grad@gmail.com
 * Software Engineering, CIDSE, ASU Poly
 *
 * @version March 2020
 */

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.List;

@Entity
public class ListEntity {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    private String title;
    private List<Integer> subListIds;

    public int getUid() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getSubListIds() {
        return subListIds;
    }

    public void setSubListIds(List<Integer> subListIds) {
        this.subListIds = subListIds;
    }
}
