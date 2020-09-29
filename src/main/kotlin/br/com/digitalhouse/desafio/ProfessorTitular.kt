package br.com.digitalhouse.desafio

class ProfessorTitular(
    override var nome: String,
    override var sobrenome: String,
    override var tempoDeCasa: Int,
    override var codigoDeProfessor: Int,
    var especialidade: String
) : IProfessor {
    override fun equals(other: Any?): Boolean {
        return other == codigoDeProfessor
    }

    override fun toString(): String {
        return "O Nome do professor(a) é ${nome} ${sobrenome} o código é ${codigoDeProfessor} e a especialidade é ${especialidade}"
    }
}