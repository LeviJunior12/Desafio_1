package br.com.digitalhouse.desafio

class Curso(var nome: String, var codigoDoCurso: Int) {
    override fun equals(other: Any?): Boolean {
        return other == codigoDoCurso
    }

    override fun toString(): String {
        return "O nome do curso é ${nome} e o código do curso é ${codigoDoCurso}"
    }
}