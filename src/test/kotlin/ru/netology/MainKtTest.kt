package ru.netology



import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun should_actual_commission_visa_075() {
        // arrange
        val inputCard = "visa"
        val inputMoney = 100_000
        val commission = 750
        val monthlyTransfers = 5000 + inputMoney
        // act
        val actualCommission = commission(inputCard, inputMoney, monthlyTransfers)
        // assert
        assertEquals(commission, actualCommission)
    }
    @Test
    fun should_actual_commission_visa_35() {
        // arrange
        val inputCard = "visa"
        val inputMoney = 1000
        val commission = 35
        val monthlyTransfers = 5_000 + inputMoney
        // act
        val actualCommission = commission(inputCard, inputMoney, monthlyTransfers)
        // assert
        assertEquals(commission, actualCommission)
    }
    @Test
    fun should_actual_commission_maestro_06() {
        // arrange
        val inputCard = "maestro"
        val inputMoney = 100_000
        val commission = 620
        val monthlyTransfers = 5000 + inputMoney

        // act
        val actualCommission = commission(inputCard, inputMoney, monthlyTransfers)
        // assert
        assertEquals(commission, actualCommission)
    }
    @Test
    fun should_actual_commission_maestro_0() {
        // arrange
        val inputCard = "maestro"
        val inputMoney = 5000
        val commission = 0
        val monthlyTransfers = 5000 + inputMoney
        // act
        val actualCommission = commission(inputCard, inputMoney, monthlyTransfers)
        // assert
        assertEquals(commission, actualCommission)
    }
    @Test
    fun should_actual_commission_vkPay() {
        // arrange
        val inputCard = "vkPay"
        val inputMoney = 100_000
        val commission = 0
        val monthlyTransfers = 5000 + inputMoney
        // act
        val actualCommission = commission(inputCard, inputMoney, monthlyTransfers)
        // assert
        assertEquals(commission, actualCommission)
    }




}


