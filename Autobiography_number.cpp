#include<bits/stdc++.h>

using namespace std;

int main() {
    string n;
    cin>>n;
    bool isAutobiographyNumber = true;
    map<char, int> mp;
    for (int i=0; i<n.size(); i++) {
        mp[n[i]]++;
    }

    for (int i=0; i<n.size(); i++) {
        char c = i + '0';
        auto it = mp.find(c);
        if (it == mp.end()) {
            continue;
        }
        if (it!=mp.end() && it->second == n[i] - '0') {
            continue;
        } else {
            isAutobiographyNumber = false;
        }
    }

    if (isAutobiographyNumber) {
        cout<<mp.size();
    } else {
        cout<<0;
    }

    return 0;
}
