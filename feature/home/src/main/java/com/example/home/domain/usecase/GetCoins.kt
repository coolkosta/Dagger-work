package com.example.home.domain.usecase

import com.example.home.data.remote.dto.Coin

internal interface GetCoins {
    suspend operator fun invoke(): List<Coin>
}