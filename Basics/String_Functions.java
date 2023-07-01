public class String_Functions {
    public static void main(String[] args){
        System.out.println("String functions");

        String name1="Tony";
        String name2="Tony";

//        s1>s2 : +ve
//        s1==s2 : 0
//        s1<s2 : -ve

        if(name1.compareTo((name2))==0){
            System.out.println("Strings are equall");
        }else{
            System.out.println("Strings are not equall");
        }

//        if(name1==name2){
//            System.out.println("Strings are equall");
//        }else{
//            System.out.println("Strings are not equall");
//        }

        // Gives wrong answer
//        if(new String("Nikku")==new String("Nikku")){
//            System.out.println("Strings are equall");
//        }else{
//            System.out.println("Strings are not equall");
//        }


        String name="TonyStark";
//      name.substring(beginIndex,endIndex);
//        String sen=name.substring(0,4);
        String sen=name.substring(4);
        System.out.println(sen);

    }
}
