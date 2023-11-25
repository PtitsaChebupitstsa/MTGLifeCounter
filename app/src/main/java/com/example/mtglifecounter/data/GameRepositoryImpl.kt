package com.example.mtglifecounter.data

import com.example.mtglifecounter.domain.entity.GameSetting
import com.example.mtglifecounter.domain.entity.Level
import com.example.mtglifecounter.domain.repository.GameRepository

object GameRepositoryImpl:GameRepository {

    override fun getGameSettings(level: Level): GameSetting {
       return when(level){
           Level.TWO->{
               GameSetting(40,2,false)
           }
           Level.THREE->{
               GameSetting(40,2,false)
           }
           Level.FOUR->{
               GameSetting(40,2,false)
           }
       }
    }

    override fun editLifeGameSettings(gameSetting: GameSetting, maxLive: Int): GameSetting {
        return GameSetting(maxLive = maxLive,gameSetting.maxPlayer,gameSetting.soundSetting)
    }


}