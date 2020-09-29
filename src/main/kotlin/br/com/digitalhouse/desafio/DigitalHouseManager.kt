package br.com.digitalhouse.desafio

class DigitalHouseManager(
    var listaDeAlunos: MutableList<Aluno>,
    var listaDeProfessoresTitular: MutableList<ProfessorTitular>,
    var listaDeProfessoresAdjunto: MutableList<ProfessorAdjunto>,
    var listaDeCurso: MutableList<Curso>,
    var listaDeMatricula: MutableList<Matricula>
) {

    fun registrarCurso(nome: String, codigoCurso: Int, quantidadeMaximaDeAlunos: Int) {
        var curso = Curso(nome, codigoCurso, quantidadeMaximaDeAlunos)
        listaDeCurso.add(curso)
        println("O curso ${curso.nome} foi adicionado com sucesso")
        println(listaDeCurso)
    }

    fun excluirCurso(codigoCurso: Int) {
        var posicao: Int = -1

        for (curso in listaDeCurso) {
            if (curso.codigoDoCurso == codigoCurso)
                posicao = listaDeCurso.indexOf(curso)
        }

        if (posicao != -1)
            listaDeCurso.removeAt(posicao)

        println("O curso foi removido! Os cursos restantes são os: ${listaDeCurso}")
    }

    fun registrarProfessorAdjunto(
        nome: String, sobrenome: String,
        codigoProfessor: Int, quantidadeDeHoras: Int
    ) {
        var professor = ProfessorAdjunto(nome, sobrenome, 0, codigoProfessor, quantidadeDeHoras)
        listaDeProfessoresAdjunto.add(professor)

        println("O professor ${nome} foi adicionado!")
    }

    fun registrarProfessorTitular(
        nome: String, sobrenome: String,
        codigoProfessor: Int, especialidade: String
    ) {
        var professor = ProfessorTitular(nome, sobrenome, 0, codigoProfessor, especialidade)
        listaDeProfessoresTitular.add(professor)

        println("O professor ${nome} foi adicionado!")
    }

    fun excluirProfessor(codigoProfessor: Int) {
        var posicao: Int = -1
        var qualProfessor: Boolean = true

        for (professor in listaDeProfessoresTitular) {
            if (professor.codigoDeProfessor == codigoProfessor) {
                posicao = listaDeProfessoresTitular.indexOf(professor)
                qualProfessor = true
            }

        }

        for (professor in listaDeProfessoresAdjunto) {
            if (professor.codigoDeProfessor == codigoProfessor) {
                posicao = listaDeProfessoresAdjunto.indexOf(professor)
                qualProfessor = false
            }
        }

        if (posicao != -1 && qualProfessor) {
            listaDeProfessoresTitular.removeAt(posicao)
            println("Professor Removido")
        } else if (posicao != -1 && !qualProfessor) {
            listaDeProfessoresAdjunto.removeAt(posicao)
            println("Professor Removido")
        }
    }

    fun matricularAluno(nome: String, sobrenome: String, codigoAluno: Int) {
        var aluno = Aluno(nome, sobrenome, codigoAluno)
        listaDeAlunos.add(aluno)
        println("O aluno(a) ${aluno.nome} foi adicionado!")
    }

    override fun toString(): String {
        return "$listaDeAlunos $listaDeProfessoresTitular $listaDeProfessoresAdjunto $listaDeCurso $listaDeMatricula"
    }
}