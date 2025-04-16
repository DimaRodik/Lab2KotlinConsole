fun main() {
    while (true) {
        print("Vvedit' summu v hryvnyakh abo 'exit' dlya vykhodu: ")
        val input = readLine()

        if (input == "exit") {
            println("Vykhid z programy.")
            break
        }

        val amountInUah = input?.toDoubleOrNull()
        if (amountInUah == null || amountInUah < 0) {
            println("❗ Vvedit' korektnu dodatnu chyslovu summu.")
            continue
        }

        print("Oberit' valiutu dlya konvertatsii (usd, eur, pln): ")
        val currency = readLine()?.lowercase()

        val rate = when (currency) {
            "usd" -> 0.025
            "eur" -> 0.023
            "pln" -> 0.11
            else -> {
                println("❗ Nekorektna valiuta. Sprobuyte shche raz.")
                continue
            }
        }

        val result = amountInUah * rate
        println("💱 $amountInUah hrn = ${"%.2f".format(result)} $currency")
    }
}
