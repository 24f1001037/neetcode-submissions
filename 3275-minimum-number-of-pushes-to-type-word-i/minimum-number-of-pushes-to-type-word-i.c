int minimumPushes(char* word) {
    int length = 0;
    while (word[length] != '\0') {
        length++;
    }
    int pushes = 0;
    for (int i = 0; i < length; i++) {
        pushes += (i / 8) + 1;
    }
    return pushes;
}