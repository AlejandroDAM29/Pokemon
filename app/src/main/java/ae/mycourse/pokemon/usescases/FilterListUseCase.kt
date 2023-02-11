package ae.mycourse.pokemon.usescases

import ae.mycourse.pokemon.domain.ListPokemonsModel
import ae.mycourse.pokemon.framework.common.isNull

class FilterListUseCase {
    fun invoke(keyword: String?, pokemonList: ListPokemonsModel?): ListPokemonsModel{
        if(keyword.isNull()) {
            if (!pokemonList.isNull())
                return pokemonList!!
        }else{
            val pokemonListFiltered = ListPokemonsModel(mutableListOf(), mutableListOf())
            if (!pokemonList.isNull()){
                for ((index, name) in pokemonList!!.names.withIndex()){
                    if (name.contains(keyword!!) ){
                        pokemonListFiltered.names.add(name)
                        pokemonListFiltered.images.add(pokemonList.images[index])
                    }
                }
                return pokemonListFiltered
            }
        }
    return ListPokemonsModel(mutableListOf(), mutableListOf())
    }
}