package br.com.digitalhouse.desafio

class Curso(
    var nome: String,
    var codigoDoCurso: Int,
    var quantidadeMaximaAlunos: Int,
    var listaDeAlunos: MutableList<Aluno> = mutableListOf<Aluno>(),
) {

    lateinit var professorTitular: ProfessorTitular
    lateinit var professorAdjunto: ProfessorAdjunto

    constructor(
        nome: String,
        codigoDoCurso: Int,
        quantidadeMaximaAlunos: Int,
        listaDeAlunos: MutableList<Aluno>,
        professorTitular: ProfessorTitular,
        professorAdjunto: ProfessorAdjunto
    ) : this(nome, codigoDoCurso, quantidadeMaximaAlunos, listaDeAlunos) {
        this.professorTitular = professorTitular
        this.professorAdjunto = professorAdjunto
    }

    fun adicionarUmAluno(umAluno: Aluno): Boolean {
        return if (listaDeAlunos.size >= quantidadeMaximaAlunos) {
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
        return "O nome do curso é ${nome} e o código do curso é ${codigoDoCurso}}"
    }

}