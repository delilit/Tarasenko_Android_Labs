package com.alexey.main.domain.model

data class Vacancy(
    val id: String,
    val jobName: String,
    val companyName: String,
    val region: String,
    val salaryMin: Int? = null,
    val salaryMax: Int? = null,
    val schedule: String? = null,
    val education: String? = null,
    val experienceYears: Int? = null,
    val duty: String? = null,
    val requirements: String? = null,
    val address: String? = null,
    val phone: String? = null,
    val creationDate: String,
)
