// https://cses.fi/problemset/task/1640

#include <bits/stdc++.h>
using namespace std;

int main() {
    int n, target;
    cin >> n >> target;

    vector<pair<int, int>> vec;

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        vec.push_back({x, i + 1});
    }

    sort(vec.begin(), vec.end());
    int left = 0;
    int right = n - 1;
    while (left < right) {
        int sum = vec[left].first + vec[right].first;
        if (sum > target) {
            right--;
        } else if (sum < target) {
            left++;
        } else if (sum == target) {
            cout << vec[left].second << " " << vec[right].second << endl;
            return 0;
        }
    }

    cout << "IMPOSSIBLE" << endl;
}
