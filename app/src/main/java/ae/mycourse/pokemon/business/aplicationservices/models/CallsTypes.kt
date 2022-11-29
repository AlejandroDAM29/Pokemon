package ae.mycourse.pokemon.business.aplicationservices.models

enum class CallsTypes constructor(val value : String) {
    getURLBaseContent("URLBaseContent"),
    getListPokemon("ListPokemon")
}