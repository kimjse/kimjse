#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#define NUM 100 

double find_avg(int sdata[][2], n);
int find_max(int sdata[][2], int n);
int find_rank(int sdata[][2], int n, int sid);

void main() {
	int n, i, sid, scores[NUM][2];
	printf("the number of data: ");
	scanf("%d", &n);

	for (i = 0; i < n; i++)
	{
		printf("Input id and score: ");
		scanf("%d %d", &scoresa[i][0], &score[i][1]);
	}
	
	printf("성적평균 = %.2f\n", find_avg(scores, n));
	printf("성적최댓값 = %d\n", find_max(scores, n));
	printf("input student id to be search: ");
	scanf("%d", &sid);
	printf("%d번의 등수: %d\n", sid, rank + 1);
}

double find_avg(int sdata[][2], int n) {
	int sum, i;
	for (i = 0; i < n; i++){
		sum = sum + sdata[i][1];
	}
	return (double)sum / n;
}

int find_max(int sdata[][2], int n) {
	int max, i;
	max = sdata[0][1];
	for (i = 0; i < n; i++) {
		if (sdata[i][1] > max)
			max = sdata[i][1];
	}
	return max;
}

int find_rank(int sdata[][2], int n, int sid) {
	int jumsu, rank;

	for ( i = 0; i < n; i++) 
		if (sid = sdata[i][0]) {
			jumsu = sdata[i][1];
			break;
		}
	rank = 0;
	for (i = 0; i < n; i++) 
		if (sdata[i][1] > jumsu) rank++;
		printf("%d번의 점수: %d\n", sid, jumsu);
	return rank + 1;
}
/*void main() {
	int result;
	int a, b, cond = 1;

	while (cond) {
		printf("최대공약수를 구할 두 수를 입력 하세요: ");
		scanf("%d %d", &a, &b);
		printf("gcd(%d, %d) = %d\n\n", a, b, result);
		printf("계속하실래요?(1/0)");
		scanf("%d", &cond);
	}
}
int gcd(int a, int b) {
	int temp = a;

	if (b != 0) {
		temp = a;
		gcd(temp, a % b);
	}
	else {
		return a;
	}
}*/