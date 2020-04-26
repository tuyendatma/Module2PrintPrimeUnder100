public class Index {
    public static void main(String[] args) {
      int number=2;
      for (;number<100;number++){
          if(isPrime(number)){
              System.out.print(number+ ",");
          }
      }
    }
    public static boolean isPrime(int number){
        boolean check =true;
        if(number<2){
            check=false;
        }
        else {
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    check=false;
                    break;
                }
            }
        }
        return check;
    }
}
