package br.com.dio;

import br.com.dio.model.Cat;

public class primeiroPrograma {
    public static void main(String[] args) {
        Cat gato = new Cat();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 300);
        System.out.println(livro1);
    }
}

class Livro {
    private String titulo;
    private int numPaginas;

    public Livro(String titulo, int numPaginas) {
        this.titulo = titulo;
        this.numPaginas = numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
