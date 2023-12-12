public class exercici13 {
    public static void main(String[] args) {
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f};

        float suma = 0; // Variable per acumular la suma de les notes
        float notaMesBaixa = arrayNotes[0]; // Inicialitza la variable amb la primera nota
        float notaMesAlta = arrayNotes[0]; // Inicialitza la variable amb la primera nota

        for(int i = 0; i < arrayNotes.length; i++) {
            System.out.println(i + ". és: " + arrayNotes[i]);

            // Calcula la suma de les notes
            suma += arrayNotes[i];

            // Actualitza la nota més baixa si la nota actual és més baixa
            if (arrayNotes[i] < notaMesBaixa) {
                notaMesBaixa = arrayNotes[i];
            }

            // Actualitza la nota més alta si la nota actual és més alta
            if (arrayNotes[i] > notaMesAlta) {
                notaMesAlta = arrayNotes[i];
            }

            // Comprova si la nota és excel·lent (9 o més)
            if (arrayNotes[i] >= 9) {
                System.out.println("Hi ha un " + arrayNotes[i] + " a la posició " + i + " (Excel·lent)");
            }
        }

        // Calcula la nota mitjana
        float mitjana = suma / arrayNotes.length;

        // Mostra les estadístiques
        System.out.println("La nota mitjana és: " + mitjana);
        System.out.println("La nota més baixa és: " + notaMesBaixa);
        System.out.println("La nota més alta és: " + notaMesAlta);
    }
}