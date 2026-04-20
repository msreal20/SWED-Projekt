public class Developer{

    private String name;
    private int age;
    private String gender;
    private String programminglanguage;
    private String place;

    // Konstruktor
    public Developer(String name, int age, String gender, String programminglanguage, String place) {
        setName(name);
        setAge(age);
        setGender(gender);
        setProgramminglanguage(programminglanguage);
        setPlace(place);
    }

    // Getter & Setter mit Checks

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name darf nicht leer sein");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Alter muss positiv sein");
        }
        this.age = age;
    }

    public String gender() {
        return gender;
    }

    public void setGender(String gender) {
        if (gender == null || gender.isEmpty()) {
            throw new IllegalArgumentException("Gender darf nicht leer sein");
        }
        this.gender = gender;
    }

    public String getProgramminglanguage() {
        return programminglanguage;
    }

    public void setProgramminglanguage(String programminglanguage) {
        if (programminglanguage == null || programminglanguage.isEmpty()) {
            throw new IllegalArgumentException("Sprache darf nicht leer sein");
        }
        this.programminglanguage = programminglanguage;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        if (place == null || place.isEmpty()) {
            throw new IllegalArgumentException("Place darf nicht leer sein");
        }
        this.place = place;
    }

    // Methoden

    public void writingcode() {
        System.out.println(name + " is writing a code.");
    }

    public void communicate() {
        System.out.println(name + " communicates with the members.");
    }

    public void debug() {
        System.out.println(name + " is debugging.");
    }

    public void learnSkill(String skill) {
        System.out.println(name + " learns " + skill);
    }


    public void support() {
        System.out.println(name + "has the knowledge and can support you in many technical area");
    }


    public String getInfo() {
        return name + ", " + age + ", " + gender + ", " +  programminglanguage + ", "+  place;
    }
}
