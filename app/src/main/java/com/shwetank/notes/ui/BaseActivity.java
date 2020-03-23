/*
 *
 *  Copyright 2020  Shwetank Bhardwaj,
 *
 *  Licensed under the Apache License, Version 2.0 (the "License")
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 *  @author Shwetank Bhardwaj, shwetank.grad@gmail.com
 *  Software Engineering, CIDSE, ASU Poly
 *
 *  @version 3/2020
 * /
 *
 */

package com.shwetank.notes.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            doOnCreate(savedInstanceState);
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        try {
            doOnStart();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            doOnResume();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        try {
            doOnPause();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        try {
            doOnStop();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        try {
            doOnRestart();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        try {
            doOnDestroy();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    private void sendLog(Exception e) {
        // TODO: 3/23/2020 Add Crashlytics and openExceptionDialog
    }

    protected void doOnCreate(Bundle savedInstanceState) {

    }

    private void doOnStart() {

    }

    private void doOnResume() {

    }

    private void doOnPause() {

    }

    private void doOnStop() {

    }

    private void doOnRestart() {

    }

    private void doOnDestroy() {

    }
}
