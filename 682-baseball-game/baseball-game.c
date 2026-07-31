

int calPoints(char** operations, int operationsSize) {
    int stack[operationsSize];
    int top = -1;

    for (int i = 0; i < operationsSize; i++) {

        switch (operations[i][0]) {

            case '+':
                stack[top + 1] = stack[top] + stack[top - 1];
                top++;
                break;

            case 'D':
                stack[top + 1] = 2 * stack[top];
                top++;
                break;

            case 'C':
                top--;
                break;

            default:
                stack[++top] = atoi(operations[i]);
        }
    }

    int sum = 0;
    for (int i = 0; i <= top; i++)
        sum += stack[i];

    return sum;
}