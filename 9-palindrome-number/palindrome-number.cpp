class Solution {
public:
    bool isPalindrome(int x) {
    string str1 = to_string(x);
    int div = 10;
    for (int i = 0; i < str1.size(); i++)
    {
        int character = int(str1.at(i)) - 48;
        int end = x % div;
        if (character == end)
        {
            cout << "here";
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