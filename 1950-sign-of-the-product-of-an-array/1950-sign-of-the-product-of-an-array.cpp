class Solution {
public:
int arraySign(vector<int> &nums)
{
    char countOfNeg = 0;
    for (int i = 0; i < nums.size(); i++)
    {
    if (nums.at(i) == 0)
    {
        return 0;
    }
    if (nums.at(i) < 0)
    {
        countOfNeg++;
        continue;
    }
    }
    (countOfNeg%2==0) ? countOfNeg = 1: countOfNeg = -1;
    return countOfNeg;
}
};