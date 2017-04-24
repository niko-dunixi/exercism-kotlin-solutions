fun transcribeToRna(dna: String): String {
    val rnaBuilder: StringBuilder = StringBuilder()

    for (letter in dna) {
        if (letter == 'G') {
            rnaBuilder.append('C')
        } else if (letter == 'C') {
            rnaBuilder.append('G')
        } else if (letter == 'T') {
            rnaBuilder.append('A')
        } else if (letter == 'A') {
            rnaBuilder.append('U')
        } else {
            throw IllegalArgumentException("Illegal DNA string.")
        }
    }

    return rnaBuilder.toString()
}
