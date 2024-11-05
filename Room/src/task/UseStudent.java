package task;
public class UseStudent {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.name="fazil";
		s1.id=537;
		s1.section='a';
		s1.mark1=98;
		s1.mark2=99;
		s1.mark3=96;
		s1.total=278;
		
		Student s2=new Student();
		s2.name="udhaya";
		s2.id=538;
		s2.section='b';
		s2.mark1=88;
		s2.mark2=98;
		s2.mark3=99;
		s2.total=285;
		
		Student s3=new Student();
		s3.name="santhanam";
		s3.id=539;
		s3.section='c';
		s3.mark1=95;
		s3.mark2=92;
		s3.mark3=97;
		s3.total=284;
		
		Student[] students= {s1,s2,s3};
		int max=students[0].total;
		for(int i=0;i<students.length;i++) {
			if(students[i].total>=max) {
				max=students[i].total;
				
			}
		}
		System.out.println(max);
		
		Student max1=students[0];
		for(int i=0;i<students.length;i++) {
			if(students[i].total>max1.total) {
				max1=students[i];
				System.out.println(max1.name+max1.id+max1.total);
			}
		}
	}
}
		
