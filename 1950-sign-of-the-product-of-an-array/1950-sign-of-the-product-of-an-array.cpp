class Solution {
public:
int arraySign(vector<int> &nums)
{
    char product = 1;
    for (int i = 0; i < nums.size(); i++)
    {
    if (nums.at(i) == 0)
    {
        return 0;
    }
    if (product*nums.at(i) > 0)
    {
        product = 1;
        continue;
    }
    product = -1;
    }
    return product;
}
};