class Bank{
    float getRateOfInterest(){return 0;}
}
class SBI extends Bank{
    float getRateOfInterest(){return 8.4f;}
}
class ICICI extends Bank{
    float getRateOfInterest(){return 7.3f;}
}
class AXIS extends Bank{
    float getRateOfInterest(){return 9.7f;}
}
class TestPolymorphism{
    public static void main(String args[]){
        Bank b;   //부모 클래스 변수
        b=new SBI();  //부모클래스 변수에 자식 클래스 객체 할당
        System.out.println("SBI Rate of Interest: "+b.getRateOfInterest());
        b=new ICICI();   //부모클래스 변수에 자식 클래스 객체 할당
        System.out.println("ICICI Rate of Interest: "+b.getRateOfInterest());
        b=new AXIS();   //부모클래스 변수에 자식 클래스 객체 할당
        System.out.println("AXIS Rate of Interest: "+b.getRateOfInterest());
        //이 상황이 런타임 폴리모피즘
    }
}
