
public class StringSorting {
    public static void bubbleSort(String[] words) {
        int n = words.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        // The soliloquy string from Problem 3
        String text = "To be or not to be, that is the question;"
                + " Whether 'tis nobler in the mind to suffer"
                + " the slings and arrows of outrageous fortune,"
                + " or to take arms against a sea of troubles,"
                + " and by opposing end them?";

        String[] words = text.split("[^a-zA-Z]+"); // remove special characters like the apostrophe in "'tis"

        bubbleSort(words);

        System.out.println("Sorted words:");
        for (String word : words) {
            if (!word.isEmpty()) { 
                System.out.println(word);
            }
        }
    }


}
