fun transcribeToRna(dna: String): String {
    val rnaBuilder: StringBuilder = StringBuilder()

    for (letter in dna) {
        when (letter) {
            'G' -> rnaBuilder.append('C')
            'C' -> rnaBuilder.append('G')
            'T' -> rnaBuilder.append('A')
            'A' -> rnaBuilder.append('U')
            else -> throw IllegalArgumentException("Illegal DNA string.")
        }
    }

    return rnaBuilder.toString()
}
