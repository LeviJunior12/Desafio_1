package br.com.digitalhouse.desafio

class Curso(
    var nome: String,
    var codigoDoCurso: Int,
    var professorTitular: ProfessorTitular,
    var professorAdjunto: ProfessorAdjunto,
    var quantidadeMaximaAlunos: Int,
    var listaDeAlunos: MutableList<Aluno>,
) {

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if(listaDeAlunos.size >= quantidadeMaximaAlunos) {
            println("Não é possivel adicionar o aluno no curso pois alcançou a capacidade maxima")
            false
        } else {
            listaDeAlunos.add(umAluno)
            println(listaDeAlunos.toString())
            true
        }
    }

    fun excluirAluno(umAluno: Aluno) {
        listaDeAlunos.remove(umAluno)
        println("Exclusão Feita Com Sucesso a lista de alunos é: ${listaDeAlunos}")
    }

    override fun equals(other: Any?): Boolean {
        return other == codigoDoCurso
    }

    override fun toString(): String {
        return "O nome do curso é ${nome} e o código do curso é ${codigoDoCurso} o Professor titular é ${professorTitular.nome} e o Professor adjunto é ${professorAdjunto.nome}"
    }
}