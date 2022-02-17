package ru.netology

fun main() {

    val paymentSystem = "masterCard"
    val inputMoney = 100_000
    val result = commission(paymentSystem, inputMoney)
    println("Комиссия $result руб")
}

fun commission(paymentSystem: String = "vKPay", inputMoney: Int, monthlyTransfers: Int = 0): Int {

    val commission = when(paymentSystem) {

        "masterCard", "maestro" -> if (monthlyTransfers + inputMoney < 75_000) {
                0
        } else {
            inputMoney * 0.006 + 20
        }

        "visa", "mir" -> if (inputMoney * 0.0075 < 35) {
            35
        } else {
            inputMoney * 0.0075
        }
            else -> 0
    }
     return commission.toInt()
}







