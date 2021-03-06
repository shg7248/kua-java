import java.util.Scanner;

public class Ex04_08_송학관 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num, studentNum, i;
		int[] score = null; // null : 아무것도 없음을 뜻하는 문자

		while(true) {
			System.out.println("==================================");
			System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료");
			System.out.println("==================================");

			System.out.print("선택>");
			num = sc.nextInt();

			if(num==1) {
				System.out.print("학생수>");
				studentNum = sc.nextInt();
				score = new int[studentNum];
			}
			else if(num==2) {
				if(score == null) {
					System.out.println("경고) 학생수를 입력하세요!");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.print("scores["+i+"]>");
					score[i] = sc.nextInt();
				}
			}
			else if(num==3) {
				if(score == null) {
					System.out.println("경고) 학생수를 입력하세요!");
					continue;
				}
				for(i=0;i<score.length;i++) {
					System.out.println("scores["+i+"]:"+score[i]);
				}
			}
			else if(num==4) {

				int x, y, sum = 0, maxScore, minScore;
				double avg;

				if(score == null) {
					System.out.println("경고) 학생수를 입력하세요!");
					continue;
				}

				// 정렬식
				for(x=0;x<score.length;x++) {
					for(y=x+1;y<score.length;y++) {
						if(score[x]>score[y]) {
							int temp = score[x];
							score[x] = score[y];
							score[y] = temp;
						}
					}
				}

				// 최고점수
				maxScore = score[score.length-1];
				System.out.println("최고점수:" + maxScore);

				// 최하점수
				minScore = score[0];
				System.out.println("최하점수:" + minScore);

				// 합계
				for(int z : score) {
					sum+=z;
				}				
				System.out.println("합계:" + sum);

				// 평균
				avg = sum/(double)score.length;
				System.out.printf("평균:%.1f\n", avg);

				// 정렬 출력
				for(int z : score) {
					System.out.print(z+" ");
				}
				System.out.println();
			}
			else if(num==5) {
				break;
			}
			else {
				System.out.println("경고) 1 ~ 5사이의 번호만 선택이 가능합니다.");
			}
		}	// while
		System.out.println("프로그램 종료");
	}
}

/*
2,3,4 전에 1.학생수 입력받기
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>1
학생수>5
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>3
scores[0]:0
scores[1]:0
scores[2]:0
scores[3]:0
scores[4]:0
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>2
scores[0]>76
scores[1]>32
scores[2]>45
scores[3]>99
scores[4]>10
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>3
scores[0]:76
scores[1]:32
scores[2]:45
scores[3]:99
scores[4]:10
==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>4
최고점수:99
최하점수:10
합계:262
평균:52
10 32 45 76 99 

==================================
1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료
==================================
선택>5
프로그램 종료

 */
