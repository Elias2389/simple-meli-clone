package com.ae.meliclone.feature.article.service

import com.ae.meliclone.entity.ArticleEntity

interface ArticleService {
    /**
     * Save Article
     */
    fun saveArticle(article: ArticleEntity): ArticleEntity

    /**
     * Get Article by ID
     * @param id
     */
    fun getArticleByID(id: Int): ArticleEntity?

    /**
     * Get all Articles
     */
    fun getAllArticles(): List<ArticleEntity>

    /**
     * Get Article
     */
    fun updateArticle(article: ArticleEntity): ArticleEntity

    /**
     * Delete Article by Id
     * @param id
     */
    fun deleteArticle(id: Int)
}