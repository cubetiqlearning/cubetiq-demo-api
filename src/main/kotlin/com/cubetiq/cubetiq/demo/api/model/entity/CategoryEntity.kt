package com.cubetiq.cubetiq.demo.api.model.entity

import org.hibernate.Hibernate
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "categories")
open class CategoryEntity constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    open var id: Long? = null,
    @Column(nullable = false, unique = true, length = 30)
    open var name: String? = null,
    @Column(length = 150)
    open var notes: String? = null,
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || Hibernate.getClass(this) != Hibernate.getClass(other)) return false
        other as CategoryEntity

        return id != null && id == other.id
    }

    override fun hashCode(): Int = javaClass.hashCode()

    override fun toString(): String {
        return this::class.simpleName + "(id = $id , name = $name , notes = $notes )"
    }
}