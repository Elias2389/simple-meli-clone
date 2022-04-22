package com.ae.meliclone.feature.article.repository

import com.ae.meliclone.entity.ArticleEntity
import io.micronaut.data.annotation.Join
import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.CrudRepository
import io.micronaut.data.repository.jpa.JpaSpecificationExecutor

@Repository
interface ArticleRepository: CrudRepository<ArticleEntity, Int>, JpaSpecificationExecutor<ArticleEntity> {

    @Join(value = "comments", type = Join.Type.FETCH)
    override fun findAll(): Iterable<ArticleEntity>
}