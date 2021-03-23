package hu.nive.ujratervezes.potvizsga.words;

class Words {

    public boolean hasMoreDigits(String s) {
        int digit = 0;
        int alphabet = 0;
        for (Character c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                digit++;
            } else {
                alphabet++;
            }
        }
        return digit > alphabet;
    }

}
