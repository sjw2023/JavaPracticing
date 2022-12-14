//package stream;
//
//import java.util.Arrays;
//import java.util.function.Function;
//import java.util.stream.Stream;
//// 스태틱 참조및 메소드 참
//public class MethodReferenceSample{
//    public static void main(String[] args){
//        MethodReferenceSample sample = new MethodReferenceSample();
//        String[] stringArray = {  "요다", "만두", "건빵"};
//        sample.staticReference( StringArray );
//    }
//
//    private static void printResult( String values ){
//        Syste.out.println(value);
//    }
//    private void staticReference(String[] stringArray){
//        Stream.of(stringArray).forEach(MethodReferenceSample::printResult);//메소드 참조
//    }
//}
//
//private void objectReference(String[] stringArray){
//    Arrays.sort(stringArray, String::compareToIgnoreCase); //임의 객체 참조
//    Arrays.asList(stringArray).stream().forEach(System.out::println)//스태틱 메소드 참조
//}
//
//
////생성자 참조
//interface MakeString{
//    String fromBytes( char[] chars );
//}
//
//private void createInstance(){
//    MakeString makeString = String::new;
//    char [] chars = ('G','o','d','o','f','j','a','v','a');
//    String madeString = MakeString.fromBytes(chars);
//    System.out.println(madeString);
//}
