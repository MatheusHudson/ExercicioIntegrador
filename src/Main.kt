fun main() {


    val livro1 = Livro("O Senhor dos Anéis: A Sociedade do Anel ",
            " Peter Jackson",2001,65,89.90)

    val livro2 = Livro("O Senhor dos Anéis: As Duas Torres ",
            " Peter Jackson",2002,35,94.90)

    val livro3 = Livro("O Senhor dos Anéis: O Retorno do Rei ",
            " Peter Jackson",2003,25,99.90)

    val livro4 = Livro(" Harry Potter e a Pedra Filosofal ",
            "  J.K. Rowling",2001,1,72.90)

    val livro5 = Livro(" Harry Potter e a Câmara Secreta ",
            "  J.K. Rowling",2002,91,74.90)

    val livro6 = Livro(" Harry Potter e o Prisioneiro de Azkaban ",
            "  J.K. Rowling",2003,14,75.90)

    val livro7 = Livro(" Harry Potter e o Cálice de Fogo ",
            "  J.K. Rowling",2004,13,76.90)

    val livro8 = Livro("  Harry Potter e a Ordem da Fênix ",
            "  J.K. Rowling",2001,31,78.90)

    val livro9 = Livro("   Maze Runner Correr ou Morrer ",
            "  James Dashner",2009,41,99.90)

    val livro10 = Livro("  Maze Runner Prova de Fogo ",
            "  James Dashner",2010,0,92.90)

    val colecao1 = Colecao("Senhor dos Aneis", "Editora Suster", 2005, 5,
    250.00, mutableListOf(livro1,livro2,livro3))

    val listaColecao = mutableListOf<Colecao>()

    val livraria = Livraria(mutableListOf(livro1,livro2,livro3,livro4,livro5,
            livro6,livro7,livro8,livro9),listaColecao)

    livraria.cadastrarLivro(livro1)
    livraria.cadastrarLivro(livro2)
    livraria.cadastrarLivro(livro3)
    livraria.cadastrarLivro(livro4)
    livraria.cadastrarLivro(livro5)
    livraria.cadastrarColecao(colecao1)
    livraria.consultar(1)
    livraria.efetuarVenda(3)
    livraria.efetuarVenda(3)

}