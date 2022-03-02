package ru.netology

fun main() {

    val paymentSystem = "masterCard"
    val inputMoney = 156246
    val result = commission(inputMoney, paymentSystem)
    println("Комиссия ${result / 100} руб ${result % 100} коп")
}
fun convertRub(inputMoney: Int): Int {
    return inputMoney * 100
}

fun commission(inputMoney: Int, paymentSystem: String = "vKPay", monthlyTransfers: Int = 0): Int {
    val penny = convertRub(inputMoney)

    val commission = when(paymentSystem) {

        "masterCard", "maestro" -> if (monthlyTransfers + inputMoney < 75_000) {
                0
        } else {
            penny * 0.006 + 2_000
        }

        "visa", "mir" -> if (penny * 0.0075 < 3_500) {
            3_500
        } else {
            penny * 0.0075
        }
            else -> error("Неподдерживаемая система оплаты: $paymentSystem")
    }
     return commission.toInt()
}







