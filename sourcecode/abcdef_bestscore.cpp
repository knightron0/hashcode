#include <bits/stdc++.h>
using namespace std;

#define pb push_back
#define fr first
#define sc second
#define clr(a, x) memset(a, x, sizeof(a))
#define dbg(x) cout<<"("<<#x<<"): "<<x<<endl;
#define printvector(arr) for (auto it = arr.begin(); it != arr.end(); ++it) cout<<*it<<" "; cout<<endl;
#define all(v) v.begin(), v.end()
#define lcm(a, b) (a * b)/__gcd(a, b)
#define int long long int
#define printvecpairs(vec) for(auto it: vec) cout<<it.fr<<' '<<it.sc<<endl;
#define endl '\n'
#define float long double

const int MOD = 1e9 + 7;
const int INF = 2e15;
const int MAXN = 1e5 + 5;

vector<string> val[MAXN];
map<string, int> cnt;

signed main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    #ifdef LOCAL
    freopen("in.txt", "r", stdin);
    freopen("out.txt", "w", stdout);
    #endif
    int n, m, s, c, f;
    cin>>n>>m>>s>>c>>f;
    set<int> st;
    while(s--){
    	int u, v, w;
    	string nice;
    	cin>>u>>v>>nice>>w;
        val[v].pb(nice);
        st.insert(v);
    }
    while(c--){
        int x;
        cin>>x;
        while(x--){
            string tmp;
            cin>>tmp;
            cnt[tmp]++;
        }
    }
    int tot = 0;
    for(auto it: st){
        vector<pair<int, string>> v;
        for(auto it2: val[it]){
            v.pb({cnt[it2], it2});
        }
        sort(all(v));
        reverse(all(v));
        int cnt = 0;
        for(auto it: v){
            if(it.fr == 0){
                break;
            }
            cnt++;
        }
        if(cnt == 0) continue;
        tot++;
    }
    cout<<tot<<endl;
    for(auto it: st){
        vector<pair<int, string>> v;
        for(auto it2: val[it]){
            v.pb({cnt[it2], it2});
        }
        sort(all(v));
        reverse(all(v));
        int cnt = 0;
        for(auto it: v){
            if(it.fr == 0){
                break;
            }
            cnt++;
        }
        if(cnt == 0) continue;
        cout<<it<<endl;
        cout<<cnt<<endl;
        for(int i= 0;i<cnt;i++){
            cout<<v[i].sc<<' '<<1<<endl;
        }
    }
   
    return 0;
}



