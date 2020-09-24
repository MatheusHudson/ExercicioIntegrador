class Colecao(titulo: String,
              autor: String, anoLancamento: Int,
              qdtEstoque: Int, preco: Double, var livro: MutableList<Livro>) : Livro(
        titulo, autor,
        anoLancamento, qdtEstoque, preco
) {

    override fun toString(): String {
        return "Colecao(livro=$livro)"
    }
}