-- 코드를 입력하세요.
-- 몰라서 답 찾아봄,,
-- rownum 활용하면 가장 첫번째 행의 데이터 가져올 수 있다.
SELECT NAME
FROM (SELECT * FROM ANIMAL_INS ORDER BY DATETIME)
WHERE rownum = 1;