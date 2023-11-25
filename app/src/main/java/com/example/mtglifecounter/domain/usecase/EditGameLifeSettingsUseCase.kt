package com.example.mtglifecounter.domain.usecase

import com.example.mtglifecounter.domain.entity.GameSetting
import com.example.mtglifecounter.domain.repository.GameRepository

class EditGameLifeSettingsUseCase(private val repository: GameRepository) {
    operator fun invoke (gameSetting: GameSetting,maxLive:Int)=repository.editLifeGameSettings(gameSetting,maxLive)
}