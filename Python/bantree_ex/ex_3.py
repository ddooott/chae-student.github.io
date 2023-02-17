#취득학점 수 입력받아 졸업가능 여부 판단(while, if문 사용)

#초기화
num=0
#몇번 반복할건지
i=1

#반복문(3번 반복)
while i <= 3:
  num = input("취득학점 수: ")
  #조건문(140학점 이상이면)
  if(int(num)>=140):
    print("졸업가능")
    i=i+1
  else:
    print("졸업불가")
    i=i+1
