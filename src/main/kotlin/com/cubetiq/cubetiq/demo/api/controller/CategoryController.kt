package com.cubetiq.cubetiq.demo.api.controller

import com.cubetiq.cubetiq.demo.api.model.entity.CategoryEntity
import com.cubetiq.cubetiq.demo.api.service.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/category")
class CategoryController @Autowired constructor(
    private val categoryService: CategoryService,
) {
    @PostMapping
    fun create(
        @RequestBody request: CategoryEntity
    ): ResponseEntity<Any> {
        val data = categoryService.create(request)

        return ResponseEntity.ok(data)
    }

    @GetMapping
    fun getAll(): ResponseEntity<Any> {
        val data = categoryService.findAll()

        return ResponseEntity.ok(data)
    }
}