package ae.mycourse.pokemon.data.pokemon.databases

import ae.mycourse.pokemon.data.pokemon.databases.entities.FavouriteList
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface PokemonDao {
    @Query("SELECT * FROM favourite_list")
    suspend fun getFavouriteList(): MutableList<FavouriteList>

    /*@Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAllPokemonList(pokemon: MutableList<PokemonListEntity>)*/
}