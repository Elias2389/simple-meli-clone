package com.ae.meliclone.feature.article.controller

import com.ae.meliclone.entity.ArticleEntity
import com.ae.meliclone.feature.article.service.ArticleService
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.*
import javax.transaction.Transactional

@Controller("/article")
class ArticleController(
    private val service: ArticleService
) {

    @Post("/create")
    fun saveArticle(@Body article: ArticleEntity): HttpResponse<ArticleEntity> {
        val response = service.saveArticle(article)
        return HttpResponse.ok(response)
    }

    @Get("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    fun getArticleByID(@PathVariable id: Int): HttpResponse<ArticleEntity> {
        val response = service.getArticleByID(id)
        return HttpResponse.ok(response)
    }

    @Get()
    fun getAllArticles(): HttpResponse<List<ArticleEntity>>{
        val response = service.getAllArticles()
        return HttpResponse.ok(response)
    }

    @Put(uri = "")
    fun updateArticle(@Body article: ArticleEntity): HttpResponse<ArticleEntity> {
        val response = service.updateArticle(article)
        return HttpResponse.ok(response)
    }

    @Delete("/{id}")
    fun deleteArticle(@PathVariable id: Int): HttpResponse<String> {
        val response = service.deleteArticle(id)
        return HttpResponse.ok("Success")
    }
}