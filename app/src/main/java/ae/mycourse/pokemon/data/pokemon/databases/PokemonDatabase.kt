package ae.mycourse.pokemon.data.pokemon.databases

import ae.mycourse.pokemon.data.pokemon.datasources.PokemonDao
import ae.mycourse.pokemon.data.pokemon.entities.FavouriteList
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [FavouriteList::class], version = 1)
abstract class PokemonDatabase: RoomDatabase() {

    abstract fun getPokemonDao(): PokemonDao
}