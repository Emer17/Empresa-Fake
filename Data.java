class Data{
	private int Year;
	private int Month;
	private int Day;
	private int Minute;
	private int Second;
	private String Comment;
	
	public void setYear (int Y){
		this.Year=Y;
	}
	public void setMonth (int M){
		this.Month=M;
	}
	public void setDay (int D){
		this.Day=D;
	}
	public void setMinute (int M){
		this.Minute=M;
		
	}
	public void setSecond(int S){
		this.Second=S;
	}
	public void setComment(String C){
		this.Comment=C;
	}
	
	
	public int getYear (){
		return this.Year;
	}
	public int getMonth (){
		return this.Month;
	}
	public int getDay (){
		return this.Day;
	}
	public int getMinute (){
		return this.Minute;
	}
	public int getSecond(){
		return this.Second;
	}
	public String getComment(){
		return this.Comment;
	}
	
}
