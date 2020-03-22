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

import com.shwetank.notes.database.entity.constants.ReminderRepeat;
import com.shwetank.notes.database.entity.constants.ReminderTime;
import com.shwetank.notes.database.entity.constants.ReminderType;
import com.shwetank.notes.database.entity.model.AdvancedRepeat;
import com.shwetank.notes.database.entity.model.ReminderAdvance;
import com.shwetank.notes.database.entity.model.SpecificDays;

@Entity
public class ReminderEntity {
    @PrimaryKey(autoGenerate = true)
    private int uid;
    private ReminderTime reminderTime;
    private ReminderAdvance reminderAdvance;
    private ReminderType reminderType;
    private ReminderRepeat reminderRepeat;
    private SpecificDays specificDays;
    private AdvancedRepeat advancedRepeat;

    public int getUid() {
        return uid;
    }

    public ReminderTime getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(ReminderTime reminderTime) {
        this.reminderTime = reminderTime;
    }

    public ReminderAdvance getReminderAdvance() {
        return reminderAdvance;
    }

    public void setReminderAdvance(ReminderAdvance reminderAdvance) {
        this.reminderAdvance = reminderAdvance;
    }

    public ReminderType getReminderType() {
        return reminderType;
    }

    public void setReminderType(ReminderType reminderType) {
        this.reminderType = reminderType;
    }

    public ReminderRepeat getReminderRepeat() {
        return reminderRepeat;
    }

    public void setReminderRepeat(ReminderRepeat reminderRepeat) {
        this.reminderRepeat = reminderRepeat;
    }

    public SpecificDays getSpecificDays() {
        return specificDays;
    }

    public void setSpecificDays(SpecificDays specificDays) {
        this.specificDays = specificDays;
    }

    public AdvancedRepeat getAdvancedRepeat() {
        return advancedRepeat;
    }

    public void setAdvancedRepeat(AdvancedRepeat advancedRepeat) {
        this.advancedRepeat = advancedRepeat;
    }
}
