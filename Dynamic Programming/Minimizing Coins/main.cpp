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

	vector<int> solution (x + 1);

	solution[0] = 0;
	for (int i = 1; i <= x; i ++) {
		solution[i] = 1e9;
		for (int c: coins) {
			if (i - c >= 0) {
				solution[i] = min(solution[i], solution[i - c] + 1);
			}
		}
	}

	cout << (solution[x] == 1e9 ? -1 : solution[x]) << '\n';
}
