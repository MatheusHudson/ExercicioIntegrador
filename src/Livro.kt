class Livro(var titulo: String, var autor: String, var anoLancamento: Int,
            var qdtEstoque: Int, var preco: Double) {
    var codigo = 0
    override fun toString(): String {
        return "Livro(titulo='$titulo', autor='$autor', anoLancamento=$anoLancamento, qdtEstoque=$qdtEstoque, preco=$preco, codigo=$codigo)"
    }
}