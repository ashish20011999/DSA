public class MostVowels {
    public static void main(String args[]) {
        String string = "weallloveyou";
        int k = 7;
        System.out.println(maxVowels(string, k));
    }

    public static int maxVowels(String string, int count) {
        int maxVowelCount = 0;
        for (int i = 0; i < string.length() - count - 1; i++) {
            int tempCount = 0;
            for (int j = i; j < i + count; j++) {
                switch (string.charAt(j)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        tempCount++;
                    default:
                        continue;
                }
            }
            if(tempCount>maxVowelCount)
                maxVowelCount=tempCount;
        }
        return maxVowelCount;
    }
}
