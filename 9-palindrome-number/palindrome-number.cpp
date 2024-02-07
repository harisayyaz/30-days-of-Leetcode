class Solution {
public:
    bool isPalindrome(int x) {
    string str1 = to_string(x);
    int size = str1.size();
    for (int i = 0; i < size; i++)
    {
        int character = int(str1.at(i)) - 48;
        int end = x % 10;
        if (character == end)
        {
            x /= 10;
            continue;
        }
        else
        {
            return false;
        }
    }
    if(x==0)
    {
        return true;
    }
    return false;
    }
};