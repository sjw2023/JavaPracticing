class tryCatch{

    public static void main(String[] args){

        try{
            //예외가 발생할수 있는 코드가 들어가는 블록
        throw new Exception();// 강제 예외 출력
        }
        catch( Exception e ) {
        //예외 발생시 실행되는 부분
        e.printStackTrace(); // 요류 출력 하는 방법 중 하나
        }
        finally{
        //예외 발생 유무에 상관없이 항상 실행 되는 부분
        }
        
    }

}
