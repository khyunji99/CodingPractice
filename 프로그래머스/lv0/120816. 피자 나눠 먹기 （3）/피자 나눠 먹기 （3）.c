#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// slice : 피자 조각수 , n : 먹는 사람 수
int solution(int slice, int n) {
    // 사람 수 / 피자 조각수 + 1 = 피자 판수
    // 사람 수 % 피자 조각수 == 0 일때
    // 사람 수 / 피자 조각수
    if (n % slice == 0)
        return n / slice;
    else
        return n / slice + 1;
}