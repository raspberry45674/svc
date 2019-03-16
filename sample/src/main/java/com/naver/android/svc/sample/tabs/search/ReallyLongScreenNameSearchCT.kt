/*
 * Copyright 2018 NAVER Corp.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.naver.android.svc.sample.tabs.search

import com.naver.android.annotation.ControlTower

/**
 * if your controlTower class name is too long,
 * maybe you should Abbreviate name as "CT"
 */
@ControlTower
class ReallyLongScreenNameSearchCT : SVC_ReallyLongScreenNameSearchFragmentControlTower() {

  override fun onCreated() {
    view.setExtraString("ReallyLongScreenNameSearchCT")
  }
}
