package exercises.number11;

public class stringLenght {
    public static void main(String[] args) {
        String s = "welcome to java programing course!";
        System.out.format("String is: %s\n", s);
        System.out.format("length =%d\n", s.length());

        System.out.format("is empty=%s\n", s.isEmpty());
        System.out.format("char at position 3: %s\n", s.charAt(3));
        System.out.format("lower case:%s\n", s.toLowerCase());
        System.out.format("upper case:%s\n", s.toUpperCase());
        System.out.format("first space index:%d \n", s.indexOf(" "));
        System.out.format("first space index: %d\n", s.indexOf("course"));

        // Scanner input=new Scanner(System.in);
        //String s1=input.next();
        //System.out.println("String is : "+s1);


        System.out.format("end with ! :%s\n", s.endsWith("!"));


    }
}
