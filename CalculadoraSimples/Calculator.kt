/* Programa para visar treino inicial em variáveis e uso de funções */

const val ADICAO = 1
const val SUBTRACAO = 2
const val MULTIPLICACAO = 3
const val DIVISAO = 4

fun adicao(val1:Int, val2:Int) = val1.plus(val2)

fun subtracao(val1:Int, val2:Int) = val1 - val2

fun multiplicacao(val1:Int, val2:Int) = val1 * val2

fun divisao(val1:Int, val2:Int) = val1 / val2

fun calculadoraInt(val1:Int, val2:Int, operacao: (Int,Int) -> Int) : Int {
    val resultado = operacao (val1,val2)
    return resultado
}

fun main() {

    val opList:IntArray = intArrayOf(5,2,MULTIPLICACAO) //Alterar aqui a conta desejada
    var resultado:Int? = null

    when(opList[2]){
        //Chamando somente função single-line
        ADICAO -> resultado = adicao (opList[0],opList[1]) 
        //Utilizando função de ordem superior
        SUBTRACAO -> resultado = calculadoraInt (opList[0],opList[1],::subtracao) 
        MULTIPLICACAO -> resultado = calculadoraInt (opList[0],opList[1],::multiplicacao) 
        DIVISAO -> resultado = calculadoraInt (opList[0],opList[1],::divisao) 
    }

    println ("$resultado")
}