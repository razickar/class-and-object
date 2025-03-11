public class Director{
	
	
	private String name;
	private int age;
	private String homeTown;
	private String genre;
	
	
	
	public void director(String name,int age,String homeTown,String genre){
	
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

