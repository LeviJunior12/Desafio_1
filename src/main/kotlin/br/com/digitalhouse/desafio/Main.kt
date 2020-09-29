package br.com.digitalhouse.desafio

fun main() {
    println("------------- ALUNO --------------------")
    var aluno1 = Aluno("Levi", "Junior", 123)
    var aluno2 = Aluno("João", "Silva", 124)

    println(aluno1.toString())
    println(aluno2.equals(aluno1))

    var listaAlunos1 = mutableListOf<Aluno>(aluno1, aluno2)
    var listaAlunos2 = mutableListOf<Aluno>(aluno1, aluno2)

    println("------------------- PROFESSOR TITULAR ----------------")
    var professor1 = ProfessorTitular("Vitoria", "Santos", 3, 789, "Kotlin")
    var professor2 = ProfessorTitular("Jessica", "Correa", 4, 781, "Java")

    var listaProfessoresTitular = mutableListOf<ProfessorTitular>()

    println(professor1.toString())
    println(professor2.equals(professor1))

    println("------------------- PROFESSOR ADJUNTO -------------------")
    var professorAdjunto1 = ProfessorAdjunto("Flavia", "Silva", 8, 453, 7)
    var professorAdjunto2 = ProfessorAdjunto("Clarice", "Lisp", 2, 458, 4)

    var listaProfessoresAdjunto = mutableListOf<ProfessorAdjunto>()

    println(professorAdjunto1.toString())
    println(professorAdjunto2.equals(professorAdjunto1))

    println("------------------------ CURSO ----------------")
    var curso1 = Curso("Kotlin", 456, 3)
    var curso2 = Curso("Java", 456, 2)
    var curso3 = Curso("Javaa", 4572, 1)

    var listaCurso = mutableListOf<Curso>()

    println(curso1.toString())
    println(curso2.toString())
    println(curso3.toString())
    println(curso1.equals(curso2))

    println("-------------------- MATRICULA -----------------------")
    var matricula1 = Matricula(aluno1, curso1)

    var listaMatricula = mutableListOf<Matricula>()

    println(matricula1.toString())

    println("-------------------------- DIGITAL HOUSE MANAGER ------------------")
    var digitalhm = DigitalHouseManager(listaAlunos1, listaProfessoresTitular, listaProfessoresAdjunto,listaCurso, listaMatricula)
    println(digitalhm.toString())

    println("------------------------- PART H ---------------------------------")
    var aluno3 = Aluno("Rodolfo", "Silva", 951)
    var aluno4 = Aluno("Carlos", "Silva", 958)

    if (curso1.adicionarUmAluno(aluno3)) {
        println("Aluno adicionado!")
    }

    if (curso1.adicionarUmAluno(aluno2)) {
        println("Aluno adicionado!")
    }

    if (curso1.adicionarUmAluno(aluno1)) {
        println("Aluno adicionado!")
    }

    // Aluno não pode entrar no curso por causa da quantidade de aluno maxima
    if (curso1.adicionarUmAluno(aluno4)) {
        println("Aluno adicionado!")
    }

    // Excluir aluno
    curso1.excluirAluno(aluno2)

    println("---------------------------- PART I ---------------------------------")

    // Registrar Curso
    digitalhm.registrarCurso("Java2", 654, 2)
    digitalhm.registrarCurso("Java3", 655, 1)

    // Realizar Exclusão
    digitalhm.excluirCurso(654)

    // Registrar professor Titular
    digitalhm.registrarProfessorTitular("Francisco", "Silva", 8822, "React")
    digitalhm.registrarProfessorTitular("Renato", "Silva", 8823, "Agile")

    // Registrar professor adjunto
    digitalhm.registrarProfessorAdjunto("Bianca", "Silva", 8821, 4)
    digitalhm.registrarProfessorAdjunto("Fernado", "Silva", 8824, 1)


    // Excluir um professor
    digitalhm.excluirProfessor(8821)

    //Matricular Aluno
    digitalhm.matricularAluno("Patricia", "Silva", 7777)
}