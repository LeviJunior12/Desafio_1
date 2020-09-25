package br.com.digitalhouse.desafio

fun main() {
    println("------------- ALUNO --------------------")
    var aluno1 = Aluno("Levi", "Junior", 123)
    var aluno2 = Aluno("João", "Silva", 124)

    println(aluno1.toString())
    println(aluno2.equals(aluno1))

    println("------------------------ Curso ----------------")
    var curso1 = Curso("Kotlin", 456)
    var curso2 = Curso("Java", 457)

    println(curso1.toString())
    println(curso1.equals(curso2))

    println("------------------- PROFESSOR TITULAR ----------------")
    var professor1 = ProfessorTitular("Vitoria", "Santos", 3, 789, "Kotlin")
    var professor2 = ProfessorTitular("Jessica", "Correa", 4, 781, "Java")

    println(professor1.toString())
    println(professor2.equals(professor1))

    println("------------------- PROFESSOR ADJUNTO -------------------")
    var professorAdjunto1 = ProfessorAdjunto("Flavia", "Silva", 8, 453, 7)
    var professorAdjunto2 = ProfessorAdjunto("Clarice", "Lisp", 2, 458, 4)

    println(professorAdjunto1.toString())
    println(professorAdjunto2.equals(professorAdjunto1))
}