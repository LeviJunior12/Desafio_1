package br.com.digitalhouse.desafio

import java.util.*

class Matricula(var aluno: Aluno, var curso: Curso, var dataDeMatricula: Date = Date()) {
    override fun toString(): String {
        return "Matricula do Aluno ${aluno.nome} no curso ${curso.nome} na data de ${dataDeMatricula}"
    }
}