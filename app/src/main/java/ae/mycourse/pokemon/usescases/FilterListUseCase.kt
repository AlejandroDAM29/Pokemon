package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.domain.ListPokemonsModel
import android.util.Log

class FilterListUseCase {
    fun invoke(): ListPokemonsModel{
        Log.i("mensaje invoke","Entra en el invoke")
        var names: MutableList<String> = mutableListOf()
        var images: MutableList<String> = mutableListOf()

        names.add("pikachu")
        images.add("https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png")
        return ListPokemonsModel(names, images)
    }
}