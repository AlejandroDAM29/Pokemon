package ae.mycourse.pokemon.interfacesadapter.gateway


import ae.mycourse.pokemon.business.modelservices.pokemonModel


class PokemonCalls {
    val pokemonNamesList: Array<String> = arrayOf(
        "Charmander",
        "Charmeleon",
        "Charizard",
        "Squirtle",
        "Blastoise",
        "Bulbasaur",
        "Venasaur",
        "Pikachu",
        "Himonchan",
        "Kabutox",
        "Marowak",
        "Gastly",
        "Hengar",
        "Magicar",
        "Raichu",
        "Mewtwo",
        "Mew",
        "Voltor",
        "Electrocude",
        "Speraow",
        "Pidgey",
        "Butterfly",
        "Jinx",
        "Onix",
        "Geoude",
        "Tangela",
        "Starmie",
        "Wartortle",
        "Abra",

    )

    fun getPokemonList(): ArrayList<pokemonModel> {
        //TODO Call to API service to take an array with all pokemon names. Change variable pokemonNamesList by the list from API
        var newArrayList = arrayListOf<pokemonModel>()
        for (i in pokemonNamesList.indices){
            val pokemonName = pokemonModel(pokemonNamesList[i])
            newArrayList.add(pokemonName)
        }
        return newArrayList
    }
}


/*
private lateinit var recyclerView: RecyclerView
private lateinit var adapter: RecyclerAdapter
private lateinit var pokemonList: PokemonList
private lateinit var pokemonNames: Array<String>*/
