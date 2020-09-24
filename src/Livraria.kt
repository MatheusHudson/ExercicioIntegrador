class Livraria(var listaLivros: MutableList<Livro>, var listaColecoes: MutableList<Colecao>) {
    var codigoBarra = 0

    fun cadastrarLivro(livro: Livro) {
        livro.codigo = codigoBarra++
        listaLivros.add(livro)
    }

    fun cadastrarColecao(colecao: Colecao) {
        colecao.codigo = codigoBarra++
        listaColecoes.add(colecao)
    }

    fun busca(codigo: Int): List<Any> {
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
        var auxLivro = busca(codigo)[0] as Livro
        var auxColecao = busca(codigo)[0] as Colecao
        if (busca(codigo).isEmpty() || auxLivro.qdtEstoque == 0 || auxColecao.qdtEstoque == 0) {
            println("Estoque Esgotado")
        } else {
            (busca(codigo)[0] as Livro).qdtEstoque--
        }
    }
}