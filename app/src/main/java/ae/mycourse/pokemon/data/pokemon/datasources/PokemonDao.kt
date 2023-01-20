package ae.mycourse.pokemon.data.pokemon.datasources

import ae.mycourse.pokemon.data.pokemon.entities.PokemonListEntity
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PokemonDao {
    @Query("SELECT * FROM pokemon_list")
    suspend fun getAllPokemonList(): MutableList<PokemonListEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllPokemonList(pokemon: MutableList<PokemonListEntity>)
}