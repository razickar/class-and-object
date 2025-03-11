public class MovieDto{

	
	
	private String movieName;
	private String timing;
	private String director;
	private String producer;
	private int budget;
	private boolean isRelaese;
	private String hero;
	private String heroine;
	
	
	
	
	public void addMovie(String movieName,String timing,String director,String producer,int budget,boolean isRelaese,String hero,String heroine){
		
	this.movieName = movieName;	
	this.timing = timing;
	this.director = director;
	this.producer = producer;
	this.budget = budget;
	this.isRelaese = isRelaese;
	this.hero = hero;
	this.heroine = heroine;
	
	}
	 
	public String getMovieName(){
		return movieName;
	}
	public String getTiming(){
		return timing;
	}
	public String getDirector(){
		return director;
	}
	public String getProducer(){
		return producer;
	}
	public int getBudget(){
		return budget;
	}
	public boolean getIsRelaese(){
		return isRelaese;
	}
	public String getHero(){
		return hero;
	}
	public String getHeroine(){
		return heroine;
	}
	
	public void setMovieName(String movieName){
		if(movieName == ""){
		System.out.println("INVALID movieName name");
		}
		else{
		this.movieName = movieName;
		}
	}
	public void setTiming(String timing){
		if(timing == ""){
		System.out.println("INVALID timing name");
		}
		else{
		this.timing = timing;
		}
	}
	public void setDirector(String director){
		if(director.isBlank()){
		System.out.println("INVALID director name");
		}
		else{
		this.director = director;
		}
	}
	public void setProducer(String producer){
		if(producer.isBlank()){
		System.out.println("INVALID producer name");
		}
		else{
		this.producer = producer;
		}
		
	}
	public void setBudget(int budget){
		if(budget > 0){
		this.budget = budget;
		}
		else{
		System.out.println("INVALID BUDGET LEVEL");
		}
	}
	public void setIsRelaese(){
	
		this.isRelaese = isRelaese;
		
	}
	public void setHero(String hero){
		if(hero.isBlank()){
		System.out.println("INVALID hero name");
		}
		else{
		this.hero = hero;
		}
	}
	public void setHeroine(String heroine){
		if(heroine.isBlank()){
		System.out.println("INVALID heroine name");
		}
		else{
		this.heroine = heroine;
		}
	}
	
	
	
	public static void main(String[] args){
	
	
	
	MovieDto padayappa = new MovieDto();
	padayappa.addMovie("Padayappa", "6 PM", "K. S. Ravikumar", "AVM Productions", 150, true, "Rajinikanth", "Ramya Krishnan");
	
	System.out.println(padayappa.getHero()+"    "+padayappa.getMovieName());

		
	
	}

}

