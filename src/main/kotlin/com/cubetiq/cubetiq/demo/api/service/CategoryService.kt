package com.cubetiq.cubetiq.demo.api.service

import com.cubetiq.cubetiq.demo.api.model.entity.CategoryEntity
import org.springframework.stereotype.Service

@Service
interface CategoryService {
    fun create(entity: CategoryEntity): CategoryEntity

    fun findAll(): List<CategoryEntity>
}