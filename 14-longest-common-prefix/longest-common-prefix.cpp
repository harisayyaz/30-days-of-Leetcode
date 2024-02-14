class Solution {
public:
string longestCommonPrefix(vector<string> &strs)
{
    int sizeOFirst = strs.at(0).size();
    int sizeOfArray = strs.size();
    string ans = "";
    bool flag = true;

    for (int i = 0; i < sizeOFirst; i++)
    {
        char curr = strs.at(0)[i];
        for (int j = 1; j < sizeOfArray; j++)
        {
            if (strs.at(j)[i] != curr)
            {
                return ans;
            }
        }
        ans += curr;
    }
    return ans;
}
};