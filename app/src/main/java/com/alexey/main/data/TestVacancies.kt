package com.alexey.main.data

import com.alexey.main.domain.model.Vacancy

val testVacancies: List<Vacancy> = listOf(
    Vacancy(
        id = "a1f3c2e0-0001-4b7a-9c11-000000000001",
        jobName = "Android-разработчик",
        companyName = "ООО «Уральские технологии»",
        region = "Свердловская область",
        salaryMin = 120000,
        salaryMax = 180000,
        schedule = "Полный день",
        education = "Высшее",
        experienceYears = 2,
        duty = "Разработка мобильного приложения на Kotlin и Jetpack Compose, код-ревью, работа с REST API.",
        requirements = "Kotlin, Coroutines, Compose, Git. Опыт публикации приложений в Google Play.",
        address = "г. Екатеринбург, ул. Малышева, 51",
        phone = "+7 (343) 123-45-67",
        creationDate = "2026-11-01",
    ),
    Vacancy(
        id = "a1f3c2e0-0002-4b7a-9c11-000000000002",
        jobName = "Инженер-программист",
        companyName = "АО «Екатеринбургский завод»",
        region = "Свердловская область",
        salaryMin = 70000,
        schedule = "Сменный график",
        education = "Среднее профессиональное",
        experienceYears = 1,
        duty = "Сопровождение производственного ПО, настройка оборудования.",
        creationDate = "2026-10-28",
    ),
    Vacancy(
        id = "a1f3c2e0-0003-4b7a-9c11-000000000003",
        jobName = "Тестировщик мобильных приложений",
        companyName = "ИП Смирнов А. В.",
        region = "Челябинская область",
        salaryMax = 60000,
        schedule = "Удалённая работа",
        experienceYears = 0,
        creationDate = "2026-11-05",
    ),
    Vacancy(
        id = "a1f3c2e0-0004-4b7a-9c11-000000000004",
        jobName = "Оператор call-центра",
        companyName = "ООО «Связь-Сервис»",
        region = "Тюменская область",
        creationDate = "2026-11-07",
    ),
)
