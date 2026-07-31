#include <stdlib.h>

char* convertToTitle(int columnNumber) {
    char columns[26];

    for (int i = 0, j = 'A'; i < 26; i++, j++) {
        columns[i] = (char)j;
    }

    char *result = (char *)malloc(100 * sizeof(char));
    int index = 0;

    while (columnNumber > 0) {
        columnNumber--;                  
        result[index++] = columns[columnNumber % 26];
        columnNumber /= 26;
    }

    result[index] = '\0';
    int left = 0;
    int right = index - 1;

    while (left < right) {
        char temp = result[left];
        result[left] = result[right];
        result[right] = temp;
        left++;
        right--;
    }

    return result;
}