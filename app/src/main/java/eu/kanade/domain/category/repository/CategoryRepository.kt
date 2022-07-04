package eu.kanade.domain.category.repository

import eu.kanade.domain.category.model.Category
import eu.kanade.domain.category.model.CategoryUpdate
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {

    suspend fun getAll(): List<Category>

    fun getAllAsFlow(): Flow<List<Category>>

    suspend fun getCategoriesByMangaId(mangaId: Long): List<Category>

    fun getCategoriesByMangaIdAsFlow(mangaId: Long): Flow<List<Category>>

    // SY -->
    @Throws(DuplicateNameException::class)
    suspend fun insert(name: String, order: Long): Long
    // SY <--

    @Throws(DuplicateNameException::class)
    suspend fun update(payload: CategoryUpdate)

    suspend fun delete(categoryId: Long)

    suspend fun checkDuplicateName(name: String): Boolean
}

class DuplicateNameException(name: String) : Exception("There's a category which is named \"$name\" already")
