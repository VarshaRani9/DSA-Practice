public class Fibonacci {
// Recursion
	static int fibRec(int n) {
        // Base Case
        if(n <= 1) {
            return n;
        }
        int first = fibRec(n - 1);
        int second = fibRec(n - 2);
        int result = first + second;
        return result;
    }

// Memoization
    static int fibMemo(int n, int cache[]) {
        // Base Case
        if(n <= 1) {
            return n;
        }
        if(cache[n] != 0) {
            return cache[n];
        }
        int first = fibMemo(n - 1, cache);
        int second = fibMemo(n - 2, cache);
        int result = first + second;
        cache[n] = result;
        return cache[n];
    }
    
//    Tabulation
    static int fibTab(int n) {
        int cache[] = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;
        // cache[2] = cache[1] + cache[0];
        // cache[3] = cache[2] + cache[1];
        for(int i = 2; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }
        return cache[n];
    }

    public static void main(String[] args) {
        int n = 30;
        long start = System.currentTimeMillis();
        int res = fibRec(n);
        long end = System.currentTimeMillis();
        long total = end - start;
        System.out.println("Result using recursion : " + res);
        System.out.println("Time taken using recursion : " + total);
        int cache[] = new int[n+1];
        start = System.currentTimeMillis();
        res = fibMemo(n, cache);
        end = System.currentTimeMillis();
        total = end - start;
        System.out.println("Result using memoization : " + res);
        System.out.println("Time taken using memoization : " + total);
        res = fibTab(n);
        end = System.currentTimeMillis();
        total = end - start;
        System.out.println("Result using tabulation : " + res);
        System.out.println("Time taken using tabulation : " + total);
    }
}
