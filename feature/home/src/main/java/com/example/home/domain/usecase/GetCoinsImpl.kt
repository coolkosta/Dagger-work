package com.example.home.domain.usecase

import com.example.home.data.remote.dto.Coin
import com.example.home.domain.repository.RetrofitRepository
import javax.inject.Inject

internal class GetCoinsImpl @Inject constructor(private val repository: RetrofitRepository) :
    GetCoins {
    override suspend fun invoke(): List<Coin> {
        return repository.getCoins()
    }
}