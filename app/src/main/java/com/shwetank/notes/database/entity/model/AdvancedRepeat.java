package com.shwetank.notes.database.entity.model;
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

import com.shwetank.notes.database.entity.constants.MinToYear;

public class AdvancedRepeat {
    private int repeatNumber;
    private MinToYear minToYear;

    public int getRepeatNumber() {
        return repeatNumber;
    }

    public void setRepeatNumber(int repeatNumber) {
        this.repeatNumber = repeatNumber;
    }

    public MinToYear getMinToYear() {
        return minToYear;
    }

    public void setMinToYear(MinToYear minToYear) {
        this.minToYear = minToYear;
    }
}
