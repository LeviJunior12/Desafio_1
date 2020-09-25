package br.com.digitalhouse.desafio

class Curso(
    var nome: String,
    var codigoDoCurso: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var quantidadeMaximaAlunos: Int,
    var listaDeAlunos: MutableList<Aluno>,
) {

    override fun equals(other: Any?): Boolean {
        return other == codigoDoCurso
    }

    override fun toString(): String {
        return "O nome do curso é ${nome} e o código do curso é ${codigoDoCurso} o Professor titular é ${professorTitular.nome} e o Professor adjunto é ${professorAdjunto.nome}"
    }
}