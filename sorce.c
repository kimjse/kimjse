#include <stdio.h>

main(int argc, char* argv[]) {
	int i;
	printf("���α׷� ��� �μ��� ������ %d\n", argc);
	for (i = 0; i < argc; i++)
		printf("%d : %s\n", i, argv[i]);
}