#저축 기간 구하기 (1,000만원을 은행에 저금하고 연 이율이 5%라고 가정했을때
#몇년이 지나야 원금의두배가 넘는지 알아보기)

money = 1000000
year=0

while money <= 2000000:
  money=money+money*0.05
  year=year+1
  
print(str(year)+"년")
