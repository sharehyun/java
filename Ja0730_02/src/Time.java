
public class Time {
	private int hour;
	private int minute;
	private int second;
	
	Time(){}
	Time(int hour, int minute, int second){
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//getter, setter를 생성
	public int getHour() {
		return hour;
	}
	public void setHour(int hour) {
		this.hour = hour;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	@Override
	public String toString() {
		return String.format("%d:%d:%d", hour,minute,second);
	}
	
}
