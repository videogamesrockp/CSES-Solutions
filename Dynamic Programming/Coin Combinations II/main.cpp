#include<bits/stdc++.h>
#define ll long long
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int mod = 1e9+7;
	int n, x; cin >> n >> x;

	vector<int> coins(n);

	for (int i = 0; i < n; i ++) {
		cin >> coins[i];
	}

	vector<vector<int>> solve (n + 1, vector<int>(x + 1, 0));

	solve[0][0] =  1;

	for (int i = 1; i <= n; i ++) {
		for (int j = 0; j <= x; j ++) {
			solve[i][j] = solve[i - 1][j];

			if (j - coins[i - 1] >= 0) {
				solve[i][j] += solve[i][j - coins[i - 1]];
				solve[i][j] %= mod;
			}
		}
	}

	cout << solve[n][x] << '\n';
}
