#include<bits/stdc++.h>
#define ll long long
using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, x; cin >> n >> x;

	vector<int> coins (n);
	for (int i = 0; i < n; i ++) {
		cin >> coins[i];
	}

	vector<int> solutions (x + 1);

	solutions[0] = 1;
	int mod = 1e9 + 7;
	for (int i = 1; i <= x; i ++) {
		solutions[i] = 0;
		for (int c: coins) {
			if (i - c >= 0) {
				solutions[i] += solutions[i - c];
				solutions[i] %= mod;
			}
		}

		solutions[i] %= mod;
	}

	cout << solutions[x] << '\n';
}
