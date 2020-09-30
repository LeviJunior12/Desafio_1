package br.com.digitalhouse.desafio

fun main() {

    // Inicializando listas da classe digital manager
    var listaAlunos = mutableListOf<Aluno>()
    var listaProfessoresTitular = mutableListOf<ProfessorTitular>()
    var listaProfessoresAdjunto = mutableListOf<ProfessorAdjunto>()
    var listaMatricula = mutableListOf<Matricula>()
    var listaCurso = mutableListOf<Curso>()

    // Instancia da Classe Digital Manager
    var digitalHouseManager = DigitalHouseManager(listaAlunos, listaProfessoresTitular, listaProfessoresAdjunto, listaCurso, listaMatricula)

    println("\n ##################### Registrar Aluno ##########################")
    digitalHouseManager.matricularAluno("Levi", "Junior", 123)
    digitalHouseManager.matricularAluno("João", "Silva", 124)
    digitalHouseManager.matricularAluno("Junior", "Silv", 125)

    println("\n ##################### Registrar Professor Adjunto ##########################")
    digitalHouseManager.registrarProfessorAdjunto("Flavia", "Silva", 453, 7)
    digitalHouseManager.registrarProfessorAdjunto("Clarice", "Lisp", 458, 4)

    println("\n ##################### Registrar Professor Titular ##########################")
    digitalHouseManager.registrarProfessorTitular("Fernado", "Silva", 789, "Kotlin")
    digitalHouseManager.registrarProfessorTitular("Francisco", "Silva", 781, "Java")

    println("\n ##################### Registrar Curso ##########################")
    digitalHouseManager.registrarCurso("Full Stack", 20001, 3)
    digitalHouseManager.registrarCurso("Android", 20002, 2)

    // Alocar Professor
    println("\n ##################### Alocando Professor ##########################")
    digitalHouseManager.alocarProfessores(20001, 781, 453)
    digitalHouseManager.alocarProfessores(20002, 789, 458)

    // Matricular o Aluno
    // 2 Alunos no Full Stack
    println("\n ##################### Matricula Aluno Full Stack ##########################")
    digitalHouseManager.matricularAluno(123, 20001)
    digitalHouseManager.matricularAluno(124, 20001)

    // 3 Alunos no Android
    println("\n ##################### Matricula Aluno Android ##########################")
    digitalHouseManager.matricularAluno(123, 20002)
    digitalHouseManager.matricularAluno(124, 20002)
    digitalHouseManager.matricularAluno(125, 20002)

    println("\n ##################### Informação Das Listas Da Digital Manager ##########################")
    println(digitalHouseManager.toString())

}