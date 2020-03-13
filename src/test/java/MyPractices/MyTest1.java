package MyPractices;

public class MyTest1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String str = "Java";

        if(sb.toString().equals(str.toString())){
            System.out.println("True");
        }else if (sb.equals(str)){
            System.out.println("False");
        }
    }
}
