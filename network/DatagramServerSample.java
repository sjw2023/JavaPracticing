import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class DatagramServerSample{
    piblic static void main(String[] args){
        DatagramServerSample sample = new DatagramServerSample();
        sample.startServer();
    }
    public void startServer(){
        DatagramSocket server = null;
        try{
            server = new DatagramSocket(9999);//데이타 그램 객체를 포트 9999를 이용하여 생성
            int bufferLength(256);
            byte[] buffer = new byte[bufferLength];
            DatagramPacket packet = new DatagramPacket(buffer, bufferLength);//데이터를 받기 위한 DatagramPacket 객체를 byte 배열과 크기로 지정하여 생성
            while(true){
                System.out.println("Server:waiting for request");
                server.receive(packet);//데이터를 받기위해서 대기하고있다가, 데이터가 넘어오면 패킷 객체에 데이터를 담는다
                int dataLength = packet.getLength();//전송 받은 데이터의 크기를 확인한다.
                System.out.println("Server: recieved, data length = "+dataLength);
                String data = new String(packet.getData(),0,dataLength); // 스트링 클래스의 생성자를 사용하여 byte배열로 되어있는 데이타를 String 문자열로 변경 한다
                System.out.println("Recieved data: "+data);
                if(data.equals("EXIT")){
                    System.out.println("Stop DatagramServer");
                    break;
                }
                System.out.println("---------------;");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if (server != null){
                try{
                    server.close(); //모든 처리가 끝나면 socket 객체를 닫는다

                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
