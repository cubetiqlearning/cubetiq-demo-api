package com.cubetiq.cubetiq.demo.api.repository

import com.cubetiq.cubetiq.demo.api.model.entity.CategoryEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CategoryRepository: JpaRepository<CategoryEntity, Long>