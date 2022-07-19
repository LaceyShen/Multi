public class Main {
    public static void main(String[] args) {
        System.out.println(printMulti(2,4));
        }

    private static String printMulti(int begin, int end) {
        String printMulti="";
        if(begin>end){
            return null;
        }
        if(begin<1||begin>1000||end<1||end>1000){
            return null;
        }
        for (int i = begin; i <= end; i++) {
            for (int j = begin; j <= i; j++) {
                printMulti+=j+"*"+i+"="+i*j+" ";
            }
            printMulti+="\n";
        }
        return printMulti;
    }
}
