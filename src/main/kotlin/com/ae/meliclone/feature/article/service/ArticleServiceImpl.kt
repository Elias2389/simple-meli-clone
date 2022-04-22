package com.ae.meliclone.feature.article.service

import com.ae.meliclone.entity.ArticleEntity
import com.ae.meliclone.feature.article.repository.ArticleRepository
import jakarta.inject.Inject
import jakarta.inject.Singleton

@Singleton
class ArticleServiceImpl @Inject constructor(
    private val repository: ArticleRepository
) : ArticleService {

    override fun saveArticle(article: ArticleEntity): ArticleEntity = repository.save(article)

    override fun getArticleByID(id: Int): ArticleEntity? = repository.findById(id).get()

    override fun getAllArticles(): List<ArticleEntity> = repository.findAll().toList()

    override fun updateArticle(article: ArticleEntity): ArticleEntity = repository.update(article)

    override fun deleteArticle(id: Int) = repository.deleteById(id)
}