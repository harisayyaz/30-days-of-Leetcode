class Solution {
public:
    vector<int> selfDividingNumbers(int left, int right) {
        vector<int> numbers = {};
    for (int i = left; i <= right; i++)
    {
        int num = i;
        while (num != 0)
        {
            int divider = num % 10;
            if (divider == 0)
            {
                break;
            }

            if (i % divider == 0)
            {
                num = num / 10;
            }
            else
            {
                break;
            }
        }
        if (num == 0)
        {
            numbers.push_back(i);
        }
    }
    return numbers;
    }
};