package br.com.digitalhouse.desafio

class DigitalHouseManager(
    var listaDeAlunos: MutableList<Aluno>,
    var listaDeProfessores: MutableList<ProfessorTitular>,
    var listaDeCurso: MutableList<Curso>,
    var listaDeMatricula: MutableList<Matricula>
) {
    override fun toString(): String {
        return "$listaDeAlunos $listaDeProfessores $listaDeCurso $listaDeMatricula"
    }
}