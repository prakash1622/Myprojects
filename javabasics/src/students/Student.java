package students;
public class Student {
		int Sid;
		String Sname;
		String Depatment;
		char Section;
		int G_year;
		long number;
		public int getSid() {
			return Sid;
		}
		public void setSid(int sid) {
			Sid = sid;
		}
		public String getSname() {
			return Sname;
		}
		public void setSname(String sname) {
			Sname = sname;
		}
		public String getDepatment() {
			return Depatment;
		}
		public void setDepatment(String depatment) {
			Depatment = depatment;
		}
		public char getSection() {
			return Section;
		}
		public void setSection(char section) {
			Section = section;
		}
		public int getG_year() {
			return G_year;
		}
		public void setG_year(int g_year) {
			G_year = g_year;
		}
		public long getNumber() {
			return number;
		}
		public void setNumber(long number) {
			this.number = number;
		}
		@Override
		public String toString() {
			return "Student [Sid=" + Sid + ", Sname=" + Sname + ", Depatment=" + Depatment + ", Section=" + Section
					+ ", G_year=" + G_year + ", number=" + number + "]";
		}
		
	}

	