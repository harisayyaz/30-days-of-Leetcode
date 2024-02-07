class Solution {
public:
    bool isValid(string s)
{
    stack<char> stack;
    for (int i = 0; i < s.size(); i++)
    {
        if (s.at(i) == '(' || s.at(i) == '[' || s.at(i) == '{')
        {
            stack.push(s.at(i));
        }
        else
        {
            if (stack.empty())
            {
                return false;
            }
            else
            {
                if ((s.at(i) == ')' && stack.top() != '(') || (s.at(i) == '}' && stack.top() != '{') || (s.at(i) == ']' && stack.top() != '['))
                {
                    return false;
                }
                else
                {
                    stack.pop();
                }
            }
        }
    }
    if (stack.empty())
    {
        return true;
    }
    else
    {
        return false;
    }
}
};