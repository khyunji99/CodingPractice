#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// num_list_len은 배열 num_list의 길이입니다.
int solution(int num_list[], size_t num_list_len) {
    int answer = 0;
    
    if (num_list_len <= 10) {
        answer++;
        for(int i = 0; i < num_list_len; i++) {
            answer *= num_list[i];
        }
    } else {
        for(int i = 0; i < num_list_len; i++) {
            answer += num_list[i];
        }
    }
    
    
    return answer;
}