
public class Stuscore {
	static int count = 0;
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
	{this.no = ++count;}
	Stuscore(){}
	Stuscore(String name,int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor+eng+math;
		this.avg = this.total / 3.0;
	}
}