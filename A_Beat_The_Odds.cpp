#include<bits/stdc++.h>

using namespace std;

#define int long long int

int32_t main(){
    int t;
    cin>>t;
    while(t--){
        int n;
        cin>>n;
        vector<int> arr(n);
        for (int i=0;i<n;i++) {
            cin>>arr[i];
        }

        int co=0,ce=0;
        for (int i=0;i<n;i++){
            if (arr[i]%2) co++;
            else ce++;
        }
        cout<<min(co,ce)<<endl;
    }

    return 0;
}