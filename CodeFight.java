// https://codefights.com/challenge/okok2rHiWhetqWZfR/solutions/XojJpkzgLAstq4AFj
String[] CodeFight(int n) {
    String[] a = new String[n];
    for(int i = 1; i < n + 1; i++) {
        String b = "";
        if(i % 5 == 0)
            b += "Code";
        if(i % 7 == 0)
            b += "Fight";
        if(b.isEmpty())
            b = Integer.toString(i);
        a[i - 1] = b;
    }
    return a;
}
