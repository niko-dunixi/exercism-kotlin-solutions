fun transcribeToRna(dna: String): String {

    val rna = dna.map(::transcribeNucleotide).joinToString(separator = "")

    return rna
}

fun transcribeNucleotide(nucleotide: Char): Char {
    return when (nucleotide) {
        'G' -> 'C'
        'C' -> 'G'
        'T' -> 'A'
        'A' -> 'U'
        else -> throw IllegalArgumentException("Illegal DNA nucleotide.")
    }
}
