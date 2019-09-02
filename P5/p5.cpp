#include <iostream>
#include <stdlib.h>

using namespace std;

int main( int argc, char *argv[] )
{
    //int n = atoi( argv[1] );
    int n;
    scanf("%d", &n);
        int m = 100000007;
        int *A = new int [n];
        int *P = new int [n];
        int *L = new int [n];
        
        P[0] = 1;
        L[0] = 1;
        L[1] = 3;
        A[0] = 1;
        A[1] = 2;
        A[2] = 4;
        
        if(n == 1) return 3;
        
        for(int i = 1; i < n; i++)
        {
            A[i - 1] %= m;
            P[i - 1] %= m;
            L[i - 1] %= m;
            
            P[i] = ((A[i - 1] + P[i - 1]) % m + L[i - 1]) % m;
            
            if(i > 1) L[i] = ((A[i - 1] + P[i - 1]) % m + (A[i - 2] + P[i - 2]) % m) % m;
            
            if(i > 2) A[i] = ((A[i - 1] + A[i - 2]) % m + A[i - 3]) % m;
        }
        
    cout << ((A[n - 1] % m + P[n - 1] % m) % m + L[n - 1] % m) % m  << endl;
    
    return 0;
}
