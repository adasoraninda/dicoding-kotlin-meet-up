package com.dicoding.exam.coba

/**
 * Topik: Fungsi vs Lambda
 * Pembahasan:
 * Fungsi = lambda,
 * lambda hanya versi canggihnya fungsi.
 * lambda bisa menjadi fungsi tanpa nama.
 * lambda bisa menjadi parameter dari fungsi (callback).
 */

fun main() {
    // cara memanggil fungsi dan lamda, sama.
    println(printHelloBiasa())
    println(printHelloLambda())

    // onSuccess lambda bukan anonim, karena parameter fungsi diganti dengan variable
    // onFailure fungsi anonim, karena tanpa nama, dapat dibuat langsung tanpa fungsi/variabel
    getDataFromInternet(2,
        onSuccess = onSuccess,
        onFailure = { message ->
            println(message)
        })
}

/**
 * cara membuat fungsi dengan kembalian data berupa string
 */
fun printHelloBiasa(): String {
    return "Hello world biasa"
}

/**
 * cara membuat lambda dalam variabel dengan kembalian data berupa string
 */
val printHelloLambda: () -> String = { "Hello world lambda" }

/**
 * Contoh callback function
 */
fun getDataFromInternet(number: Int, onSuccess: (result: String) -> Unit, onFailure: ((error: String) -> Unit)?) {
    if (number % 2 == 0) {
        onSuccess("Sukses")
    } else {
        onFailure?.invoke("Gagal")
    }
}

/**
 * Contoh lambda bukan fungsi anonimus
 */
val onSuccess: (result: String) -> Unit = { println(it) }

/**
 * Contoh extension function
 */
fun String.hello(): String {
    return "Hello world $this"
}


