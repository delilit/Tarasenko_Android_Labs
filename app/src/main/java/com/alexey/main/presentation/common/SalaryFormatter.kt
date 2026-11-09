package com.alexey.main.presentation.common

fun formatSalary(min: Int?, max: Int?): String = when {
    min != null && max != null -> "от $min до $max ₽"
    min != null -> "от $min ₽"
    max != null -> "до $max ₽"
    else -> "Зп не указана"
}