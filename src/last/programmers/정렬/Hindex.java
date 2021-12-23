package last.programmers.정렬;

public class Hindex {

	public Hindex() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Solution solution = new Solution();
		int[] citations= {3, 0, 6, 1, 5};

		System.out.println(solution.solution(citations));
	}

	static class Solution {
		public int solution(int[] citations) {
			int answer = 0;

			int tempCitations =0;

			for(int i=1; i<citations.length+1; i++) {

				tempCitations =0;

				for(int j=0; j<citations.length; j++) {

					if(citations[j]>=i) {
						tempCitations++;
					}
				}

				if(i<=tempCitations) {
					answer = Math.max(answer, i);
				}
			}

			return answer;

		}
	}

}
