#include <stdio.h>
#include <string.h>

// 계정 정보를 담는 구조체 생성
struct account {
  char name[50];
  char password[50];
} typedef account_t;

void change_password(struct account *acc, char *new_password) {
  strcpy(acc->password, new_password);
}

void file_change_password();

int main() {
  // 구조체 값 메모리에 생성
  account_t acc;
  // 구조체 값 초기화
  strcpy(acc.name, "admin");
  strcpy(acc.password, "admin");

  printf("Name: %s\n", acc.name);
  printf("Password: %s\n", acc.password);

  change_password(&acc, "new_password");
  printf("New password: %s\n", acc.password);
  return 0;
}
