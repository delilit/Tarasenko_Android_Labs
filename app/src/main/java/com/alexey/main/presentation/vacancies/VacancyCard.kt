package com.alexey.main.presentation.vacancies

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.alexey.main.data.testVacancies
import com.alexey.main.domain.model.Vacancy
import com.alexey.main.presentation.common.formatSalary
import com.alexey.main.ui.theme.MainTheme

@Composable
fun VacancyCard(vacancy: Vacancy, onClick: () -> Unit, modifier: Modifier = Modifier) {
    Card(onClick = onClick, modifier = modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(vacancy.jobName, style = MaterialTheme.typography.titleMedium)
            Text(vacancy.companyName)
            Text(formatSalary(vacancy.salaryMin, vacancy.salaryMax))
            Text(vacancy.region)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun VacancyCardPreview() {
    MainTheme {
        VacancyCard(testVacancies[1], onClick = {})
    }
}