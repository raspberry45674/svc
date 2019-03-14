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

package com.naver.android.svc.sample.tabs.statistic

import com.naver.android.svc.core.controltower.ControlTower

class StatisticControlTower(screen: StatisticFragment, views: StatisticViews) : ControlTower<StatisticFragment, StatisticViews>(screen, views), StatisticViewsAction {
    override fun onTitleClicked() {
        showToast("StatisticControlTower onTitleClicked")
    }

    override fun onExtraClicked() {
        showToast("StatisticControlTower onExtraClicked")
    }

    override fun onCreated() {
        views.setName(views.javaClass.simpleName)
        views.setExtra(javaClass.simpleName)
    }
}