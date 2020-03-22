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

import com.shwetank.notes.database.entity.constants.Priority;

import java.util.Date;
import java.util.List;

@Entity
public class TaskEntity {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    private String title;
    private List<Integer> subTaskIds;
    private Date dueDate;
    private Priority priority;
    private boolean highlight;
    private boolean isCompleted;
    private Date createdDate;
    private Date modifiedDate;
    private int reminderId;

    public int getUid() {
        return uid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Integer> getSubTaskIds() {
        return subTaskIds;
    }

    public void setSubTaskIds(List<Integer> subTaskIds) {
        this.subTaskIds = subTaskIds;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public boolean isHighlight() {
        return highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getModifiedDate() {
        return modifiedDate;
    }

    public void setModifiedDate(Date modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public int getReminderId() {
        return reminderId;
    }

    public void setReminderId(int reminderId) {
        this.reminderId = reminderId;
    }
}
