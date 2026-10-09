class Solution {
    public String oddString(String[] words) {
         int n = words.length;

        int[] first = getDifference(words[0]);
        int[] second = getDifference(words[1]);
        int[] third = getDifference(words[2]);

        int[] normal;

        if (java.util.Arrays.equals(first, second)) {
            normal = first;
        } else if (java.util.Arrays.equals(first, third)) {
            normal = first;
        } else {
            normal = second;
        }

        for (String word : words) {
            if (!java.util.Arrays.equals(getDifference(word), normal)) {
                return word;
            }
        }

        return "";
    }

    private int[] getDifference(String word) {
        int[] difference = new int[word.length() - 1];

        for (int i = 0; i < word.length() - 1; i++) {
            difference[i] = word.charAt(i + 1) - word.charAt(i);
        }

        return difference;
    }
}