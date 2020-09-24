class Livraria(var listaLivros: MutableList<Livro>, var listaColecoes: MutableList<Colecao>) {
    var codigoBarra = 0

    fun cadastrarLivro(livro: Livro) {
        livro.codigo = codigoBarra++
        listaLivros.add(livro)
    }

    init {
        cadastrarLivro(Livro("Cronicas de fogo", "George", 1874, 15, 56.45))
        cadastrarLivro(Livro("Cronicas de gelo", "George", 1963, 12, 65.45))
        cadastrarLivro(Livro("Instrumentos Mortais", "Cassandra", 187, 92, 30.67))
        cadastrarColecao(Colecao("Saga Maluca", "Lucas Macedo", 2020, 1, 89.00, listaLivros))
    }

    fun cadastrarColecao(colecao: Colecao) {
        colecao.codigo = codigoBarra++
        listaColecoes.add(colecao)
    }

    fun busca(codigo: Int): List<Livro> {
        val buscaLivro = listaLivros.filter { it.codigo == codigo }
        val buscaColecao = listaColecoes.filter { it.codigo == codigo }
        when {
            buscaColecao.isEmpty() && buscaLivro.isEmpty() -> {
                return listOf()
            }
            else -> {
                when {
                    buscaColecao.isEmpty() -> {
                        return buscaLivro
                    }
                    else -> {
                        return buscaColecao
                    }
                }
            }
        }
    }

    fun consultar(codigo: Int) {
        when {
            busca(codigo).isEmpty() -> {
                println("Livro ou coleção não encontrado")
            }
            else -> {
                println("O codigo buscado foi: $codigo.")
                println(busca(codigo)[0])
            }
        }
    }

    fun efetuarVenda(codigo: Int) {
        if (busca(codigo).isEmpty() || busca(codigo)[0].qdtEstoque == 0) {
            println("Estoque Esgotado")
        } else {
            busca(codigo)[0].qdtEstoque--
        }
    }
}