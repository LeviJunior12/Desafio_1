package br.com.digitalhouse.desafio

class ProfessorAdjunto(
    override var nome: String,
    override var sobrenome: String,
    override var tempoDeCasa: Int,
    override var codigoDeProfessor: Int,
    var quantidadeHorasMonitoria: Int
) : IProfessor {
    override fun equals(other: Any?): Boolean {
        return other == codigoDeProfessor
    }

    override fun toString(): String {
        return "O nome do professor Adjunto é ${nome} ${sobrenome} o tempo de casa é ${tempoDeCasa} o código é ${codigoDeProfessor} e a quantidade de horas de monitoria é ${quantidadeHorasMonitoria}"
    }
}