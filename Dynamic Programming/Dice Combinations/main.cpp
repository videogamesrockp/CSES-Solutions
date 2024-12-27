#include<bits/stdc++.h>
#define ll long long
using namespace std;


int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n; cin >> n;

	vector<int> solve(n);
	solve[0] = 1;

	for (int i = 1; i <= n; i ++) {
		solve[i] = 0;
		for (int r = 1; r <= 6; r ++) {
			if (i - r >= 0) {
				solve[i] += solve[i - r];
				solve[i] %= (1000000007);
			}
		}
	}

	cout << solve[n] << '\n';
}
