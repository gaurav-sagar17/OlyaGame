import java.util.* ;
import java.math.BigInteger ; 

public class OlyaGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int t = sc.nextInt() ; 
        sc.nextLine() ;
        while(t > 0) {
            int n = sc.nextInt() ;
            sc.nextLine() ;
            ArrayList<ArrayList<Long>> storage = new ArrayList<ArrayList<Long>>() ;  
            long min = 0 ; 
            long sum = 0 ;
            for(int i = 0;i<n;i++) {
                int m = sc.nextInt() ;
                sc.nextLine() ;
                long e = sc.nextLong() ;
                long  fm = e ;
                long  sm = (long)Float.POSITIVE_INFINITY ;
                
                for(int j =1 ;j<m;j++) {
                    long a  = sc.nextLong() ;
                    if(a <= fm) {
                        sm = fm ;
                        fm = a ;
                    }
                    else if(a > fm && a < sm){
                        sm = a ;
                    }
                }
                ArrayList<Long> a = new ArrayList<Long>() ; 
                a.add(fm) ;
                a.add(sm) ;
                sum += sm ;
                storage.add(a) ;
                sc.nextLine() ;
                if(i == 0 ) {
                    min = fm ;
                }
                else {
                    if(min > fm){
                        min = fm ;
                    }
                }
                
                
            }
            if(n ==1 ) {
                System.out.println((int)min);
            }
            
            // System.out.println(storage); 
            else {
                long maxi = 0 ;
                for(int i=0;i<n;i++){
                    long temp = sum   ; 
                    temp -= (storage.get(i).get(1)) ; 
                    temp += (min) ; 
                    if(temp > maxi) {
                        maxi = temp ;
                    }
                }
                System.out.println((int)maxi) ;
            }
            t-- ;
        }
        sc.close() ;

    }
}
