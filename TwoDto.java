public class Director{
	
	
	private String name;
	private int age;
	private String homeTown;
	private String genre;
	
	
	
	public void addDirector(String name,int age,String homeTown,String genre){
	
	this.name = name;
	this.age = age;
	this.homeTown = homeTown;
	this.genre = genre;
	
	}
	
	
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   
    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

   
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


}



public class MovieDto{

	
	
	private String movieName;
	private String timing;
	private String director;
	private String producer;
	private int budget;
	private boolean isRelaese;
	private String hero;
	private String heroine;
	private Director directorDetails;
	
	
	
	
	public void addMovie(String movieName,String timing,String director,String producer,int budget,boolean isRelaese,String hero,String heroine,Director directorDetails){
		
	this.movieName = movieName;	
	this.timing = timing;
	this.director = director;
	this.producer = producer;
	this.budget = budget;
	this.isRelaese = isRelaese;
	this.hero = hero;
	this.heroine = heroine;
	this.directorDetails = directorDetails;
	
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
	public Director getDirectorDetails() {
   		 return directorDetails;
	}

	public void setDirectorDetails(Director directorDetails) {
 		   this.directorDetails = directorDetails;
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
	
	
	Director atlee = new Director();
	atlee.addDirector("ATLEE",29,"CHENNAI","HIT - MOVIES");
	
	MovieDto theriii= new MovieDto();
	theriii.addMovie("Theri","7 PM","Atlee","Kalaipuli S. Thanu",100,true,"Vijay","Samantha",atlee);

	
	Director bio = theriii.getDirectorDetails();
	System.out.println(bio.getName());
		
		
	
	}

}

