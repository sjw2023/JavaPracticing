//import java.io.BufferedOutputStream;
//import java,io.OutputStream;
//import java.net.Socket;
//import java.util.Date;
//
//public class SocketClientSample{
//    public static void main(String[] args){
//        SocketClientSample sample = new SocketClientSample();
//        sample.sendSocketSample();
//    }
//    public void send SocketSample(){
//        for(int loop = 0; loop < 3 ; loop++){
//            sendSocketData( "I lided java at" + new Date() );
//        }
//        sendSocketData("EXIT");
//    }
//    public void sendSocketData(String data){
//        Socket socket = null;
//        try{
//            System.out.println("Client:connecting");
//            Socket=new Socket("127.0.0.1", 9999); // 서버와 다르게 IP가 사용되어지는 모습. 지금 사용중인 IP는 컴퓨터 내부 접속임을 나타낸다.포트 넘버는 서버에서 사용하고 있는 포트넘버와 같아야 하며 소캣 생성자로 두 정보를 이용해 소켓을 만든다음 접속을 시도 한다
//            System.out.println("Client:Connet status"+ socket.isConnected());
//            Thread.sleep(1000);
//            OutputStream stream = socket.getOutputStream();//데이타를 서버에 전달하기 위해서 getOutputStream()메소드를 사용해 객체를 생성
//            BufferedOutputStream out = new BufferedOutputStream(stream);
//            byte[] bytes = data.getBytes();
//            out.write(bytes);
//            System.out.println("Client: Sent data");
//            out.close();
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally{
//            if(socket!=null){
//                try {
//                    socket.close();//접속 종료후 소ㅔㅅ 연결을 닫는다
//                }catch(Exception e){
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
//}
