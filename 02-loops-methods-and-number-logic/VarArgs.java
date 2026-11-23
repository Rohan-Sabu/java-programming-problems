class VarArgs{

    public static String concatenate(String... str){
        StringBuilder sb = new StringBuilder();
        for (String string : str) {
            sb.append(string).append(" ");   
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(concatenate("Rohan"));
        System.out.println(concatenate("Rohan", "Java"));
        System.out.println(concatenate("Java", "is", "fun"));
    }
}