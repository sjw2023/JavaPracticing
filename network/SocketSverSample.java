//import java.io.bufferedReader;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//
///*
//데이타로  EXIT이 전송 되기 전까지 계속 해서 전송되는 데이타를 출력하는 서버
//*/
//public class SocketServerSample{
//
//    ServerSocket server = null;
//    Socket client = null;
//    try{
//        server = new ServerSocket(9999); // 포트 번호 9999의 ServerSocket 생성 다른프로그램에서 이프로그램으로 만든 서버에 접속 하려면 9999의 포트 넘버를 사용하여야 한다
//        while (true) {
//            System.out.println("Server is watiing for reuest");
//            client = server.accept();// ServerSocket 클래스에 선언되어 있는 accept() 메소드를 호출하면 다른 원격 호출을 다기하는 상태가 된다. 즉, 연결이 들어올때까지 기다린다. 이후 연결이 들어와 연결이 완료되면 Socket객체를 리턴하여 client라는 변수에 할당한다.
//            System.out.println("Server:Accepted");
//            InputStream stream = client.getInputStream();// 데이타를 받기 위해서 Socket클래스에 선언된  getInputStream() 메소드를 호출하여  InputStream객체를 받았다. 만약 접속한 상대에게 데이터를 전송하려면 getOutputStream()메소드를 호출하여 OutputStream 객체를 받은후 이 stream에 데이타를 전달하면된다.
//            BufferedReader in = new BufferedReader(new InputStreamReader(stream));
//            String data = null;
//            StringBuilder recievedData = new StringBuilder();
//            while( (data = in.readLine()) != null ){
//                recievedData.append(data);
//            }
//            System.out.println("Recieved data: " + reviewData);
//            in.close();
//            stream.close();
//            client.close(); // 모든 데이타 처리가 끝난후 Socket 사용이 종료되었다는 것을 알리기 위해 Close() 메소드를 호출한다
//            if(recievedData!=null && "EXIT".equals(recievedData.toString())){
//                System.out.println("Stop Socketserver");
//                break;
//            }
//            System.out.println("------------");
//        }
//
//    }catch(Exception e){
//        e.printStackTrace();
//    }finally{
//        if (server != null){
//            try{
//                server.close(); // 더 이상 소켓 수신할 필요가 없을 때에는 이와 같이 ServerSocket의 Close() 메소드를 호출하면 된다.
//            }catch(Exception e){
//                e.printStackTrace();
//            }
//        }
//    }
//}
