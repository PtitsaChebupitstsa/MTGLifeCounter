package com.example.mtglifecounter.domain.repository

import com.example.mtglifecounter.domain.entity.GameSetting
import com.example.mtglifecounter.domain.entity.Level

interface GameRepository {
    fun getGameSettings(level: Level):GameSetting
    fun editLifeGameSettings(gameSetting: GameSetting,maxLive:Int):GameSetting
}