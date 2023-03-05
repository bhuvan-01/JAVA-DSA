public class primeNumber {
    public static void main(String[] args) {
        int n = 40;
//        for (int i = 1; i <= n; i++) {
//            System.out.println(i + " " + isPrime(i));
//
//        }
        boolean[] prime = new boolean[n+1];
        sieve(n, prime);



    }
//    static boolean isPrime(int n){
//        if( n<= 1){
//            return false;
//        }
//        int c= 2;
//        while(c*c <= n ){
//            if(n % c == 0){
//                return false;
//            }
//            c++;
//
//        }
//        return true;
//    }
//flase in array number is prime
    static void sieve(int n , boolean[] prime){
        for (int i = 2; i*i <=n ; i++) {
            if(!prime[i]){
                for (int j = 2*i; j <=n ; j+=2) {
                    prime[j] = true;

                }


            }

        }
        for (int i = 2; i <= n; i++) {
            if(!prime[i]){
                System.out.print(i + " ");
            }

        }
    }
}
