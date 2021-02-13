package com.example.testyourbrain.utils

class ListQuestions {

    fun addList(): ArrayList<Questions> {

        val listQuestions: ArrayList<Questions> = ArrayList()
        listQuestions.add(Questions(
                "Где расположен Стоунхендж ?", "Великобритания",
                "Франция", "США", "Великобритания", "Канада"
            )
        )
        listQuestions.add(Questions(
                "Чему равняется 4+4*4 ?",
                "20", "32", "64", "16", "20"
            )
        )
        listQuestions.add(Questions(
            "В каком году основали ООН ?",
            "1945", "1945", "1918", "1961", "2000"
        ))
        listQuestions.add(Questions(
            "В какой стране самое большое население ?",
            "Китай", "Япония", "Китай", "США", "Индия"
        ))
        listQuestions.add(Questions(
            "Какая по счету Земля планета от Солнца ?",
            "3", "1", "2", "3", "4"
        ))
        listQuestions.add(Questions(
            "Какой самый большой Океан ?",
            "Тихий", "Атлантический", "Индийский", "Северный Ледовитый", "Тихий"
        ))
        listQuestions.add(Questions(
            "Сколько хромосом у человека ?",
            "46", "46", "47", "22", "23"
        ))
        listQuestions.add(Questions(
            "Какая самая большая планета в солнечной системе ?",
            "Юпитер", "Земля", "Юпитер", "Солнце", "Сатурн"
        ))
        listQuestions.add(Questions(
            "Какой самый кассовый фильм в истории ?",
            "Мстители: Финал", "Звёздные войны. Эпизод VII: Пробуждение Силы", "Титаник",
            "Мстители: Финал", "Аватар"
        ))
        listQuestions.add(Questions(
            "Где расположен Сфинкс ?",
        "Египет", "Греция", "Великобритания", "Италия", "Египет"
        ))
        listQuestions.add(Questions(
            "В каком городе расположена Статуя Свободы ?",
            "Нью-Йорк", "Нью-Йорк", "Вашингтон", "Берлин", "Токио"
        ))
        listQuestions.add(Questions(
            "Сколько чемпионских титулов у Михаэля Шумахера в Формуле 1 ?",
            "7", "7", "5", "10", "8"
        ))
        listQuestions.add(Questions(
            "Какое из перечисленных зданий самое высокое ?",
            "Бурдж-Халифа", "Шанхайская башня", "Бурдж-Халифа",
            "Королевская часовая башня", "Международный финансовый центр Ping An"
        ))
        listQuestions.add(Questions(
            "В какой стране обитают Кенгуру ?",
            "Австралия", "ЮАР", "Австрия", "Таиланд", "Австралия"
        ))
        listQuestions.add(Questions(
            "В каком году состоялся первый полёт человека в космос ?",
            "1961", "1961", "1969", "1959", "1963"
        ))
        listQuestions.add(Questions(
            "Как называется крупнейшая технологическая компания в Южной Корее ?",
            "Samsung", "Samsung", "LG", "Sony", "Sharp"
        ))
        listQuestions.add( Questions(
            "Сколько минут идет свет от Солнца к Земле ?",
            "8", "8", "5", "10", "1"
        ))
        listQuestions.add(Questions(
            "Чему равна скорость света ?",
            "~300 000 км/с", "~300 000 км/с", "~60 км/ч", "~1 000 000 м/с", "~10 000 км/с"
        ))
        return listQuestions
    }
}