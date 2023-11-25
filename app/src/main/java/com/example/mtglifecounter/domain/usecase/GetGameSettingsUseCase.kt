package com.example.mtglifecounter.domain.usecase


import com.example.mtglifecounter.domain.entity.Level
import com.example.mtglifecounter.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {
  operator fun invoke (level: Level)=repository.getGameSettings(level)
}