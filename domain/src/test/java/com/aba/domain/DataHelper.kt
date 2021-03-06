package com.aba.domain

import com.aba.core.model.SearchDTO
import com.aba.domain.model.TvSearchModel
import com.aba.test.*

object DataHelper {
    fun provideSearchModel() = listOf(
        TvSearchModel(
            id = SOME_OTHER_ID,
            type = SOME_OTHER_TYPE,
            status = SOME_OTHER_STATUS,
            officialSite = SOME_OTHER_URL,
            name = SOME_OTHER_NAME,
            language = SOME_OTHER_LANGUAGE,
            url = SOME_OTHER_URL,
            genres = SOME_OTHER_GENRES,
            score = SOME_OTHER_SCORE,
            averageRating = SOME_OTHER_SCORE,
            mediumImage = SOME_OTHER_URL,
            originalImage = SOME_OTHER_URL
        )
    )

    fun provideSearchDTO() = listOf(
        SearchDTO(
            score = SOME_OTHER_SCORE,
            show = SearchDTO.Show(
                genres = SOME_OTHER_GENRES,
                id = SOME_OTHER_ID,
                url = SOME_OTHER_URL,
                language = SOME_OTHER_LANGUAGE,
                name = SOME_OTHER_NAME,
                officialSite = SOME_OTHER_URL,
                status = SOME_OTHER_STATUS,
                type = SOME_OTHER_TYPE,
                rating = SearchDTO.Rating(SOME_OTHER_SCORE),
                image = SearchDTO.Image(
                    SOME_OTHER_URL,
                    SOME_OTHER_URL
                ),
                links = SearchDTO.Links(
                    SearchDTO.PreviousEpisode(SOME_OTHER_URL),
                    SearchDTO.Self(SOME_OTHER_URL)
                )
            )
        )
    )
}