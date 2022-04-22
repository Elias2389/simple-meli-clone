package com.ae.meliclone.entity

import javax.persistence.*
import javax.persistence.GenerationType.AUTO
import javax.persistence.GenerationType.IDENTITY

@Entity
@Table(name = "articles")
data class ArticleEntity(
    @Id
    @GeneratedValue(strategy = IDENTITY)
    var id: Int = 0,
    var title: String,
    var description: String,
    @OneToOne(optional = false,  cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var price: PriceEntity,
    var items: Int = 0,
    @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
    var comments: List<CommentEntity> = emptyList()
)
