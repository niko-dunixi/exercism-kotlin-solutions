fun transcribeToRna(dna: String): String {

    val rna = dna.map(::transcribeNucleotide).joinToString(separator = "")

    return rna
}

fun transcribeNucleotide(letter: Char): Char {
    return when (letter) {
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else -> throw IllegalArgumentException("Illegal DNA nucleotide.")
    }
}
