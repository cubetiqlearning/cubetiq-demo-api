package com.cubetiq.cubetiq.demo.api.service.implementation

import com.cubetiq.cubetiq.demo.api.model.entity.CategoryEntity
import com.cubetiq.cubetiq.demo.api.repository.CategoryRepository
import com.cubetiq.cubetiq.demo.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CategoryServiceImpl @Autowired constructor(
    private val categoryRepository: CategoryRepository,
) : CategoryService {
    override fun create(entity: CategoryEntity): CategoryEntity {
        return categoryRepository.save(entity)
    }

    override fun findAll(): List<CategoryEntity> {
        return categoryRepository.findAll()
    }
}