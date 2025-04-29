package br.senai.sp.jandira.lionschool.model

data class DetailedStudent(
    val name: String,
    val imageId: Int,
    val registration: String,
    val course: String,
    val grades: List<Grade>,
    val status: String
)