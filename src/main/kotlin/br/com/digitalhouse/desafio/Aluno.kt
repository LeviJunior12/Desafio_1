package br.com.digitalhouse.desafio

class Aluno(var nome: String, var sobrenome: String, var codigoDeAluno: Int) {
    override fun equals(other: Any?): Boolean {
        return other == codigoDeAluno
    }

    override fun toString(): String {
        return "O nome do aluno é ${nome} ${sobrenome} e o código é ${codigoDeAluno}!"
    }
}