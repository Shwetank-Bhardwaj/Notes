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
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        try {
            doOnCreateView(inflater, container, savedInstanceState);
        } catch (Exception e) {
            sendLog(e);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        try {
            doViewCreated(view, savedInstanceState);
        } catch (Exception e) {
            sendLog(e);
        }
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            doOnCreate(savedInstanceState);
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        try {
            doOnStart();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        try {
            doOnResume();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        try {
            doOnPause();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    public void onStop() {
        super.onStop();
        try {
            doOnStop();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        try {
            doOnDestroy();
        } catch (Exception e) {
            sendLog(e);
        }
    }

    private void sendLog(Exception e) {

    }

    private void doOnCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

    }

    private void doViewCreated(View view, Bundle savedInstanceState) {

    }

    private void doOnCreate(Bundle savedInstanceState) {

    }

    private void doOnStart() {

    }

    private void doOnResume() {

    }

    private void doOnPause() {

    }

    private void doOnStop() {

    }

    private void doOnDestroy() {

    }
}
