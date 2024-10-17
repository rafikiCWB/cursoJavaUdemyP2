void main() {
    String str = "RafaeL";
    for (int i = str.length() - 1; i >= 0; i--) {
        str += str.charAt(i);
    }
    System.out.println(str.substring(6));
}

