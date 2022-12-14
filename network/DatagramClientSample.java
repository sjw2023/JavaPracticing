//import java.net.DatagramPacket;
//import java.net.DatagramSocket;
//import java.net.InetAddress;
//import java.util.Date;
//
//
//public class DatagramClientSample(){
//    public static void main(String []args){
//        DatagramClientSample sample = new DatagramClientSample();
//        sample.sendDatagramSample();
//    }
//    public void sendDatagramSample(){
//        for(int loop = 0; loop <3 ; loop ++){
//            sendDatagramData( "I liked UDP "+ new Date() );
//        }
//    }
//    public void sendDatagramData(String data){
//        try{
//            DatagramSocket client = new DatagramSocket();//DatagramSocket을 생성 아무매개 변수 없이 생성해도 문제 없다
//            InetAddress address = InetAddress.getByName("127.0.0.1");//InetAddress를 사용하여 데이터를 받을 서버의 IP를 설정한다
//            byte[] buffer = data.getBytes();
//            DatagramPacket packet=  new DatagramPacket(buffer, 0, buffer.length, address, 9999);//데이터를 전송하기 위한 Datagrampacket을 생성한다, 서버의 주소와 포트 번호를 이렇게 지정하면 데이터를 받기위한 객체가 아니라, 저송하기 위한 객체가 된다.
//            client.send(packet);//데이터를 전송한다
//            System.out.println( "Client:Sent data" );
//            client.close();//소켓 연결을 종료한다
//            Thread.sleep(1000);
//
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//    }
//
//}
